import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class daysOfWeekTest {

    @Test
    void shouldReturnCorrectDayOfTheWeekDependsOnGivenNumber1() {

        int monday = 1;

        String mondayExpected = daysOfWeek.getDayOfWeek(1);
        Assertions.assertEquals(mondayExpected, "Monday");
    }

    @Test
    void shouldReturnCorrectDayOfTheWeekDependsOnGivenNumber2() {

        int tuesday = 2;

        String tuesdayExpected = daysOfWeek.getDayOfWeek(2);
        Assertions.assertEquals(tuesdayExpected, "Tuesday");
    }

    @Test
    void shouldReturnCorrectDayOfTheWeekDependsOnGivenNumber3() {

        int wednesday = 3;

        String wednesdayExpected = daysOfWeek.getDayOfWeek(3);
        Assertions.assertEquals(wednesdayExpected, "Wednesday");
    }

    @Test
    void shouldReturnCorrectDayOfTheWeekDependsOnGivenNumber4() {

        int thursday = 4;

        String thursdayExpected = daysOfWeek.getDayOfWeek(4);
        Assertions.assertEquals(thursdayExpected, "Thursday");
    }

    @Test
    void shouldReturnCorrectDayOfTheWeekDependsOnGivenNumber5() {

        int friday = 5;

        String fridayExpected = daysOfWeek.getDayOfWeek(5);
        Assertions.assertEquals(fridayExpected, "Friday");
    }

    @Test
    void shouldReturnCorrectDayOfTheWeekDependsOnGivenNumber6() {
    
        int weekend = 6;
       
    String weekendExpected = daysOfWeek.getDayOfWeek(6);
    Assertions.assertEquals(weekendExpected, "Weekend");
    }
        
   @Test
   void shouldReturnCorrectDayOfTheWeekDependsOnGivenNumber7() {
   
       int weekend2 = 7;
       
   String weekend2Expected = daysOfWeek.getDayOfWeek(7);
   Assertions.assertEquals(weekend2Expected, "Weekend");
   }
}
