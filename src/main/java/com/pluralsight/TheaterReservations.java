package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first and last name:");
        String fullName = myScanner.nextLine().trim();
        System.out.println("Enter the date of the show (MM/DD/YYYY):");
        String date = myScanner.nextLine().trim();
        System.out.println("Enter the number of tickets you'd like:");
        int numberofTickets = myScanner.nextInt();

        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1, fullName.length());

        if(numberofTickets == 1){
            System.out.println(numberofTickets + " ticket reserved for " + date + " under " + lastName + "," + " " + firstName);
        }else{
            System.out.println(numberofTickets + " tickets reserved for " + date + " under " + lastName + "," + " " + firstName);
        }

    }
}
