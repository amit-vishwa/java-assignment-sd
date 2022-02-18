// Write Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

package com.company;
import java.util.*;

class ArrayListIteration {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

    public void usingForLoop() {
        System.out.println("Iterating ArrayList using For Loop :");
        for (int i = 0; i < numbers.size(); i++)
            // Printing and display the elements in ArrayList
            System.out.print(numbers.get(i) + " ");
    }

    public void usingWhileLoop() {
        System.out.println("\n\nIterating ArrayList using While Loop :");
        int val = 0;
        while (numbers.size() > val) {
            System.out.print(numbers.get(val) + " ");
            val++ ;
        }
    }

    public void usingAdvanceForLoop() {
        System.out.println("\n\nIterating ArrayList using Advance For Loop (ForEach Loop) :");
        for(int i:numbers) System.out.print(i+" ");
    }
}

public class question3 {
    public static void main(String[] args) {
        ArrayListIteration ali = new ArrayListIteration();
        ali.usingForLoop();
        ali.usingWhileLoop();
        ali.usingAdvanceForLoop();
    }
}
