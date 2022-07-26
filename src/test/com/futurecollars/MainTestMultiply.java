package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest3 {

    @Test
    void multiply() {
        int multiplyValue = 5;
        int multiplyValue2 = 7;
        Main.multiply(5, 7);
        //when
        int multiplyResultExpected = Main.multiply(5,7);
        Assertions.assertEquals(multiplyResultExpected, 35);

    }
}