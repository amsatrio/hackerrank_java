package org.example;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        if(convertStringToIntChar(A) > convertStringToIntChar(B)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(convertToTitleCaseIteratingChars(A + " " + B));

    }

    public static int convertStringToIntChar(String text){
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(i == 1){
                break;
            }
            count += text.charAt(i);
        }
        return count;
    }

    public static String convertToTitleCaseIteratingChars(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder converted = new StringBuilder();

        boolean convertNext = true;
        for (char ch : text.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                convertNext = true;
            } else if (convertNext) {
                ch = Character.toTitleCase(ch);
                convertNext = false;
            } else {
                ch = Character.toLowerCase(ch);
            }
            converted.append(ch);
        }

        return converted.toString();
    }
}
