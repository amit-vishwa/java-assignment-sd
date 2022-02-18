// Take the FindDups example and modify it to use a SortedSet instead of a Set.
// Specify a Comparator so that case is ignored when sorting and identifying set elements.

package com.company;
import java.util.*;

public class question2 {

    static final Comparator<String> IGNORE_CASE_ORDER = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<String>(IGNORE_CASE_ORDER);
        String[] arr = {"Java","Python", "javascript", "react","React","java"};
        Collections.addAll(s, arr);
        System.out.println("\n"+s.size() + " distinct words from given array are : " + s);
    }
}
