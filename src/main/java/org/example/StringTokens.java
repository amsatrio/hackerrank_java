package org.example;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String output = stringTokens2(s);
        System.out.println(output);
        scan.close();
    }

    public static String stringTokens(String s){
        // constraint
        if(s.isEmpty() || s.length() > 4*Math.pow(10,5)){
            return "";
        }

        String temp = "";
        boolean separated = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ' || chars[i] == '!' || chars[i] == ',' || chars[i] == '?' || chars[i] == '.' || chars[i] == '_' || chars[i] == '\'' || chars[i] == '@'){
                if(i == chars.length - 1){
                    continue;
                }
                if(i == 0 || temp.isEmpty()){
                    continue;
                }
                if(separated){
                    continue;
                }
                separated = true;
            } else {
                separated = false;
            }
            if(separated){
                temp += '\n';
                continue;
            }
            temp += chars[i];
        }

        if(temp.isEmpty()){
            return "0";
        }

//        System.out.println(temp);
        int length = temp.split("\n").length;


        return length+"\n"+temp;
    }

    public static String stringTokens2(String s){
        if(s.trim().replace(" ", "").isEmpty()){
            return "0";
        }
        String[] tokens = s.trim().split("[!,?.*_'@ ]+");
        int size = tokens.length;
        if(size == 0){
            return "0";
        }
        String output = size+"";
        for (String token : tokens) {
            output += "\n" + token;
        }

        return output;
    }
}
