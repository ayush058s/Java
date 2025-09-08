package oops.polyMorphism;

import oops.singleton_03.Circle;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes Triangle = new Triangle();
        Square square = new Square();

        shape.area();

    }



    // Types
    /*
    1) Compile Time / Static PolyMorphism
         -> achieved by Method Overloading
         -> MO = same name but types, argument, return type, ordering can be different
         -> MO ex is multiple constructor
         -> checking which method to call is done at compile time that's why

    2) Run Time / Dynamic PolyMorphism
         -> achieved by Method Overriding
         -> Upcasting = which method will be called depend on object this is known as upcasting
         -> Parent obj = new Child();

         * DYNAMIC DISPATCH = Java decides which version of a method to execute at runtime
            based on the actual object type, not the reference type.

     */
}
