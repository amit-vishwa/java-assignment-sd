// Write A Java Program to count the number of duplicate words in a string using HashMap

package com.company;
import java.util.HashMap;

public class question2 {
    public static void main(String[] args) {
        String str = "Write a Java Program to count the number of words in a string using HashMap";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {

            // Asking whether the HashMap contains the key or not. Will return null if not.
            Integer integer = hashMap.get(word);
            if (integer == null)
                // Storing the word as key and its occurrence as value in the HashMap.
                hashMap.put(word, 1);
            else {
                // Incrementing the value if the word is already present in the HashMap.
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
