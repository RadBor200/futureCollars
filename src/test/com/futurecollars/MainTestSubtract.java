package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest2 {

    @Test
    void subtract() {
        int divideValue = 100;
        int divideValue2 = 2;
        Main.divide(100, 2);
        //when
        int subtractResultExpected = Main.subtract(108, 9);
        Assertions.assertEquals(subtractResultExpected, 99);
    }
}