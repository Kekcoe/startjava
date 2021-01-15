package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public int getFirstNumb() {
        return firstNumb;
    }

    public int getSecondNumb() {
        return secondNumb;
    }

    public char getSign() {
        return sign;
    }

    private final int firstNumb;
    private final int secondNumb;
    private final char sign;

    public Calculator(String mathExpression) {
        String[] arrExpression = mathExpression.split(" ");
        firstNumb = Integer.parseInt(arrExpression[0]);
        sign = arrExpression[1].charAt(0);
        secondNumb = Integer.parseInt(arrExpression[2]);
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return Math.addExact(firstNumb, secondNumb);
            case '-':
                return firstNumb - secondNumb;
            case '*':
                return firstNumb * secondNumb;
            case '/':
                return firstNumb / secondNumb;
            case '^':
                return (int) Math.pow(firstNumb, secondNumb);
            case '%':
                return (firstNumb % secondNumb);
            default:
                System.out.println("Введи знак мат.операции " + " + " + " - " + " * " + " / " + " ^ " + " % ");
            return 0;
        }

    }

}
