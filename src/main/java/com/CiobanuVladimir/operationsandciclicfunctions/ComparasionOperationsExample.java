package com.CiobanuVladimir.operationsandciclicfunctions;

public class ComparasionOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean isEqual = a == b;
        System.out.println("Egal cu:" + isEqual);

        boolean isNotEqual = a != b;
        System.out.println("Diferit de:" + isEqual);

        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decat:" + isEqual);

        boolean isLessThan = a < b;
        System.out.println("Mai mic decat:" + isEqual);

        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Mai mare sau egal cu:" + isGreaterThanOrEqual);

        boolean isLessThanOrEqual = a >= b;
        System.out.println("Mai mic sau egal cu:" + isLessThanOrEqual);
    }
}
