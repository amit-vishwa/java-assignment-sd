// Given  a  String,  find  the  first  repeated  character  in  it  using  Stream functions.

package com.company;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println("Entered string is '"+str+"'");
        Map<Character, Long> collect =  str.chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        //collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

//        Optional<Character> firstNonRepeat = collect.entrySet()
//                .stream()
//                .filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
//
//        if(firstNonRepeat.isPresent()) {
//            System.out.println("First non repeating:" + firstNonRepeat.get());
//        }

        Optional<Character> firstRepeat = collect.entrySet()
                .stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("The first repeated character in given string is '" + firstRepeat.orElse(null)+"'");
    }
}
