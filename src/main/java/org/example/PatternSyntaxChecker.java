package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = "";
            try{
                pattern = in.nextLine();
            }catch(Exception exception){
                break;
            }
            //Write your code

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (Exception exception){
                System.out.println("Invalid");
            }
        }
    }
}
