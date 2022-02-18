// Given  a  String,  find  the  first  non-repeated  character  in  it  using  Stream functions.

package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class question7 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println("Entered string is '"+str+"'");
        Map<Character, Long> collect =  str.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstNonRepeat = collect.entrySet()
                .stream()
                .filter( (e) -> e.getValue() == 1)
                .map(e -> e.getKey()).findFirst();

        System.out.println("The first non-repeated character in given string is '" + firstNonRepeat.orElse(null)+"'");
    }
}
