package org.example;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();

        if(S.length() < 1 || S.length() > 100){
            return;
        }
        if(start >= end){
            return;
        }
        if(start < 0 || end > S.length()){
            return;
        }
        if(S.equals("") || S.equals(null)){
            return;
        }
        if(!S.matches("^[a-zA-Z]*$")){
            return;
        }


        String output = "";
        for(int i = 0; i < S.length(); i++){
            if(i >= start && i < end){
                output += S.charAt(i);
            }
        }
        System.out.println(output);
    }
}
