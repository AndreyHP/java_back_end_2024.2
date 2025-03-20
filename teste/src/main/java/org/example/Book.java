package org.example;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Book {
     String name;
     int    price;
     String author;
     boolean onSale;

    public void showContent(){
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void makePromo(){

        ZonedDateTime currentTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2025, 3, 19,
                21, 36, 0, 0, ZoneId.of("America/Sao_Paulo"));
        String formattedDateTime = currentTime.format(formatter);

        // Check if the current time is after the specific time
        if (currentTime.isAfter(specificZonedDateTime)) {
            System.out.println("The Book is on Sale!");
            onSale = true;
        } else {
            System.out.println("Wait until Sale!");
            onSale = false;
        }
    }
}
