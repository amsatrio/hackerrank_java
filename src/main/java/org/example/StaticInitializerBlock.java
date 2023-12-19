package org.example;

import java.util.Scanner;

public class StaticInitializerBlock {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if(b < -100 || b > 100 || h < -100 || h > 100){
            return;
        }
        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return;
        }

        System.out.println(h*b);
    }
}
