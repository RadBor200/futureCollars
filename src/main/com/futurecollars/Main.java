package com.futurecollars;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(6, 7));
        System.out.println(subtract(108, 9));
        System.out.println(multiply(5, 7));
        System.out.println(divide(100, 2));
    }
    public static int add(int a, int b) {

        int addResult = a + b;
        return addResult;
    }
    public static int subtract(int a, int b) {
        int subtractResult = a - b;
        return subtractResult;
    }
    public static int multiply(int a, int b) {
        int muliplyResult = a * b;
        return muliplyResult;
    }
    public static int divide(int a, int b){
        int divideResult = a / b;
        return divideResult;
    }
}
