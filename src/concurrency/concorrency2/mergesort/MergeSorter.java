package concurrency.concorrency2.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> toSortList;

    public MergeSorter(List<Integer> toSortList) {
        this.toSortList = toSortList;
    }
    @Override
    public List<Integer> call() throws Exception {

        System.out.println("Debug from thread: "+ Thread.currentThread().getName());
        if(toSortList.size() == 1) {
            return toSortList;
        }

        int mid = toSortList.size()/2;

        List<Integer> leftUnsortedHalf = new ArrayList<>();
        for(int i = 0; i < mid; i++) {
            leftUnsortedHalf.add(toSortList.get(i));
        }

        List<Integer> rightUnsortedHalf = new ArrayList<>();
        for(int i = mid; i < toSortList.size(); i++) {
            rightUnsortedHalf.add(toSortList.get(i));
        }

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter leftSorter = new MergeSorter(leftUnsortedHalf);
        Future<List<Integer>> leftSortedHalfFuture = executorService.submit(leftSorter);


        MergeSorter rightSorter = new MergeSorter(rightUnsortedHalf);
        Future<List<Integer>> rightSortedHalfFuture = executorService.submit(rightSorter);


        List<Integer> leftSortedHalf = leftSortedHalfFuture.get();
        List<Integer> rightSortedHalf = rightSortedHalfFuture.get();

        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while( i < leftUnsortedHalf.size() && j < rightUnsortedHalf.size() ) {
            if(leftSortedHalf.get(i) < rightSortedHalf.get(j)) {
                mergedList.add(leftSortedHalf.get(i));
                i++;
            } else {
                mergedList.add(rightSortedHalf.get(j));
                j++;
            }
        }

        while( i < leftSortedHalf.size()) {
            mergedList.add(leftSortedHalf.get(i));
            i++;
        }

        while( j < rightSortedHalf.size()) {
            mergedList.add(rightSortedHalf.get(j));
            j++;
        }
        return mergedList;
    }
}
