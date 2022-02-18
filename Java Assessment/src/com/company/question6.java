// Given  a  String,  find  the  first  repeated  character  in  it  using  Stream functions.

package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class question6 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println("Entered string is '"+str+"'");
        Map<Character, Long> collect =  str.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstRepeat = collect.entrySet()
                .stream().
                filter( (e) -> e.getValue() > 1).
                map(e -> e.getKey()).findFirst();

        System.out.println("The first repeated character in given string is '" + firstRepeat.orElse(null)+"'");
    }
}
