package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnCorrectDayOfTheWeekDependsOnGivenNumber() {

        //given
        int monday = 1;
        int tuesday = 2;
        int wednesday = 3;
        int thursday = 4;
        int friday = 5;
        int weekend = 6;
        int weekend2 = 7;

        //when

        String mondayExpected = Main.getDayOfWeek(1);
        String tuesdayExpected = Main.getDayOfWeek(2);
        String wednesdayExpected = Main.getDayOfWeek(3);
        String thursdayExpected = Main.getDayOfWeek(4);
        String fridayExpected = Main.getDayOfWeek(5);
        String weekendExpected = Main.getDayOfWeek(6);
        String weekend2Expected = Main.getDayOfWeek(7);


        //then
        Assertions.assertEquals(mondayExpected,"Monday");
        Assertions.assertEquals(tuesdayExpected,"Tuesday");
        Assertions.assertEquals(wednesdayExpected,"Wednesday");
        Assertions.assertEquals(thursdayExpected,"Thursday");
        Assertions.assertEquals(fridayExpected,"Friday");
        Assertions.assertEquals(weekendExpected,"Weekend");
        Assertions.assertEquals(weekend2Expected,"Weekend");

    }
}