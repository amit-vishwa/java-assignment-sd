// Write a program that prints its arguments in random order. Do not make a copy of the argument array.
// Demonstrate how to print out the elements using both streams and the traditional enhanced for statement

package com.company;
import java.util.*;

public class question1 {
    public static void main(String[] args) {

        // Get and shuffle the list of arguments
        List<Integer> argList = Arrays.asList(1,2,3,4,5);
        Collections.shuffle(argList);

        // Print out the elements using JDK 8 Streams
        System.out.print("\nPrinting the elements using JDK 8 streams : ");
        argList.stream().forEach(e->System.out.format("%d ",e));

        // Print out the elements using for-each
        System.out.print("\nPrinting the elements using traditional enhanced for statement : ");
        for (Integer arg: argList) {
            System.out.format("%d ", arg);
        }
        System.out.println();
    }
}
