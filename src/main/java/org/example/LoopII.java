package org.example;

import java.util.Scanner;

public class LoopII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        // constraints
        if(t > 500 || t < 0){
            return;
        }
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // constraints
            if(a < 0 || a > 50){
                return;
            }
            if(b < 0 || b > 50){
                return;
            }
            if(n < 1 || n > 15){
                return;
            }

            int sn = a;
            for(int j = 0; j < n; j++){
                Double twoPowN = Math.pow(2,j);
                int twoPowNTimesB = (twoPowN.intValue() * b);
                sn = sn + twoPowNTimesB;
                System.out.print(sn + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
