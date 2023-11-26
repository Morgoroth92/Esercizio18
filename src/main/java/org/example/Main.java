package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        LocalDateTime date = LocalDateTime.parse(dateString, DateTimeFormatter.ISO_DATE_TIME);

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        String dayOfTheWeek = date.getDayOfWeek().toString();

        System.out.println("The year is: " + year);
        System.out.println("The month is: " + month);
        System.out.println("The day is: " + day);
        System.out.println("They day of the week is: " + dayOfTheWeek);
    }
}