package oops4.interfaces;

public class Client {

    //Animal a = new Animal() ;



    public static void main(String[] args) {

        Animal a1 = new Cat();

        Animal a2 = new Dog();

        System.out.println(a1.var);
        System.out.println(a2.var);

        // Attributes in interface are considered constants
        // a1.var = 20;
    }

}
