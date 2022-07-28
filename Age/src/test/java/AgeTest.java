import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {

        @Test
        void shouldBeOfAge() {

            int age = 18;

            boolean result = Age.isOfAge(18);
            Assertions.assertEquals(result, true);
        }
    @Test
    void shouldBeOfAge2() {

        int age = 20;

        boolean result = Age.isOfAge(20);
        Assertions.assertEquals(result, true);
    }
        @Test
        void shouldNotBeOfAge() {

            int age = 13;

            boolean result = Age.isOfAge(13);
            Assertions.assertEquals(result, false);
        }
    }
