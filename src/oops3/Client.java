package oops3;

public class Client {

    public static void main(String[] args) {
        User u = new User();
        u.login();
        // u.doSomething(); cannot do

        Instructor i = new Instructor();
        i.login();
        i.doSomething();
    }
}
