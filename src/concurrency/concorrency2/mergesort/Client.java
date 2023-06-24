package concurrency.concorrency2.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1, 5,2,4,3,8,6,7,9);

        MergeSorter mergeSorter = new MergeSorter(list);

        System.out.println(mergeSorter.call());
    }
}
