package com.CiobanuVladimir.accesmodifiers;

import com.CiobanuVladimir.accesmodifiers.peopleevidence.Person;
import org.w3c.dom.ls.LSOutput;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person vasilePerson = new Person("Vasile", "Vasilache", 45755485);
        vasilePerson.isRetired = true;
        if (vasilePerson.isRetired) {
            System.out.println("Vasile este la pensie");

        } else {
            System.out.println("Vasile nu a iesit la pensie");
        }

        Person vladislavPerson = new Person("Vladislav", "Tabirta", 45123155, "Chisinau",
                true, 95.5,176.5);
        if (vladislavPerson.isRetired){
            System.out.println("Vladislav este la pensie");
        } else {
            System.out.println("Vladislav nu a iesit la pensie");
        }

        Person mariaPerson = new Person("Maria", "Iasibas", 7854854, "Balti",
                false, 55.5,166.5);
        if (mariaPerson.isRetired){
            System.out.println("Maria este la pensie");
        } else {
            System.out.println("Maria nu a iesit la pensie");
        }

        Person nataliaPerson = new Person("Natalia", "Luca", 200045479, "Sangera",
                false, 54.5,170.5);
        if (nataliaPerson.isRetired){
            System.out.println("Natalia este la pensie");
        } else {
            System.out.println("Natalia nu a iesit la pensie");
        }

        Person anaPerson = new Person("Ana", "Turcan", 96452154, "Rezina",
                false, 50.5,160.5);
        if (anaPerson.isRetired){
            System.out.println("Ana este la pensie");
        } else {
            System.out.println("Ana nu a iesit la pensie");
        }

    }
}
