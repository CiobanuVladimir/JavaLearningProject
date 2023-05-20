package com.CiobanuVladimir.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        int result = a;
        System.out.println("Atribuire simpla:" + result);

        result += b;
        System.out.println("Atribuire cu adunare:" + result);

        result -= b;
        System.out.println("Atribuire cu scadere:" + result);

        result *= b;
        System.out.println("Atribuire cu inmultire:" + result);

        result /= b;
        System.out.println("Atribuire cu impartire:" + result);

        result %= b;
        System.out.println("Atribuire cu restul impartirii:" + result);

    }
}
