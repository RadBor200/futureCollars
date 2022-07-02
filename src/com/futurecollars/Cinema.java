package com.futurecollars;

public class Cinema {
        private int seatNumber;
        private int rowOfTheSeats;
        private String seatTaken;
        private String seatFree;

        public int getSeatNumber() {
            return seatNumber;
        }

        public void setSeatNumber(int seatNumber) {
            this.seatNumber = seatNumber;
        }

        public int getRowOfTheSeats() {
            return rowOfTheSeats;
        }

        public void setRowOfTheSeats(int rowOfTheSeats) {
            this.rowOfTheSeats = rowOfTheSeats;
        }

        public String getSeatTaken() {
            return seatTaken;
        }

        public void setSeatTaken(String seatTaken) {
            this.seatTaken = seatTaken;
        }

        public String getSeatFree() {
            return seatFree;
        }

        public void setSeatFree(String seatFree) {
            this.seatFree = seatFree;
        }

        public Cinema(int seatNumber, int rowOfTheSeats, String seatTaken, String seatFree) {
            this.seatNumber = seatNumber;
            this.rowOfTheSeats = rowOfTheSeats;
            this.seatTaken = seatTaken;
            this.seatFree = seatFree;
        }
    }

