package oops3.constructorchaining;

public class C extends B {
    C() {
        System.out.println("Const. from C");;
    }

    C(String s) {
        System.out.println("Argument constructor from C.");
    }
}
