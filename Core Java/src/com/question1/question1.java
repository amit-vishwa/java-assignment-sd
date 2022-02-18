// Implement your  own abstract  classes and  interfaces

package com.question1;

// Interface - Here methods are declared, but they should be called in class only by overriding
interface Parent {
    void func();
}

// Class 1 - Abstract class with at least one abstract method
abstract class Base {
    abstract void fun();
}

// Class 2 - Normal class that extends abstract class for function overriding
class Derived extends Base implements Parent {
    void fun(){
        System.out.println("Base's fun() from Derived class called");
    }
    public void func(){
        System.out.println("Interface's func() from Derived class called");
    }
}

// Class 3 - Main class
public class question1 {
    public static void main(String[] args)
    {
        // Uncommenting the following line will cause compiler error as the line tries to create an instance of abstract class.
        // Base b = new Base();

        // We can have references of Base type.
        Base b = new Derived();
        Parent p = new Derived();
        System.out.println();
        b.fun();
        p.func();
    }
}
