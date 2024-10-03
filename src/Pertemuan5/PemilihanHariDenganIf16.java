package Pertemuan5;

import java.util.Scanner;

public class PemilihanHariDenganIf16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayNumber, dayType, dayName = ""; 

        System.out.print("Input day number: ");
        dayNumber = sc.nextLine();

        if (dayNumber.equals("1")) {
            dayName = "Monday";
            dayType = "weekday";
        } else if (dayNumber.equals("2")) {
            dayName = "Tuesday";
            dayType = "weekday";
        } else if (dayNumber.equals("3")) {
            dayName = "Wednesday";
            dayType = "weekday";
        } else if (dayNumber.equals("4")) {
            dayName = "Thursday";
            dayType = "weekday";
        } else if (dayNumber.equals("5")) {
            dayName = "Friday";
            dayType = "weekday";
        } else if (dayNumber.equals("6")) {
            dayName = "Saturday";
            dayType = "weekend";
        } else if (dayNumber.equals("7")) {
            dayName = "Sunday";
            dayType = "weekend";
        } else {
            dayType = "invalid day number"; 
            dayName = "Unknown"; 
        }

        System.out.println(dayName + " is a " + dayType);
    }
}
