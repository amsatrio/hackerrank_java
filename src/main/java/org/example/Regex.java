package org.example;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

    public String getPattern(){
        return new MyRegex().pattern;
    }
}

class MyRegex{
    public String pattern = "^(?!.*\b[1-9][0-9]{3,}\b)(?!25[6-9]|2[6-9][0-9]|[3-9][0-9]{2})[0-9]{1,3}.(?!.*\b[1-9][0-9]{3,}\b)(?!25[6-9]|2[6-9][0-9]|[3-9][0-9]{2})[0-9]{1,3}.(?!.*\b[1-9][0-9]{3,}\b)(?!25[6-9]|2[6-9][0-9]|[3-9][0-9]{2})[0-9]{1,3}.(?!.*\b[1-9][0-9]{3,}\b)(?!25[6-9]|2[6-9][0-9]|[3-9][0-9]{2})[0-9]{1,3}$";
}
