package org.example;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            if(s1.length() > 10){
                continue;
            }
            if(x < 0 || x > 999){
                continue;
            }
            String s2 = ""+x;
            if(x < 100){
                s2 = "0"+x;
            }
            if(x == 0){
                s2 = "0" + s2;
            }
            System.out.printf("%-15.15s%-3.3s%n", s1,s2);
        }
        System.out.println("================================");

    }
}
