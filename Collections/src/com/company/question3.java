// Write a method that takes a List<String> and applies String.trim to each element

package com.company;
import java.util.*;

public class question3 {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" red ", " white ", " blue ");
        listTrim(l);
        System.out.println();
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}
