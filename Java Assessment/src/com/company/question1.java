// Write a Java Program to iterate HashMap using While and advance for loop.

package com.company;
import java.util.Iterator;
import java.util.HashMap;

class HashMapIteration{

    private HashMap<Integer, String> hm = new HashMap<Integer, String>();
    private HashMap<String,String> map = new HashMap<String,String>();

    public void usingWhileLoop(){
        hm.put(11,"Ravi");
        hm.put(12,"Prateek");
        hm.put(13, "Davesh");
        hm.put(14, "Kamal");
        hm.put(15, "Pawan");
        Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method
        while(it.hasNext())
        {
            int key=(int)it.next();
            System.out.println("Roll no.: "+key+"     name: "+hm.get(key));
        }
    }

    public void usingAdvanceForLoop(){
        map.put("TCS","$100 billion");
        map.put("Wipro","$21.5 billion");
        //iteration over map using forEach() method
        map.forEach((k,v) -> System.out.println("Company: " + k + ", Net worth: "+ v));
    }
}

public class question1 {
    public static void main(String[] arg)
    {
        HashMapIteration hmi = new HashMapIteration();
        System.out.println("HashMap iteration using while loop :");
        hmi.usingWhileLoop();
        System.out.println("\nHashMap iteration using advanced for loop (for each loop) :");
        hmi.usingAdvanceForLoop();
    }
}
