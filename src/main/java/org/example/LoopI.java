package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        // constraints
        if(N < 2 || N > 20){
            return;
        }

        //output
        for(int i = 0; i < 10; i++){
            System.out.println(N+" x "+(i+1) + " = " + N*(i+1));
        }
    }
}
