package oops.abstractDemo;

public class Daughter extends Parent {



    // all abstract method should be implemented in its subclass
    @Override
    void career() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love IronMan");
    }
}
