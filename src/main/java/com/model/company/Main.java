package com.model.company;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product productFiat = new Product("Fiat Fullback", 82000);
        Product productSkoda = new Product("Skoda Octavia", 45000);
        Product productAudi = new Product("Audi A4", 90000);
        Product productFord = new Product("Ford mustang", 20000);
        Product productFiatTipo = new Product("Fiat Tipo", 52000);
        Product productCatering = new Product("Catering for event", 1300);
        Product productOfficeRent = new Product("Office rent", 25000);
        Product productFuelGasoline = new Product("Fuel, gasoline 95", 5.13);
        Product productFuelON = new Product("Fuel, oil", 5.02);
        Product productScrew = new Product("Screw", 3.2);
        Product productHammer = new Product("Hammer", 15.99);
        Product productPowerbank = new Product("Power bank", 15.99);
        Product productPhoneSamsung = new Product("Samsung Phone", 999.0);
        Product productPhoneApple = new Product("Apple Phone", 1299.99);
        Product productLaptopDell = new Product("Laptop, Dell Latitude", 1399.0);
        Product productLaptopApple = new Product("Laptop, Apple MacBook Pro", 1799.0);
        Product productServerDellPrecision = new Product("Server, Server Dell Precision", 2490.0);
        Product productPC = new Product("PC, Asus", 790.0);
        Product productCase = new Product("Case", 500.0);
        Product productSwitch = new Product("Network Switch", 130.0);
        Product productCoffeA = new Product("Coffe, Arabica", 29.99);
        Product productCoffeR = new Product("Coffe, Robusta", 39.99);
        Product productMug = new Product("Mug", 5.00);
        Product productPen = new Product("Pen", 0.99);
        Product productPencil = new Product("Pencil", 0.50);
        Product productClip = new Product("Clip", 2.49);
        Product productPuncher = new Product("Puncher", 0.79);
        Product productPaper = new Product("Paper", 9.99);
        Product productScisors = new Product("Scisors", 0.99);
        Product productFlour = new Product("Flour", 1.39);
        Product productSugar = new Product("Sugar", 1.87);
        Product productChocolate = new Product("Chocolate", 1.99);

        Company companyFallen = new Company("Fallen", "Detroit", 320, new ArrayList<>(Arrays.asList(
                new Purchase(productFiat, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 4), 18.1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 23.9, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 18), 41.8, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 37.2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 7.3, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 29), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 2), 21.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 43.3, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 10), 13.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 25.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 38.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 111.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 59.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 230.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 26), 18.3, UNIT.UNIT),

                new Purchase(productCoffeA, LocalDate.of(2018, 2, 15), 10.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 20), 10.0, UNIT.UNIT)
        )));

        Company companyPetersWifesCookies = new Company("Peters wifes cookies", "London", 12, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 25, UNIT.KILOGRAM),

                new Purchase(productFlour, LocalDate.of(2018, 1, 7), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 14), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 21), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 21), 25, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 7), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 14), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 21), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 28), 7, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 15), 25, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 28), 25, UNIT.KILOGRAM)
        )));

        Company companyTheOffice = new Company("Dunder Mifflin", "Detroit", 17, new ArrayList<>(Arrays.asList(
                new Purchase(productPaper, LocalDate.of(2018, 1, 1), 20.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 4), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 5), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 6), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 7), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productScisors, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 11), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 12), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 14), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 18), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 19), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 13.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 1, 21), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 25), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 26), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 27), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 28), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 29), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 30), 20.0, UNIT.UNIT),

                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 4), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 5), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 6), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 7), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 10), 20.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 2, 11), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 12), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 13), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 14), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 18), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 19), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 20), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 21), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 25), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 26), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 27), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT)
        )));

        Company transporting = new Company("Take me home", "London", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productSkoda, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFiatTipo, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productAudi, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 330.32, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 5), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 7), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 325.13, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 29), 325.13, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 1), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 7), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 9), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 325.13, UNIT.UNIT)
        )));

        Company companyTonysHardware = new Company("Tony's hardware", "Detroit", 2, new ArrayList<>(Arrays.asList(
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productScrew, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productFord, LocalDate.of(2018, 2, 20), 2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 70.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 20.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 35.0, UNIT.UNIT)
        )));

        Company companyTailor = new Company("Tailor Swift", "New York City", 3, new ArrayList<>(Arrays.asList(
                new Purchase(productScisors, LocalDate.of(2018, 1, 1), 3, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 2, UNIT.KILOGRAM),

                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 13), 3, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 18), 3, UNIT.UNIT)
        )));

        Company companyGoogleDublin = new Company("Google", "Dublin", 91, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 91, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 91, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 3), 20, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 91, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 5, UNIT.UNIT)
        )));


        Company companyGoogleLondon = new Company("Google", "London", 76, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 20, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 76, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 76, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 4, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 4, UNIT.UNIT)
        )));


        Company companyGoogleKijev = new Company("Google", "Kijev", 23, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 23, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 30.0, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));


        Company companyFintech = new Company("Fintech", "London", 9, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 5), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));

        Company companyFintechNewYork = new Company("Fintech", "New York City", 19, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 7, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productPowerbank, LocalDate.of(2018, 1, 1), 10, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 15.0, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 10), 3, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 1, 15), 2, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT)
        )));

        Company bakeryDetroit = new Company("Detroit Bakery", "Detroit", 11, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 200, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 50, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 132.53, UNIT.UNIT),
                new Purchase(productFlour, LocalDate.of(2018, 2, 1), 190, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 62, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 1), 79, UNIT.KILOGRAM)
        )));

        Company baltimoreFishing = new Company("Fisz", "Baltimore", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 500, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 20), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 500, UNIT.UNIT)
        )));

        Company solwit = new Company("Solwit", "Kijev", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productAudi, LocalDate.of(2018, 1, 2), 2, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 2), 89, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 12), 73.13, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 29), 67.33, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 13), 91.44, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 2), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 3), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 4), 1, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT)

        )));

        Company solwitGda = new Company("Solwit", "Gdansk", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 7), 1.0, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT)
        )));

        Company intelD = new Company("Intel", "Detroit", 755, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 10), 10, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 23.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 2, 20), 10, UNIT.UNIT)
        )));

        Company intelGda = new Company("Intel", "Gdansk", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        Company intelKij = new Company("Intel", "Kijev", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        List<Company> companies = new ArrayList<>(Arrays.asList(
                companyFallen,
                companyPetersWifesCookies,
                companyTheOffice,
                transporting,
                companyTonysHardware,
                companyTailor,
                companyGoogleDublin,
                companyGoogleLondon,
                companyGoogleKijev,
                companyFintech,
                companyFintechNewYork,
                bakeryDetroit,
                baltimoreFishing,
                solwitGda,
                solwit,
                intelD,
                intelGda,
                intelKij
        ));

        System.out.println(companies);

// Polecenie 1:
// Dane to Firmy oraz ich zakupy z miesiąca styczeń/luty 2018.

// Wszystkie rozwiązania zapisz w oddzielnych metodach statycznych w klasie Main.
// 1. Wylistuj (system out println) wszystkie firmy
// 2. Wylistuj wszystkie firmy które są z Detroit
// 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).
// 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
// 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
// 6. Zwróć firmę z najkrótszą nazwą
// 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.
// 8. Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi z Kijowa lub Detroit
// 9. ** Zwróć MAPĘ w której kluczem jest nazwa firmy, a wartością ilość pracowników w tej firmie (https://howtodoinjava.com/java8/collect-stream-to-map/)
// 10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
// 11. Zwróć firmę która dokonała zakupów na największą kwotę
// 12. Zwróć firmę która kupiła najwięcej produktów za kwotę wyższą niż 10 k
// 13. *Zwróć miejscowość która wydała najwięcej pieniędzy. Stwórz mapę Map<String, Double> gdzie kluczem jest miejscowość, a wartością jest kwota wydana przez firmy pochodzące z tamtej miejscowości
// 14. Wypisz firmy które 15 stycznia 2018 kupiły "Network Switch"
// 15. Znajdź firmę która kupuje najwięcej kawy
// 16. Wypisz ile łącznie zostało kupionej kawy Arabica w miesiącu styczniu
// 17. Wypisz ile łącznie kawy (Arabica i Roubsta) zostało kupionej w dni parzyste.
// 18. Zwróć Mapę (Map<Product, Set<Company>>) w której kluczem jest typ kawy (powinny być dwie, Arabica i Robusta) i wartością są listy firm które kupiły podaną kawę chociaż raz.
// 19. Zwróć firmę która w styczniu kupiła najwięcej paliwa (ropy)
// 20. Zwróć firmę której proporcja wydanych pieniędzy do ilości pracowników jest najwyższa
// 21. Zwróć firmę która najwięcej wydaje na artykuły biurowe
// 22. Zwróć firmy posortowane po ilości wydanych pieniędzy na paliwo
// 23. Zwróć wszystkie produkty które kupione były na kilogramy
// 24. Zwróć listę zakupów (obiektów purchase) kupionych przez firmy z Detroit w miesiącu lutym. posortuj je po kwocie.
// 25. Zwróć ilość biur które wynajęte były w miesiącu lutym.
// 26. Zwróć Mapę (Map<Company, Integer>). w mapie umieść wpisy Firma - > ilość biur które wynajęły w dowolnym okresie.
// 27. *Wypisz "Nazwa firmy: XYZ, ilość zakupionych telefonów apple: X" dla każdej firmy która kupiła telefon apple. Wypisy powinny być posortowane (na szczycie powinna być firma która kupiła ich najwięcej).
// 28. Znajdź firme która posiada siedzibę w więcej niż jednym mieście. Posortuj firmy po ilości siedzib, wypisz tylko te które mają więcej niż 1 siedzibę.
// 29. Wypisz ilość kilogramów cukru zużywaną przez "Detroit Bakery"
// 30. Wypisz wszystkie zakupy firmy "Solwit".
// 31. Wypisz wszystkie produkty które są tańsze (jednostkowo) niż 3$.
// 32. Wypisz ile sprzedano najtańszego produktu
// 33. Firma "Take me home" zajmuje się transportem. Na początku działalności kupiła wiele samochodów do użytku. Oblicz ile litrów paliwa (średnio) spalają ich samochody (zakładamy że wszystkie palą benzynę i że tankowane są wszystkie.
// 34. Wypisz firmę która zużywa najwięcej kawy
// 35. Wypisz firmę która zużywa najwięcej na papier.
// 36. Wypisz wszystkie produkty które były kupowane w większych ilościach niż 50 (jednostek/kilogramów)
// 37. Wypisz ile każda z firm zużywa na kawę (ile pieniędzy wydaje) (jako wynik zwróć mapę Map<String, Double> gdzie kluczem jest nazwa firmy, wartością jest ilość pieniędzy wydawanej na kawę
// 38. Wypisz średnie zużycie kawy na pracownika (wypisz w postaci proporcji. Jeśli firma kupiła 30 kilogramów i ma 20 pracowników to ma 1.5 kg / pracownika [w całości okresu])
// 39. Wypisz jaki produkt poza paliwem cieszy się największą popularnością (zwróć go) (find first)
// 40. Znajdź produkty które były kupowane zarówno w kilogramach jak i w sztukach
// 40. Wymyśl 5 ciekawych zapytań i spróbuj je zrealizować. Najciekawsze polecenie otrzyma nagrodę-niespodziankę z Baltimore :P

        // 1. Wylistuj (system out println) wszystkie firmy
        System.out.println();
        System.out.println("1. Wszystkie firmy");
        wylistujWszystkieFirmy(companies);

        // 2. Wylistuj wszystkie firmy które są z Detroit
        System.out.println();
        System.out.println("2. wszystkie firmy Detroit/Kijów");
        wylistujWszystkieZDetroit(companies);

        // 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).
        System.out.println();
        System.out.println("3. firmy z Londynu posortowane rosnąco po pracownikach");
        wylistujZLondonPosortowanePoPracownikachRosnąco(companies);
//        companies.stream()
//                .filter(company -> company.getCityHeadquarters().equalsIgnoreCase("london"))
//                .sorted(Comparator.comparingInt(Company::getEmployees))
//                .forEach(company -> System.out.println(company.getName() + " " + company.getEmployees()));

        // 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
        System.out.println();
        System.out.println("4. firmy z Londynu posortowane po zakupach i pracownikach");
//        companies.stream()
//                .filter(company -> company.getCityHeadquarters().equals("London"))
//                .sorted(new Comparator<Company>() {
//                    @Override
//                    public int compare(Company o1, Company o2) {
//                        if (o1.getPurchaseList().size() > o2.getPurchaseList().size()) {
//                            return -1;
//                        } else if (o1.getPurchaseList().size() < o2.getPurchaseList().size()) {
//                            return 1;
//                        } else if (o1.getEmployees() > o2.getEmployees()) {
//                            return -1;
//                        } else if (o1.getEmployees() < o2.getEmployees()) {
//                            return 1;
//                        } else {
//                            return 0;
//                        }
//                    }
//                });
        wylistujLonSortZakupySortPracoww(companies);

        // 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
//        companies.stream()
//                .filter(company -> company.getCityHeadquarters().equals("Kijev"))
//                .max(Comparator.comparingInt(Company::getEmployees));
        System.out.println();
        System.out.println("5. firma z Kijowa zatrudniająca najwięcej pracowników");
        Optional<Company> optMaxKijev = zwrocCompanyKijevMaxEmployess(companies);
        if (optMaxKijev.isPresent()) {
            Company maxKijev = optMaxKijev.get();
            System.out.println(maxKijev);
        }

        // 6. Zwróć firmę z najkrótszą nazwą
//        System.out.println();
//        System.out.println("6.");
//        Optional<Company> optComp = companies.stream()
//                .min((c1, c2) -> Integer.compare(c1.getName().length(), c2.getName().length()));
//        if (optComp.isPresent()) {
//            Company compMinName = optComp.get();
//            System.out.println(compMinName);
//        }
        System.out.println();
        System.out.println("6. firma o najkrótszej nazwie");
        Optional<String> optMinName = zwrocMinName(companies);
        if (optMinName.isPresent()) {
            String minName = optMinName.get();
            System.out.println(minName);
        }

        // 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.
//        companies.stream()
//                .filter(company -> !company.getCityHeadquarters().equals("Kijev") || !company.getCityHeadquarters().equals("London") || !company.getCityHeadquarters().equals("Detroit"))
//                .min(Comparator.comparingInt(c -> c.getPurchaseList().size()));
        System.out.println();
        System.out.println("7. firma nie z Kijowa, Londynu i Detroit z najmniejsza liczbą kupionych produktów:");
        Optional<Company> optnoKLDMinProd = noKiLoDeMinProducts(companies);
        if (optnoKLDMinProd.isPresent()) {
            Company noKLDminProd = optnoKLDMinProd.get();
            System.out.println(noKLDminProd);
        }

        // 8. Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi z Kijowa lub Detroit
//        companies.stream()
//                .filter(company -> company.getCityHeadquarters().equals("Kijev") || company.getCityHeadquarters().equals("Detroit"))
//                .forEach(company -> company.setEmployees(company.getEmployees() + 1));
        System.out.println();
        System.out.println("8. firmom z Kijowa i Detroit dodano 1-go pracownika");
        dodajPracownikaKijowDetroit(companies);
        wylistujZLondonPosortowanePoPracownikachRosnąco(companies);

        // 9. ** Zwróć MAPĘ w której kluczem jest nazwa firmy, a wartością ilość pracowników w tej firmie (https://howtodoinjava.com/java8/collect-stream-to-map/)
//        companies.stream()
//                .collect(Collectors.toMap(company -> company.getName(), company -> company.getEmployees(), (e1, e2) -> e1 + e2));
        System.out.println();
        System.out.println("9. zwróć mapę, której kluczem jest nazwa, a wartością liczba pracowników");
        Map<String, Integer> map = zwrocMapeNazwaIloscPracownikow(companies);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        int liczba = 1;
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(liczba + ". " + entry.getKey() + " " + entry.getValue());
            liczba++;
        }

        // a10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA NAZW FIRM z tamtej miejscowości (Map<String, List<Company>)
        System.out.println();
        System.out.println("a10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA NAZW FIRM z tamtej miejscowości (Map<String, List<String>)");
        Map<String, List<String>> map_a10 = zwrocMapeNazwaFirmyMiejscowoscListaNazwFir(companies);
        map_a10.forEach((key, value) -> System.out.println(key + " " + value));

        // 10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
//        companies.stream()
//                .collect(Collectors.groupingBy(c -> c.)
//                .collect(Collectors.groupingBy(c -> c.getCityHeadquarters(),  Collectors.mapping(c -> c, Collectors.toList())));
        System.out.println();
        System.out.println("10. Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości");
        Map<String, List<Company>> map1 = zwrocMapeNazwaFirmyListaFirm(companies);
        map1.forEach((s, companies1) -> System.out.println(s + " " + companies1));

        System.out.println();
        Set<Map.Entry<String, List<Company>>> entrySet = map1.entrySet();
        int counter = 1;
        for (Map.Entry<String, List<Company>> stringListEntry : entrySet) {
            System.out.println(counter + ". " + stringListEntry.getKey() + " ilość firm: " + stringListEntry.getValue().size());
            counter++;
        }


        // 11. Zwróć firmę która dokonała zakupów na największą kwotę
//        companies.stream()
//                .max(Comparator.comparingDouble(company -> company.getPurchaseList()
//                .stream()
//                .mapToDouble(p -> p.getProduct().getPrice() * p.getQuantity()).sum()));

//        companies.stream()
//                .max(Comparator.comparingDouble(company -> company.getPurchaseList()
//                .stream()
//                .mapToDouble(value -> value.getProduct().getPrice() * value.getQuantity())
//                .sum()));
        System.out.println();
        System.out.println("11. firma, która dokonała zakupów na najwiekszą kwotę: ");
        Optional<Company> optMaxZakup = zwrocFirmeZakupyNaMaxKwote(companies);
        if (optMaxZakup.isPresent()) {
            Company maxZakup = optMaxZakup.get();
            System.out.println("firma: " + maxZakup.getName() + " " + maxZakup.getCityHeadquarters());
        }

        // 12. Zwróć firmę która kupiła najwięcej produktów za kwotę wyższą niż 10 k
        Optional<Company> optMax10k = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList().stream()
                        .filter(purchase -> purchase.getProduct().getPrice() > 10.000)
                        .mapToDouble(value -> value.getQuantity()).sum()));

        // 13. *Zwróć miejscowość która wydała najwięcej pieniędzy. Stwórz mapę Map<String, Double> gdzie kluczem jest miejscowość, a wartością jest kwota wydana przez firmy pochodzące z tamtej miejscowości

        Set<String> miejscowosci = companies.stream().map(company -> company.getCityHeadquarters()).collect(Collectors.toSet());

        Map<String, Double> mapaCityMoney = miejscowosci.stream().collect(Collectors.toMap(
                m -> m,
                m -> companies.stream()
                    .filter(company -> company.getCityHeadquarters().equals(m))
                    .mapToDouble(value -> value.getPurchaseList().stream()
                            .mapToDouble(value1 -> value1.getProduct().getPrice() * value1.getQuantity())
                            .sum())
                    .sum()));


        // 14. Wypisz firmy które 15 stycznia 2018 kupiły "Network Switch"
