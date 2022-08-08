public class Calculator {
  
   public static void main(String[] args) {

        System.out.println(add(6, 7));
        System.out.println(subtract(108, 9));
        System.out.println(multiply(5, 7));
        System.out.println(divide(100, 2));
    }

    public int add(int a, int b) {

        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}

