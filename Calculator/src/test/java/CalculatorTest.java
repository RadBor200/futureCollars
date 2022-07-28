import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
  
   @Test
    void shouldAdd() {
        int addValue1 = 6;
        int addValue2 = 7;

        int addResult = Calculator.add(6, 7);
        Assertions.assertEquals(addResult, 13);
    }

    @Test
    void shouldSubtract() {
        int subtractValue1 = 108;
        int subtractValue2 = 9;

        int subtractResult = Calculator.subtract(100, 9);
        Assertions.assertEquals(subtractResult, 91);
    }

    @Test
    void shouldMultiply() {
        int multiplyValue1 = 5;
        int multiplyValue2 = 7;

        int multiplyResult = Calculator.multiply(5,7);
        Assertions.assertEquals(multiplyResult, 35);
    }

    @Test
    void shouldDivide() {
        int divideValue1 = 100;
        int divideValue2 = 2;

        int divideResult = Calculator.divide(100,2);
        Assertions.assertEquals(divideResult, 50);
    }
}
 
