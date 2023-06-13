package oops2.folder2;

public class Student {
    public int age;
    private String name;
    protected double psp;
    String university;

    public void doSomething() {
        age = 10;
        name = "ishan";
        psp = 100;
        university = "IIT";
    }

    public Student() {}
    public Student(String newName) {
        name = newName;
    }
}
