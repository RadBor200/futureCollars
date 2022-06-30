package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add() {
        int addValue = 6;
        int addValue2 = 7;
        Main.add(6, 7);
        //when
        int addResultExpected = Main.add(6, 7);
        Assertions.assertEquals(addResultExpected, 13);
    }
}