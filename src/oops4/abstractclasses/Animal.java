package oops4.abstractclasses;

  public abstract class  Animal {

    int legs;

    public int getLegs() {
        return legs;
    }

    public Animal() {

    }
    public Animal(int l) {
      legs = l;
    }
   // an abstract class may or may not have an abstract method

    // But if a class has even 1 abstract method, it should also be absract
    abstract public void walk();
}
