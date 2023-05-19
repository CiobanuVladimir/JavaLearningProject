package com.CiobanuVladimir.accesmodifiers.peopleevidence;

public class Person {
    public String name;
    public String surname;
    int age;
    double weight;
    double height;
    String sex;
    protected String residence;
    private final long ID;
    public boolean isRetired;
    public Person(String name, String surname, long ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        System.out.println("Un obiect de tip persoana a fost creat, folosind un constructor cu 3 parametri formali ");
    }

    public Person(String name, String surname, long ID,String residence, boolean isRetired, double weight, double height){
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.residence = residence;
        this.isRetired = isRetired;
        this.height = height;
        this.weight = weight;
        System.out.println("Un obiect de tip persoana a fost creat, folosind un constructor cu 7 parametri formali ");
    }





}
