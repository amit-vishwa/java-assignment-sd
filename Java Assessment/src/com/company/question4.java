// Write a Java Program to find the duplicate characters in a string.

package com.company;

public class question4 {
    public static void main(String[] args) {
        String str = "Hello world";
        int count;

        //Converts given string into character array
        char[] str1 = str.toCharArray();

        System.out.print("Duplicate characters in a given string '"+str+"' are : ");
        //Counts each character present in the string
        for(int i = 0; i <str1.length; i++) {
            count = 1;
            for(int j = i+1; j <str1.length; j++) {
                if(str1[i] == str1[j] && str1[i] != ' ') {
                    count++;
                    //Set string1[j] to 0 to avoid printing visited character
                    str1[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && str1[i] != '0')
                System.out.print(str1[i]+" ");
        }
    }
}
