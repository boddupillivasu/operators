package com.operators.java;

public class Operators {
    public static void main(String[] args) {


        //assign,operators

        short salary;
        salary = 25000;
        int incSalary;
        incSalary = salary + (salary * 10) / 100;
        System.out.println("the incremented salary:" + incSalary);

        // ternary operators

        byte number;
        number = 10;
        int result;

        if (number % 2 == 0)

            result = 10;
        else
            result = 20;

        result = number % 2 == 0 ? 10 : 20;
        System.out.println("the result is:" + result);


    }
}
