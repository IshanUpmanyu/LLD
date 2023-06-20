package oops4.abstractclasses;

public class Client {

    public static void main(String[] args) {
        // Animal a = new Animal();

        Animal a = new Dog();
        a.legs = 10;

        a.walk();
    }
}
