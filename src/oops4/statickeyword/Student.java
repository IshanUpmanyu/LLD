package oops4.statickeyword;

public class Student {

    String name;
    static String university;
    int age;

    public static void printUniversity() {
        System.out.println(university);
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(university);
    }

    public Student() {
        university = "";
    }
}