//        companies.stream()
//                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getPurchaseDate())
//                        .anyMatch(localDate -> localDate.isEqual(LocalDate.of(2018,1, 15))))
//                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getProduct())
//                        .anyMatch(product -> product.getName().equals("Network Switch")))
//                .forEach(company -> System.out.println(company.getName()));

        System.out.println();
        System.out.println("14. firmy, które 15.01.2018 kupiły Network Switch: ");
        zwrocFirmyKtoreKupily15StyczNetworkSwitch(companies);

        System.out.println();
        System.out.println("6. firma z najkrótszą nazwą");
        Optional<Company> optCompany62 = minNazwa(companies);
        if (optCompany62.isPresent()) {
            Company company62 = optCompany62.get();
            System.out.println(company62.getName());
        }

        // 15. Znajdź firmę która kupuje najwięcej kawy
        // sprawdzam ile jest rodzajów kawy
        System.out.println();
        System.out.println(15);
        Set<String> setNazwProduktów = companies.stream()
                .map(company -> company.getPurchaseList())
                .flatMap(purchases -> purchases.stream())
                .map(purchase -> purchase.getProduct().getName())
                .collect(Collectors.toSet());
        for (String s : setNazwProduktów) {
            System.out.println(s);
        }

        System.out.println();
        Optional<Company> optMaxKawa = companies.stream()
                .max(Comparator.comparingDouble(company -> company.getPurchaseList().stream()
                .filter(purchase -> purchase.getProduct().getName().equals("Coffe, Arabica") || purchase.getProduct().getName().equals("Coffe, Robusta"))
                .mapToDouble(value -> value.getQuantity()).sum()));
        if (optMaxKawa.isPresent()) {
            Company maxKawa = optMaxKawa.get();
            System.out.println(maxKawa);
        }

        // 16. Wypisz ile łącznie zostało kupionej kawy Arabica w miesiącu styczniu
        System.out.println();
        System.out.println(16);
        double valueArabicaJanuary = companies.stream()
                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getPurchaseDate())
                .anyMatch(localDate -> localDate.isAfter(LocalDate.of(2017, 12, 31)) && localDate.isBefore(LocalDate.of(2018, 2, 1))))
                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getProduct()).anyMatch(name -> name.getName().equals("Coffe, Arabica")))
                .map(company -> company.getPurchaseList())
                .flatMap(purchases -> purchases.stream())
                .filter(purchase -> purchase.getPurchaseDate().isAfter(LocalDate.of(2017, 12, 31)) && purchase.getPurchaseDate().isBefore(LocalDate.of(2018, 2, 1)))
                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Coffe, Arabica"))
                .mapToDouble(value -> value.getQuantity()).sum();
        System.out.println("ilość kupionej Arabiki w styczniu: " + valueArabicaJanuary);

    }

    // 1. Wylistuj (system out println) wszystkie firmy
    public static void wylistujWszystkieFirmy(List<Company> companies) {
        companies.stream().forEach(company -> System.out.println(company));
    }

    // 2. Wylistuj wszystkie firmy które są z Detroit
    public static void wylistujWszystkieZDetroit(List<Company> companies) {
        companies.stream().filter(company -> company.getCityHeadquarters().equals("Detroit"))
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()));
    }

    // 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).

    public static void wylistujZLondonPosortowanePoPracownikachRosnąco(List<Company> companies) {
        companies.stream().filter(company -> company.getCityHeadquarters().equals("London"))
                .sorted((c1, c2) -> Integer.compare(c1.getEmployees(), c2.getEmployees()))
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters() + " " + company.getEmployees()));
    }

    // 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
    public static void wylistujLonSortZakupySortPracoww(List<Company> companies) {
        companies.stream().filter(company -> company.getCityHeadquarters().equals("London"))
                .sorted(new Comparator<Company>() {
                    @Override
                    public int compare(Company o1, Company o2) {
                        if (o1.getPurchaseList().size() < o2.getPurchaseList().size()) {
                            return  1;
                        }
                        if (o1.getPurchaseList().size() > o2.getPurchaseList().size()) {
                            return  -1;
                        }
                        if (o1.getEmployees() < o2.getEmployees()) {
                            return  1;
                        }
                        if (o1.getEmployees() > o2.getEmployees()) {
                            return  -1;
                        } else {
                            return 0;
                        }
                    }
                }).forEach(company -> System.out.println(company.getName() + " " + company.getPurchaseList().size() + " " + company.getEmployees()));
    }

    // 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
    public static Optional<Company> zwrocCompanyKijevMaxEmployess(List<Company> companies) {
        return companies.stream().filter(company -> company.getCityHeadquarters().equals("Kijev"))
                .max((c1, c2) -> Integer.compare(c1.getEmployees(), c2.getEmployees()));
    }

    // 6. Zwróć firmę z najkrótszą nazwą
    public static Optional<String> zwrocMinName(List<Company> companies) {
        return companies.stream().map(company -> company.getName())
                .min((n1, n2) -> Integer.compare(n1.length(), n2.length()));
    }

    // 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.
    public static Optional<Company> noKiLoDeMinProducts(List<Company> companies) {
        return companies.stream()
                .filter(company -> !company.getName().equals("London") || !company.getName().equals("Detroit") || !company.getName().equals("Kijev"))
                .min((c1, c2) -> Integer.compare(c1.getPurchaseList().size(), c2.getPurchaseList().size()));
    }

    // 8. Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi z Kijowa lub Detroit
    public static void dodajPracownikaKijowDetroit(List<Company> companies) {
        companies.stream().filter(company -> company.getCityHeadquarters().equals("Kijev") || company.getCityHeadquarters().equals("Detroit"))
                .forEach(company -> company.setEmployees(company.getEmployees() + 1));
    }

    // 9. ** Zwróć MAPĘ w której kluczem jest nazwa firmy, a wartością ilość pracowników w tej firmie (https://howtodoinjava.com/java8/collect-stream-to-map/)
    public static Map<String, Integer> zwrocMapeNazwaIloscPracownikow(List<Company> companies) {
        return companies.stream()
                .collect(Collectors.toMap(company -> company.getName(), company -> company.getEmployees(), (e1, e2) -> e1 + e2));
    }

    // a10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
