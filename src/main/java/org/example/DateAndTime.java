package org.example;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        System.out.println("year: " + year);
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try{
            System.out.println(simpleDateFormat.format(calendar.getTime()));
        }catch(Exception exception){
            //
        }


        if(dayOfWeek == Calendar.SUNDAY){
            return "SUNDAY";
        }
        if(dayOfWeek == Calendar.MONDAY){
            return "MONDAY";
        }
        if(dayOfWeek == Calendar.TUESDAY){
            return "TUESDAY";
        }
        if(dayOfWeek == Calendar.WEDNESDAY){
            return "WEDNESDAY";
        }
        if(dayOfWeek == Calendar.THURSDAY){
            return "THURSDAY";
        }
        if(dayOfWeek == Calendar.FRIDAY){
            return "FRIDAY";
        }
        if(dayOfWeek == Calendar.SATURDAY){
            return "SATURDAY";
        }


        return String.valueOf(dayOfWeek);
    }

}