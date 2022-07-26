package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest4 {

    @Test
    void divide() {
        int divideValue = 100;
        int divideValue2 = 2;
        Main.divide(100, 2);

        //when
        int divideResultExpected = Main.divide(100,2);
        Assertions.assertEquals(divideResultExpected, 50);
    }
}