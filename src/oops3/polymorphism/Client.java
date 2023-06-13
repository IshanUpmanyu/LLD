package oops3.polymorphism;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
        User u = new Student();
        u.name = "Ishan";

        // You can only access variables of User from u.
        // u.batchName = "A"; ERROR

        //Student s = new User(); ERROR

        Student s = (Student) (new User());
        // s.batchName; ERROR


        User user = getUser();



       // Student student = (Student) getUser();

        Student s1 = new Student();
        s1.name = "Student";

        Instructor i1 = new Instructor();
        i1.name = "Instructor";

        printUser(s1);
        printUser(i1);


    }

    public static void printUser(User u) {
        System.out.println("User name is: "+ u.name);
    }

    public static User getUser() {

        Random r = new Random();
        if(r.nextInt() %2 == 0) {
            return new Instructor();
        } else {
            return new Student();
        }
    }
}
