package com.futurecollars;

public class Main {
    public static void main(String[] args) {
        Cinema numberOne = new Cinema(1, 5, "Seat Taken", "Seat Free");
        Cinema numberTwo = new Cinema(2, 9, "Seat Taken", "Seat Free");
        Cinema numberThree = new Cinema(3, 4, "Seat Taken", "Seat Free");

        System.out.println("Seat number: " + numberOne.getSeatNumber());
        System.out.println("Row number: " + numberOne.getRowOfTheSeats());
        System.out.println("Is seat taken? " + numberOne.getSeatFree());

        System.out.println("Seat number: " + numberTwo.getSeatNumber());
        System.out.println("Row number: " + numberTwo.getRowOfTheSeats());
        System.out.println("Is seat taken? " + numberTwo.getSeatTaken());

        System.out.println("Seat Number: " + numberThree.getSeatNumber());
        System.out.println("Row Number: " + numberThree.getRowOfTheSeats());
        System.out.println("Seat Taken? " + numberThree.getSeatFree());
    }
}
