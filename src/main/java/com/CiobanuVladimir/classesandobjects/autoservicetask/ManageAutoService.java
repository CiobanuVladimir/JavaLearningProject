package com.CiobanuVladimir.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        // Declararea si initializarea obiectelor folosind toatte tipurile de constructori
        Car mercedesBenzClasaE = new Car("E Class", "Mercedes", "Verde");

        mercedesBenzClasaE.plateNumber = "PRA 985";
        mercedesBenzClasaE.kmWhenEnteredTheService = 154478;

        System.out.println("Masina " + mercedesBenzClasaE.make + " de model " + mercedesBenzClasaE.model + " de culoare" +
                " " + mercedesBenzClasaE.color + " are numarul de inmatriculare " + mercedesBenzClasaE.plateNumber + "si" +
                " kilometrajul " + mercedesBenzClasaE.kmWhenEnteredTheService);

        Car vwPolo = new Car("HTE 455");
        Car volvoXC90 = new Car("BOS 356");


        Tool ciocan = new Tool("Ciocan");
        ciocan.weight = 1.65;

        System.out.println("Instrumentul cu numele " + ciocan.name + " are greutatea de " + ciocan.weight);

        Tool surubelnita = new Tool();

        Worker ionMuncitor = new Worker();

        Garage garageBavaria = new Garage();
    }
}
