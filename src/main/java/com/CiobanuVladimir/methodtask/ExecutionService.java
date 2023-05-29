package com.CiobanuVladimir.methodtask;

import javax.xml.crypto.Data;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratoUtil.getRandomInt(150, 350);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratoUtil.getRandomInt(150);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratoUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratoUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratoUtil.getRandomBoolean());


        Customer ionConsumer = new Customer("Ion Sirbu", 26, "Ion.Boss@gmail.com");

        System.out.println("Nume obiect Ion: " + ionConsumer.getName());
        System.out.println("Age obiect Ion: " + ionConsumer.getAge());
        System.out.println("Email obiect Ion: " + ionConsumer.getEmail());

        ionConsumer.setName("Ion Brotacel");
        ionConsumer.setAge(1527);
        ionConsumer.setEmail("IonBrotacel@gmail.com");

        System.out.println("Nume obiect Ion: " + ionConsumer.getName());
        System.out.println("Age obiect Ion: " + ionConsumer.getAge());
        System.out.println("Email obiect Ion: " + ionConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratoUtil.generateValidRandomString(12), DataGeneratoUtil.getRandomInt(127),
                DataGeneratoUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratoUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratoUtil.getRandomInt(18,64));
        randomDataCustomer.setEmail(DataGeneratoUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}