//        wartości to nazwy firm List<String>
//        System.out.println();
    public static Map<String, List<String>> zwrocMapeNazwaFirmyMiejscowoscListaNazwFir(List<Company> companies) {
        return companies.stream()
                .collect(Collectors.groupingBy(c -> c.getCityHeadquarters(), Collectors.mapping(c -> c.getName(), Collectors.toList())));
    }


    // 10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
    public static Map<String, List<Company>> zwrocMapeNazwaFirmyListaFirm(List<Company> companies) {
        return companies.stream()
                .collect(Collectors.groupingBy(c -> c.getCityHeadquarters(), Collectors.mapping(c -> c, Collectors.toList())));
    }

    // 11. Zwróć firmę która dokonała zakupów na największą kwotę
    public static Optional<Company> zwrocFirmeZakupyNaMaxKwote(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(company -> company.getPurchaseList()
                        .stream()
                        .mapToDouble(value -> value.getQuantity() * value.getProduct().getPrice())
                        .sum())
                );
    }

    // 11.bis
    public static Optional<Company> zwrocMax2(List<Company> companies) {
        return companies.stream()
                .max(Comparator.comparingDouble(company -> company.getPurchaseList().stream()
                .mapToDouble(value -> value.getQuantity() * value.getProduct().getPrice())
                .sum()));
    }

    // 14. Wypisz firmy które 15 stycznia 2018 kupiły "Network Switch"
    public static void zwrocFirmyKtoreKupily15StyczNetworkSwitch(List<Company> companies) {
        companies.stream()
                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getPurchaseDate())
                        .anyMatch(localDate -> localDate.isEqual(LocalDate.of(2018, 1, 15))))
                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getProduct())
                        .anyMatch(product -> product.getName().equalsIgnoreCase("network switch")))
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()));
    }

    // 6. Zwróć firmę z najkrótszą nazwą
    public static Optional<Company> minNazwa(List<Company> companies) {
        return companies.stream().min((c1, c2) -> Integer.compare(c1.getName().length(), c2.getName().length()));
    }

    // 15. Znajdź firmę która kupuje najwięcej kawy
//    public static Optional<Company> maxCoffe(List<Company> companies) {
//        return companies.stream()
//                .max(Comparator.comparingDouble(company -> company.getPurchaseList()
//                .stream()
//                .map(name -> name.getProduct().getName().equalsIgnoreCase("coffe, arabica") && name.getProduct().getName().equalsIgnoreCase("coffe, robusta"))
//                .mapToDouble(value -> value.)))
//    }
}
