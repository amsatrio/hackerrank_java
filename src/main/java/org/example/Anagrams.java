package org.example;

import java.util.Scanner;

public class Anagrams {
    public static boolean isAnagram(String a, String b) {
        // constraints
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.isEmpty() || b.isEmpty()){
            throw new RuntimeException("string length too small");
        }
        if(a.length() > 50 || b.length() > 50){
            throw new RuntimeException("string length too big");
        }
        if(!a.matches("^[a-z]*$") || !b.matches("^[a-z]*$")){
            throw new RuntimeException("string must alphabet");
        }
        if(a.length() != b.length()){
            return false;
        }

        // Complete the function
        char[] arrayCharA = sortCharArray(a.toCharArray());
        char[] arrayCharB = sortCharArray(b.toCharArray());

        for (int i = 0; i <arrayCharA.length; i++) {
            if(arrayCharA[i] != arrayCharB[i]){
                return false;
            }
        }



        return true;
    }

    public static char[] sortCharArray(char[] array){
        char temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();


        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
