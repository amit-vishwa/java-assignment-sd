// Implement your own encapsulating classes

package com.question2;

class EncapsulationDemo {
    // private members so that they can only be called by methods within class
    private int num1;
    private int num2;

    //getters and setters
    public int getNum1() { return num1; }
    public void setNum1(int num1) { this.num1 = num1; }
    public int getNum2() { return num2; }
    public void setNum2(int num2) { this.num2 = num2; }
}

public class question2 {
    public static void main(String[] args){
        EncapsulationDemo ed = new EncapsulationDemo();
        ed.setNum1(5);
        ed.setNum2(4);
        System.out.println("\nMultiplication of two numbers is " + ed.getNum1() * ed.getNum2());
    }
}
