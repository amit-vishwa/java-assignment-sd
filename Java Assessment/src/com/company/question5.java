// Write a Java Program to find the second-highest number in an array.

package com.company;
import java.util.*;

public class question5 {
    public static int getSecondLargest(Integer[] x, int total){
        List<Integer> list=Arrays.asList(x);
        Collections.sort(list);
        int element=list.get(total-2);
        return element;
    }
    public static void main(String args[]){
        Integer a[]={8,6,5,2,0};
        System.out.println("Second highest number in given array is : "+getSecondLargest(a,a.length));
    }
}
