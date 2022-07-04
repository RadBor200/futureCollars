package com.futurecollars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldBeOfAge() {
        //given
        int age = 18;

        //when
        boolean result = Main.isOfAge(18);
        Assertions.assertEquals(result, true);
    }

    @Test
    void shouldNotBeOfAge() {
        //given
        int age = 13;

        //when
        boolean result = Main.isOfAge(13);
        Assertions.assertEquals(result, false);
    }
}