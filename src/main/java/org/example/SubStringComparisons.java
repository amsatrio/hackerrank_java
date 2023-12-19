package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class SubStringComparisons {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();

        String s = "welcometojava";
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        if (!s.matches("^[a-zA-Z]*$")) {
            return "";
        }
        if (s.isEmpty() || s.length() > 1000) {
            return "";
        }

        int totalData = 0;
        int totalDataTemp = s.length();
        for (int i = 0; i < totalDataTemp; i++) {
            if(i + k == totalDataTemp){
                break;
            }
            totalData++;
        }
        totalData = totalData + 1;
        String[] arrayStrings = new String[totalData];
//        System.out.println(s.length());
//        System.out.println(totalData);

        for (int i = 0; i < s.length(); i++) {
            if (i + k - 1 >= s.length()) {
                continue;
            }
            String tempKWords = "";
            for (int j = 0; j < k; j++) {
                tempKWords += s.charAt(i + j);
            }
//            System.out.println(tempKWords);
            arrayStrings[i] = tempKWords;
        }

//        System.out.println(Arrays.toString(arrayStrings));
//        System.out.println(Arrays.toString(arrayStrings));
//        System.out.println();

        String temp = "";
        for (int i = 0; i < arrayStrings.length; i++) {
            for (int j = 0; j < arrayStrings.length; j++) {
                if(arrayStrings[i] == null || arrayStrings[j] == null){
                    continue;
                }
                for (int l = 0; l < k; l++) {
                    if(arrayStrings[i].charAt(l) < arrayStrings[j].charAt(l)){
                        temp = arrayStrings[i];
                        arrayStrings[i] = arrayStrings[j];
                        arrayStrings[j] = temp;

                        break;
                    } else if(arrayStrings[i].charAt(l) > arrayStrings[j].charAt(l)){
                        break;
                    }
                }
//                System.out.print(i + "," + j + " ");
            }
//            System.out.println(Arrays.toString(arrayStrings));
        }

//        System.out.println(Arrays.toString(arrayStrings));

        smallest = arrayStrings[0];
        largest = arrayStrings[arrayStrings.length - 1];

        return smallest + "\n" + largest;
    }

}
