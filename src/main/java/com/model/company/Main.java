package com.model.company;

import java.security.Key;
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
//                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 62, UNIT.KILOGRAM),
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
        System.out.println("1.");
        companies.stream()
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()));






//        System.out.println();
//        System.out.println("1. Wszystkie firmy");
//        wylistujWszystkieFirmy(companies);

        // 2. Wylistuj wszystkie firmy które są z Detroit
        System.out.println();
        System.out.println("2.");
        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Detroit"))
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()));






//        System.out.println();
//        System.out.println("2. wszystkie firmy Detroit/Kijów");
//        wylistujWszystkieZDetroit(companies);

        // 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).
        System.out.println();
        System.out.println("3.");
        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("London"))
                .sorted(Comparator.comparingInt(Company::getEmployees).reversed()) // or not reversed
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters() + " " + company.getEmployees()));






//        System.out.println();
//        System.out.println("3. firmy z Londynu posortowane rosnąco po pracownikach");
//        wylistujZLondonPosortowanePoPracownikachRosnąco(companies);

        // 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
        System.out.println();
        System.out.println("4.");
        companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Detroit"))
                .sorted(new Comparator<Company>() {
                    @Override
                    public int compare(Company o1, Company o2) {
                        if (o1.getPurchaseList().size() > o2.getPurchaseList().size()) {
                            return 1;
                        } else if (o1.getPurchaseList().size() < o2.getPurchaseList().size()) {
                            return -1;
                        } else if (o1.getEmployees() > o2.getEmployees()) {
                            return -1;
                        } else if (o1.getEmployees() < o2.getEmployees()) {
                            return 1;
                        } else return 0;

                    }
                })
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()
                + " " + company.getPurchaseList().size() + " " + company.getEmployees()));





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

        System.out.println();
        System.out.println("5_2");
        Optional<Company> optMaxKijev2 = zwrocCompanyKijevMaxEmployess2(companies);
        if (optMaxKijev.isPresent()) {
            Company maxKijev = optMaxKijev.get();
            System.out.println(maxKijev);
        }

        // 6. Zwróć firmę z najkrótszą nazwą







        System.out.println();
        System.out.println("6.");
        Optional<Company> opt_Zad_6 = companies.stream()
                .min(Comparator.comparingInt(c -> c.getName().length()));

        if (opt_Zad_6.isPresent()) {
            Company zad_6 = opt_Zad_6.get();
            System.out.println(zad_6.getName());
        }

//        System.out.println();
//        System.out.println("6. firma o najkrótszej nazwie");
//        Optional<String> optMinName = zwrocMinName(companies);
//        if (optMinName.isPresent()) {
//            String minName = optMinName.get();
//            System.out.println(minName);
//        }

        System.out.println();
        System.out.println("6.2");
        Optional<Company> opt_Zad_6_2 = zwrocMinName2(companies);
        if (opt_Zad_6.isPresent()) {
            Company zad_6_2 = opt_Zad_6_2.get();
            System.out.println(zad_6_2);
        }

        // 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.







        // albo tak albo jak niżej
//        Optional<Company> opt_Zad_7 = companies.stream()
//                .filter(company -> !company.getCityHeadquarters().equals("Kijev") || !company.getCityHeadquarters().equals("London") || !company.getCityHeadquarters().equals("Detroit"))
//                .min(Comparator.comparingDouble(c -> c.getPurchaseList().stream()
//                .mapToDouble(s -> s.getQuantity()).sum()));

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

//        System.out.println();
//        System.out.println("9.a");
//        companies.stream()
//                .collect(Collectors.groupingBy(
//                        company -> company.getName(),
//                        Collectors.mapping(company -> company.getEmployees(), Collectors.toList())
//                ))
//                .forEach((s, integer) -> System.out.println(s + " " + integer));

        System.out.println();
        System.out.println("9.b");
        companies.stream()
                .collect(Collectors.toMap(company -> company.getName(), company -> company.getEmployees(), (e1, e2) -> e1 + e2))
                .forEach((s, integer) -> System.out.println(s + " " + integer));

        System.out.println();
        System.out.println("9.c zwróć mapę, której kluczem jest nazwa, a wartością liczba pracowników");
        Map<String, Integer> map = zwrocMapeNazwaIloscPracownikow(companies);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        int liczba = 1;
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(liczba + ". " + entry.getKey() + " " + entry.getValue());
            liczba++;
        }

//        System.out.println();
//        System.out.println("9.d zwróć mapę, której kluczem jest nazwa, a wartością liczba pracowników");
//        Map<String, Integer> map2 = zwrocMapeNazwaIloscPracownikow2(companies);
//        Set<Map.Entry<String, Integer>> entries2 = map.entrySet();
//        int liczba2 = 1;
//        for (Map.Entry<String, Integer> entry : entries2) {
//            System.out.println(liczba2 + ". " + entry.getKey() + " " + entry.getValue());
//            liczba++;
//        }

        System.out.println();
        System.out.println("9.e zwróć mapę, której kluczem jest nazwa, a wartością liczba pracowników");
        Map<String, Integer> map3 = zwrocMapeNazwaIloscPracownikow(companies);
        List<Map.Entry<String, Integer>> entries3 = map.entrySet().stream()
                .sorted(Comparator.comparing(stringIntegerEntry -> stringIntegerEntry.getKey()))
                .collect(Collectors.toList());
//        List<String, Integer> stringIntegerList = new ArrayList<String, Integer>(entries3);
        entries3.forEach(System.out::println);

        System.out.println();
        System.out.println();

        for (int i = 0; i < entries3.size(); i++) {
            System.out.println((i + 1) + ". " + entries3.get(i).getKey() + " " + entries3.get(i).getValue());
        }


        // a10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA NAZW FIRM z tamtej miejscowości (Map<String, List<Company>)

        System.out.println();
        System.out.println("10.a");
        Set<String> set_Zad10a = companies.stream()
                .map(company -> company.getCityHeadquarters())
                .collect(Collectors.toSet());

        Map<String, List<String>> mapa_Zad10a = set_Zad10a.stream()
                .collect(Collectors.toMap(
                        m -> m,
                        m -> companies.stream()
                            .filter(company -> company.getCityHeadquarters().equals(m))
                            .map(company -> company.getName())
                            .collect(Collectors.toList())
                ));

        mapa_Zad10a.forEach((s, strings) -> System.out.println(s + " " + strings));


        System.out.println();
        System.out.println("10.int");
        Map<String, List<Integer>> mapa_10_Int =  companies.stream()
                .collect(Collectors.groupingBy(
                        company -> company.getCityHeadquarters(),
                        Collectors.mapping(company -> company.getEmployees(), Collectors.toList())
                ));

        mapa_10_Int.forEach((s, integers) -> System.out.println(s + " " + integers));

        Map<String, Integer> map_10StringInt = new HashMap<>();
        Set<Map.Entry<String, List<Integer>>> entrySet = mapa_10_Int.entrySet();
        for (Map.Entry<String, List<Integer>> stringListEntry : entrySet) {
            String s = stringListEntry.getKey();
            List<Integer> integerList = stringListEntry.getValue();
            int i = 0;
            for (int j = 0; j < integerList.size(); j++) {
                i += integerList.get(j);
            }
            map_10StringInt.put(s, i);
        }
        System.out.println();
        map_10StringInt.forEach((s, integer) -> System.out.println(s + " " + integer));

        System.out.println();
        System.out.println("Sorted");
        List<Map.Entry<String, Integer>> listSorted = map_10StringInt.entrySet().stream()
            .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toList());
        for (int i = 0; i < listSorted.size(); i++) {
            System.out.println((i + 1) + ". " + listSorted.get(i).getKey() + " " + listSorted.get(i).getValue());
        }


        System.out.println();
        System.out.println("a10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA NAZW FIRM z tamtej miejscowości (Map<String, List<String>)");
        Map<String, List<String>> map_a10 = zwrocMapeNazwaFirmyMiejscowoscListaNazwFir(companies);
        map_a10.forEach((key, value) -> System.out.println(key + " " + value));

        // 10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)

        Map<String, List<String>> mapa_Zad1010 = companies.stream()
                .collect(Collectors.groupingBy(
                        company -> company.getName(),
                        Collectors.mapping(company -> company.getName(), Collectors.toList())
                ));




        System.out.println();
        Map<String, List<Company>> zad_10_1 = companies.stream()
                .collect(Collectors.groupingBy(c -> c.getCityHeadquarters(), Collectors.toList()));
        System.out.println("10.");
        zad_10_1.forEach((key, value) -> System.out.println(key + " " + value.size()));

        System.out.println();
        System.out.println("10. Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości");
        Map<String, List<Company>> map1 = zwrocMapeNazwaFirmyListaFirm(companies);
        map1.forEach((s, companies1) -> System.out.println(s + " " + companies1));

        System.out.println();
        Set<Map.Entry<String, List<Company>>> entrySet10 = map1.entrySet();
        int counter = 1;
        for (Map.Entry<String, List<Company>> stringListEntry : entrySet10) {
            System.out.println(counter + ". " + stringListEntry.getKey() + " ilość firm: " + stringListEntry.getValue().size());
            counter++;
        }


        // 11. Zwróć firmę która dokonała zakupów na największą kwotę






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

        Optional<Company> opt_Zad12 = companies.stream()
                .max(Comparator.comparingDouble(
                        value -> value.getPurchaseList()
                        .stream()
                        .filter(purchase -> purchase.getProduct().getPrice() > 10000)
                        .mapToDouble(value1 -> value1.getQuantity())
                        .sum()
                ));

        if (opt_Zad12.isPresent()) {
            Company zad12 = opt_Zad12.get();

            System.out.println();
            System.out.println("Zad. 12");
            System.out.println(zad12);
        }


        Optional<Company> optMax10k = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList().stream()
                        .filter(purchase -> purchase.getProduct().getPrice() > 10000)
                        .mapToDouble(value -> value.getQuantity()).sum()));

        // 13. *Zwróć miejscowość która wydała najwięcej pieniędzy. Stwórz mapę Map<String, Double> gdzie kluczem jest miejscowość, a wartością jest kwota wydana przez firmy pochodzące z tamtej miejscowości








        Set<String> miejscowosci = companies.stream()
                .map(company -> company.getCityHeadquarters()).collect(Collectors.toSet());

        Map<String, Double> mapaCityMoney = miejscowosci.stream().collect(Collectors.toMap(
                m -> m,
                m -> companies.stream()
                    .filter(company -> company.getCityHeadquarters().equals(m))
                    .mapToDouble(c -> c.getPurchaseList().stream()
                    .mapToDouble(value1 -> value1.getProduct().getPrice() * value1.getQuantity())
                    .sum())
                    .sum()
                ));
        System.out.println();
        Set<Map.Entry<String, Double>> entrySet13 = mapaCityMoney.entrySet();
        System.out.println("13.");
        mapaCityMoney.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();
        Set<String> setMiasta= mapaCityMoney.keySet();
        Collection<Double> wydatki =  mapaCityMoney.values();
        Optional<Double> optMaxWydatki = wydatki.stream()
                .max(Comparator.comparingDouble(value -> value));

        if (optMaxWydatki.isPresent()) {
            double maxWydatki = optMaxWydatki.get();

            for (Map.Entry<String, Double> stringDoubleEntry : entrySet13) {
                if (stringDoubleEntry.getValue() == maxWydatki) {
                    System.out.println("Miejscowość, która wydała najwięcej pieniędzy: " + stringDoubleEntry.getKey()
                    + " " + stringDoubleEntry.getValue());
                }
            }

        }


        // 14. Wypisz firmy które 15 stycznia 2018 kupiły "Network Switch"


        companies.stream()
                .filter(company -> company.getPurchaseList().stream()
                        .anyMatch(purchase -> purchase.getPurchaseDate().isEqual(LocalDate.of(2018, 1, 15)) && purchase.getProduct().getName().equalsIgnoreCase("Switch")))
                        .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()));





        System.out.println();
        System.out.println("14. firmy, które 15 stycznia kupiły Network Switch");
        companies.stream()
                .filter(company -> company.getPurchaseList().stream()
                .anyMatch(purchase -> purchase.getPurchaseDate().isEqual(LocalDate.of(2018, 1, 15)) && purchase.getProduct().getName().equalsIgnoreCase("network switch")))
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()));
//        źle
//        companies.stream()
//                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getPurchaseDate())
//                        .anyMatch(localDate -> localDate.isEqual(LocalDate.of(2018,1, 15))))
//                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getProduct())
//                        .anyMatch(product -> product.getName().equals("Network Switch")))
//                .forEach(company -> System.out.println(company.getName()));

        System.out.println();
        System.out.println("14. (żle) firmy, które 15.01.2018 kupiły Network Switch: ");
        zwrocFirmyKtoreKupily15StyczNetworkSwitch(companies);

        // 15. Znajdź firmę która kupuje najwięcej kawy










        System.out.println();
        System.out.println("15.");
        Optional<Company> optCom_zad_15 = companies.stream()
                .max(Comparator.comparingDouble(
                c -> c.getPurchaseList().stream()
                .filter(p -> p.getProduct().getName().startsWith("Coff"))
                .mapToDouble(value -> value.getQuantity()).sum()));

        if (optCom_zad_15.isPresent()) {
            Company zad_15 = optCom_zad_15.get();

            System.out.println(zad_15.getName() + " " + zad_15.getCityHeadquarters());
        }



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
        System.out.println("16.test");
        double zad16 = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream()
                .filter(purchase -> purchase.getProduct().getName().startsWith("Cof") && purchase.getPurchaseDate().getMonth().getValue() == 1))
                .mapToDouble(Purchase::getQuantity).sum();


        System.out.println();
        System.out.println(16);
        double valueArabicaJanuary = companies.stream()
                .flatMap(c -> c.getPurchaseList().stream()
                    .filter(p -> p.getProduct().getName().equalsIgnoreCase("Coffe, Arabica") && p.getPurchaseDate().getMonth().getValue() == 1))
                .mapToDouble(Purchase::getQuantity).sum();
//                .flatMap(company -> company.getPurchaseList().stream()
//                        .filter(purchase -> purchase.getPurchaseDate().getMonth().getValue() == 1 && purchase.getProduct().getName().equalsIgnoreCase("Coffe, Arabica")))
//                .mapToDouble(value -> value.getQuantity()).sum();

//        double valueArabicaJanuary = companies.stream()
//                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getPurchaseDate())
//                .anyMatch(localDate -> localDate.isAfter(LocalDate.of(2017, 12, 31)) && localDate.isBefore(LocalDate.of(2018, 2, 1))))
//                .filter(company -> company.getPurchaseList().stream().map(purchase -> purchase.getProduct()).anyMatch(name -> name.getName().equals("Coffe, Arabica")))
//                .map(company -> company.getPurchaseList())
//                .flatMap(purchases -> purchases.stream())
//                .filter(purchase -> purchase.getPurchaseDate().isAfter(LocalDate.of(2017, 12, 31)) && purchase.getPurchaseDate().isBefore(LocalDate.of(2018, 2, 1)))
//                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Coffe, Arabica"))
//                .mapToDouble(value -> value.getQuantity()).sum();
        System.out.println("ilość kupionej Arabiki w styczniu: " + valueArabicaJanuary);

        // 17. Wypisz ile łącznie kawy (Arabica i Roubsta) zostało kupionej w dni parzyste.

        double zad17_2 = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream()
                .filter(purchase -> purchase.getProduct().getName().startsWith("Cof") && purchase.getPurchaseDate().getDayOfMonth() % 2 == 0))
                        .mapToDouble(Purchase::getQuantity).sum();





        double zad_17 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream()
                .filter(p -> p.getProduct().getName().startsWith("Coff") && p.getPurchaseDate().getDayOfMonth() % 2 == 0))
                .mapToDouble(value -> value.getQuantity()).sum();
        System.out.println();
        System.out.println("17. suma Arabiki i Robusty kupionej w dni parzyste: " + zad_17);

        // 18. Zwróć Mapę (Map<Product, Set<Company>>) w której kluczem jest typ kawy (powinny być dwie, Arabica i Robusta) i wartością są listy firm które kupiły podaną kawę chociaż raz.

        System.out.println();
        System.out.println("18.a");
        Set<String> set_18 = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .map(purchase -> purchase.getProduct())
                .map(product -> product.getName())
                .filter(s -> s.startsWith("Coff"))
                .collect(Collectors.toSet());

        set_18.forEach(s -> System.out.println(s));

        Set<Product> set_18_Produkt = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .map(purchase -> purchase.getProduct())
                .filter(product -> product.getName().startsWith("Coff"))
                .collect(Collectors.toSet());

        System.out.println();
        set_18_Produkt.forEach(System.out::println);
        System.out.println();
        Map<Product, List<Company>> map18_test = set_18_Produkt.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        p -> companies.stream()
                            .filter(company -> company.getPurchaseList().stream()
                            .anyMatch(purchase -> purchase.getProduct().equals(p)))
                            .collect(Collectors.toList())
                ));

        map18_test.forEach((k, v) -> System.out.println(k + " " + v.size()));
        System.out.println();
        map18_test.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();
        List<Product> productList = new ArrayList<>(set_18_Produkt);
        Product p1 = productList.get(0);
        System.out.println(p1);
        System.out.println();
        List<Company> company_p1 = map18_test.get(p1);
        company_p1.stream()
                .map(Company::getName)
                .forEach(System.out::println);

        Map<Product, Set<Company>> map_Zad18a = set_18_Produkt.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        p -> companies.stream()
                            .filter(company -> company.getPurchaseList().stream()
                            .anyMatch(purchase -> purchase.getProduct().equals(p)))
                            .collect(Collectors.toSet())
                ));







        System.out.println();
        System.out.println("18.");
        Set<Product> products = companies.stream()
                .map(comp -> comp.getPurchaseList())
                .flatMap(purchases -> purchases.stream())
                .map(purchase -> purchase.getProduct())
                .filter(product -> product.getName().startsWith("Coffe,"))
                .collect(Collectors.toSet()); // typy kawy
        for (Product product : products) {
            System.out.println(product.getName());
        }


        Map<Product, Set<Company>> companiesWhoDrinkCoffee = products.stream()
                .collect(Collectors.toMap(
                        product -> product,
                        product -> companies.stream() // dla produktu, sprawdz czy
                                .filter(company -> company.getPurchaseList().stream() // w liscie znajduje produkt o tej nazwie
                                        .anyMatch(purchase -> purchase.getProduct() == product)).collect(Collectors.toSet())));

        System.out.println(companiesWhoDrinkCoffee);
        System.out.println();
        companiesWhoDrinkCoffee.forEach((key, value) -> System.out.println(key + " " + value));

        // 19. Zwróć firmę która w styczniu kupiła najwięcej paliwa (ropy)
        System.out.println("19.test");

        Optional<Company> opt_zad19_test = companies.stream()
//                .max(Comparator.comparingDouble(company -> company.getPurchaseList().stream()
//                .filter(purchase -> purchase.getPurchaseDate().getMonth().getValue() == 1 && purchase.getProduct().getName().startsWith("Fuel, o"))
//                .mapToDouble(Purchase::getQuantity).sum()));
                .filter(company -> company.getPurchaseList()
                .stream()
                .anyMatch(purchase -> purchase.getPurchaseDate().getMonth().getValue() == 1 && purchase.getProduct().getName().startsWith("Fuel, o")))
                .max(Comparator.comparingDouble(value -> value.getPurchaseList().stream()
                .mapToDouble(Purchase::getQuantity).sum()));

        if (opt_zad19_test.isPresent()) {
            Company zad19test = opt_zad19_test.get();
            System.out.println(zad19test);
        }

        System.out.println();
        double solwitOil = companies.stream()
                .filter(company -> company.getName().startsWith("Sol"))
                .flatMap(company -> company.getPurchaseList().stream()
                .filter(purchase -> purchase.getPurchaseDate().getMonth().getValue() == 1 && purchase.getProduct().getName().startsWith("Fuel, o")))
                .mapToDouble(Purchase::getQuantity).sum();
        System.out.println("solwitOil " + solwitOil);
        System.out.println();
        double fiszOil = companies.stream()
                .filter(company -> company.getName().startsWith("Fisz"))
                .flatMap(company -> company.getPurchaseList().stream()
                        .filter(purchase -> purchase.getPurchaseDate().getMonth().getValue() == 1 && purchase.getProduct().getName().startsWith("Fuel, o")))
                .mapToDouble(Purchase::getQuantity).sum();
        System.out.println("fiszOil " + fiszOil);

        System.out.println();
        System.out.println("19.");
        System.out.println("Set produktów (by stwierdzić jak jest ujęta ropa).");
        Set<Product> setZad19 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream()
                .map(purchase -> purchase.getProduct())
                ).collect(Collectors.toSet());
        for (Product product : setZad19) {
            System.out.println(product);
        }

        Optional<Company> optMaxZad_19 = companies.stream()
                .max(Comparator.comparingDouble(
                        c -> c.getPurchaseList().stream()
                        .filter(p -> p.getProduct().getName().equals("Fuel, oil")
                        && p.getPurchaseDate().getMonth().getValue() == 1)
                        .mapToDouble(value -> value.getQuantity()).sum()
                ));

        System.out.println();
        if (optMaxZad_19.isPresent()) {
            Company maxOil = optMaxZad_19.get();
            System.out.println("Firma która w styczniu kupiła najwięcej paliwa (ropy), to: " + maxOil.getName());
        }

        // 20. Zwróć firmę której proporcja wydanych pieniędzy do ilości pracowników jest najwyższa


        Optional<Company> opt_Zad20 = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList().stream()
                        .mapToDouble(value -> value.getQuantity() * value.getProduct().getPrice()).sum() / company.getEmployees()
                ));


        System.out.println();
        System.out.println("20.");
        Optional<Company> optMaxProportion = companies.stream()
                .max(Comparator.comparingDouble(
                        c -> c.getPurchaseList()
                        .stream()
                        .mapToDouble(p -> p.getQuantity() * p.getProduct().getPrice()).sum() / c.getEmployees()
                ));
        if (optMaxProportion.isPresent()) {
            Company maxProportionZad_20 = optMaxProportion.get();
            System.out.println("Firma z największą proporcją wydanych pieniędzy do ilości pracowników to: " + maxProportionZad_20.getName());
        }

        // 20a. Zwróć mapę firm Map<Company, Double>, kluczem są firmy, wartości to proporcja wydanych pieniędzy do ilości pracowników









        System.out.println();
        System.out.println("20a.");
        Map<Company, Double> mapZad_20a = companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList().stream()
                            .mapToDouble(p -> p.getQuantity() * p.getProduct().getPrice()).sum() / c.getEmployees()
                ));
        System.out.println("Mapa firma : proporcja wydatki/ilość pracowników.");
        mapZad_20a.forEach((key, value) -> System.out.println(key.getName() + " " + value));

        // 21. Zwróć firmę która najwięcej wydaje na artykuły biurowe






        System.out.println();
        System.out.println("21.");
        Optional<Company> optMaxBiuro_Zad21 = companies.stream()
                .max(Comparator.comparingDouble(
                        c -> c.getPurchaseList()
                        .stream()
                        .filter(p -> p.getProduct().getName().equalsIgnoreCase("pen")
                                || p.getProduct().getName().equalsIgnoreCase("pencil")
                                || p.getProduct().getName().equalsIgnoreCase("paper")
                                || p.getProduct().getName().equalsIgnoreCase("clip")
                                || p.getProduct().getName().equalsIgnoreCase("scisors")
                                || p.getProduct().getName().equalsIgnoreCase("puncher")
                                )
                        .mapToDouble(v -> v.getProduct().getPrice() * v.getQuantity()).sum()
                ));

        if (optMaxBiuro_Zad21.isPresent()) {
            Company maxBiuroZad_21 = optMaxBiuro_Zad21.get();
            System.out.println("Firma, która najwięcej wydaje na art. biurowe to: " + maxBiuroZad_21.getName());
        }

        // 22. Zwróć firmy posortowane po ilości wydanych pieniędzy na paliwo (zrób mapę Map<Company, Double>)

        System.out.println();
        System.out.println("22");
        companies.stream()
                .sorted(Comparator.comparingDouble(company -> company.getPurchaseList()
                .stream()
                .filter(purchase -> purchase.getProduct().getName().startsWith("Fuel"))
                .mapToDouble(purchase -> purchase.getProduct().getPrice() * purchase.getQuantity())
                .sum()))
                .forEach(company -> System.out.println(company.getName() + " " + company.getCityHeadquarters()));






        System.out.println();
        System.out.println("22.a");
        System.out.println("Firmy posortowane rosnąco.");
        Map<Company, Double> mapaZad_22 = companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList()
                            .stream()
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Fuel"))
                            .mapToDouble(p -> p.getQuantity() * p.getProduct().getPrice()).sum()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        mapaZad_22.forEach((key, value) -> System.out.println(key.getName() + " " + value));



        System.out.println();
        System.out.println("Firmy posortowane malejąco.");
            Map<Company, Double> moneyForNothing = companies.stream().collect(Collectors.toMap(
                    co -> co,
                    co -> co.getPurchaseList()
                            .stream()
                            .filter(p -> p.getProduct().getName().startsWith("Fuel"))
                            .mapToDouble(p -> p.getQuantity() * p.getProduct().getPrice()).sum()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

            moneyForNothing.entrySet().forEach(companyDoubleEntry -> System.out.println(companyDoubleEntry.getKey().getName() + " " + companyDoubleEntry.getValue()));

        // 23. Zwróć wszystkie produkty które kupione były na kilogramy

        System.out.println();
        System.out.println("23");
        Set<Product> set_zad_23 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> purchase.getUnit().equals(UNIT.KILOGRAM))
                .map(purchase -> purchase.getProduct())
                .collect(Collectors.toSet());
        for (Product product : set_zad_23) {
            System.out.println(product.getName());
        }


        System.out.println();
        System.out.println("23.");
        Set<Product> setZad_23 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream()
                .filter(pur -> pur.getUnit().equals(UNIT.KILOGRAM)))
                .map(purchase -> purchase.getProduct())
                .collect(Collectors.toSet());

        System.out.println("set produktów kupionych na kilogramy:");
        for (Product product : setZad_23) {
            System.out.println(product.getName());
        }


        // 24. Zwróć listę zakupów (obiektów purchase) kupionych przez firmy z Detroit w miesiącu lutym. posortuj je po kwocie.

        List<Purchase> list_zad_24 = companies.stream()
                .filter(company -> company.getCityHeadquarters().startsWith("Detro"))
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 2)
//                .collect(Collectors.toList())
//                .stream()
                .sorted(Comparator.comparingDouble(purchase -> purchase.getProduct().getPrice() * purchase.getQuantity()))
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("24");
        for (Purchase purchase : list_zad_24) {
            System.out.println(purchase.getProduct().getName());
        }


        System.out.println();
        System.out.println("24.");
        List<Purchase> listaZad_24 = companies.stream()
                .filter(company -> company.getCityHeadquarters().equalsIgnoreCase("detroit"))
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(p -> p.getPurchaseDate().getMonth().getValue() == 2)
//                .sorted(new Comparator<Purchase>() {
//                    @Override
//                    public int compare(Purchase o1, Purchase o2) {
//                        if (o1.getProduct().getPrice() * o1.getQuantity() > o2.getProduct().getPrice() * o2.getQuantity()) {
//                            return -1;
//                        } else if (o2.getProduct().getPrice() * o2.getQuantity() > o1.getProduct().getPrice() * o1.getQuantity()) {
//                            return 1;
//                        }
//                        return 0;
//                    }
//                })
                .sorted(Comparator.comparingDouble(value -> value.getProduct().getPrice() * value.getQuantity()))
//                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Lista zakupów firm z Detroit z lutego posortowana:");
        for (Purchase purchase : listaZad_24) {
            System.out.println(purchase.getProduct().getName() + " " + purchase.getProduct().getPrice() * purchase.getQuantity());
        }

        // 25. Zwróć ilość biur które wynajęte były w miesiącu lutym.
        double zad_25test = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getPurchaseDate().getMonth().getValue() == 2 && purchase.getProduct().getName().startsWith("Office"))
                .mapToDouble(value -> value.getQuantity()).sum();
        System.out.println();
        System.out.println("25.test");
        System.out.println(zad_25test);

        double zad_25 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 2)
                .filter(purchase -> purchase.getProduct().getName().startsWith("Office"))
                .mapToDouble(purchase -> purchase.getQuantity())
                .sum();
        System.out.println();
        System.out.println("25");
        System.out.println(zad_25);



        System.out.println();
        System.out.println("25.");
        double numberOffices = companies.stream()
                .mapToDouble(company -> company.getPurchaseList()
                        .stream()
                        .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 2)
                        .filter(purchase -> purchase.getProduct().getName().startsWith("Office"))
                        .mapToDouble(purchase -> purchase.getQuantity())
                        .sum())
                .sum();

        System.out.println("Ilość biur wynajętych w lutym: " + numberOffices);

        // 26. Zwróć Mapę (Map<Company, Integer>). w mapie umieść wpisy Firma - > ilość biur które wynajęły w dowolnym okresie.

        Map<Company, Double> map_zad28test = companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Office"))
                            .mapToDouble(value -> value.getQuantity())
                            .sum()
                ));




        System.out.println();
        System.out.println("26.");
        Map<Company, Integer> mapaZad_26 = companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList()
                            .stream()
                            .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                            .mapToInt(purchase -> (int) purchase.getQuantity())
                            .sum()));

        System.out.println("Mapa: firma - ilość wynajętych biur:");
        mapaZad_26.forEach((key, value) -> System.out.println(key.getName() + " " + key.getCityHeadquarters() + " " + value));

        // 26a. Zwróć Mapę (Map<String, Integer>). w mapie umieść wpisy Nazwa firmy - > ilość biur które firma wynajęła w dowolnym okresie (uwaga: jeśli firma ma oddziały w kilku miastach trzeba zrobić merging (o1, o2)).






        System.out.println();
        System.out.println("26a.");
        Map<String, Integer> mapaZad_26a = companies.stream()
                .collect(Collectors.toMap(
                        company -> company.getName(),
                        company -> company.getPurchaseList()
                                .stream()
                                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                                .mapToInt(purchase -> (int) purchase.getQuantity()).sum(),
                        (e1, e2) -> e1 + e2));

        System.out.println("Mapa: nazwa firmy - ilość wynajętych biur:");
        mapaZad_26a.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println();
        System.out.println("26.aa");
        Set<String> set_26aa = companies.stream()
                .map(company -> company.getName())
                .collect(Collectors.toSet());

        Map<String, Integer> map_zad26aa = set_26aa.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> companies.stream()
                            .filter(company -> company.getName().equals(n))
                            .flatMap(company -> company.getPurchaseList()
                            .stream())
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Office"))
                            .mapToInt(purchase -> (int) purchase.getQuantity())
                            .sum()
                ));
        System.out.println();
        System.out.println("26.aa");
        map_zad26aa.forEach((key, value) -> System.out.println(key + " " + value));


        System.out.println();
        System.out.println("26b.");
//        Map<String, Integer> mapaZad_26b =
//                companies.stream()
//                .collect(Collectors.groupingBy(
//                        company -> company.getName(),
//                      dlaczego nie mogę pisać
//                        company -> company.
//                        Collectors.mapping(company -> company.getPurchaseList()
//                            .stream()
//                            .filter(purchase -> purchase.getProduct().getName().startsWith("Office"))
//                            .mapToInt(purchase -> (int) purchase.getQuantity()).sum())));


        // 27. *Wypisz "Nazwa firmy: XYZ, ilość zakupionych telefonów apple: X" dla każdej firmy która kupiła telefon apple. Wypisy powinny być posortowane (na szczycie powinna być firma która kupiła ich najwięcej).

        Set<String> set_27 = companies.stream()
                .filter(company -> company.getPurchaseList()
                    .stream()
                    .anyMatch(purchase -> purchase.getProduct().getName().startsWith("Apple Pho")))
                .map(company -> company.getName())
                .collect(Collectors.toSet());

        Map<String, Double> map_zad_27 = set_27.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> companies.stream()
                            .filter(company -> company.getName().equals(n))
                            .flatMap(company -> company.getPurchaseList()
                            .stream())
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Apple Ph"))
                            .mapToDouble(purchase -> purchase.getQuantity())
                            .sum()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println();
        System.out.println("27");
        map_zad_27.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println();
        System.out.println("27.");
        Set<String> setZad_27 = companies.stream()
                .filter(company -> company
                        .getPurchaseList()
                        .stream()
                        .anyMatch(purchase -> purchase.getProduct().getName().startsWith("Apple")))
                .map(company -> company.getName())
                .collect(Collectors.toSet());

        System.out.println("Set firm, które kupiły telefon Apple:");
        for (String company : setZad_27) {
            System.out.println(company);
        }

        Map<String, Double> mapaZad_27 = setZad_27.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> companies.stream()
                            .filter(company -> company.getName().equals(c))
                            .flatMapToDouble(company -> company.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Apple"))
                            .mapToDouble(purchase -> purchase.getQuantity())).sum()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println();
        System.out.println("Mapa: nazwa firmy - ilość zakupionych telefonów Apple:");
        mapaZad_27.forEach((key, value) -> System.out.println(key + " " + value));

        // 28. Znajdź firme która posiada siedzibę w więcej niż jednym mieście. Posortuj firmy po ilości siedzib, wypisz tylko te które mają więcej niż 1 siedzibę.


        System.out.println();
        System.out.println("28");
        Set<String> set_zad_28 = companies.stream()
                .map(company -> company.getName())
                .collect(Collectors.toSet());

        Map<String, List<Company>> map_zad_28 = set_zad_28.stream()
                .collect(Collectors.toMap(
                        m -> m,
                        m -> companies.stream()
                            .filter(company -> company.getName().equals(m))
                            .collect(Collectors.toList())
                ));

        map_zad_28.entrySet()
                .stream()
                .filter(stringListEntry -> stringListEntry.getValue().size() > 1)
                .sorted(Map.Entry.comparingByValue(new Comparator<List<Company>>() {
                    @Override
                    public int compare(List<Company> o1, List<Company> o2) {
                        if (o1.size() > o2.size()) {
                            return -1;
                        } else if (o1.size() < o2.size()) {
                            return 1;
                        } else {
                            return 0;
                        }

                    }
                }))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new))
                .forEach((key, value) -> System.out.println(key + " " + value.size()));




        System.out.println();
        System.out.println("28.");
        Set<String> setZad_28 = companies.stream()
                .map(company -> company.getName()).collect(Collectors.toSet());

        for (String s : setZad_28) {
            System.out.println(s);
        }

        Map<String, Long> mapa_Zad_28 = setZad_28.stream()
                .collect(Collectors.toMap(
                        m -> m,
                        m -> companies.stream()
                            .filter(company -> company.getName().equals(m))
                            .count()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println();
        System.out.println("Mapa: nazwa firmy - ilość firm:");
        mapa_Zad_28.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println();
        System.out.println("Mapa: nazwa firmy - ilość firm, gdy ilość > 1:");
        Set<Map.Entry<String, Long>> entrySetZad_28 = mapa_Zad_28.entrySet();
        for (Map.Entry<String, Long> stringLongEntry : entrySetZad_28) {
            if (stringLongEntry.getValue() > 1) {
                System.out.println(stringLongEntry.getKey() + " " + stringLongEntry.getValue());
            }
        }

        System.out.println();
        mapa_Zad_28.entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey() + " " + stringLongEntry.getValue()));

        // 29. Wypisz ilość kilogramów cukru zużywaną przez "Detroit Bakery"
        double zad_29Test = companies.stream()
                .filter(company -> company.getName().startsWith("Detroit Bak"))
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getProduct().getName().startsWith("Suga"))
                .mapToDouble(value -> value.getQuantity())
                .sum();

        double zad_29 = companies.stream()
                .filter(company -> company.getName().startsWith("Detroit Bak"))
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> purchase.getProduct().getName().startsWith("Sug"))
                .mapToDouble(purchase -> purchase.getQuantity())
                .sum();
        System.out.println();
        System.out.println("29");
        System.out.println(zad_29);



        double sugar = companies
                .stream()
                .filter(company -> company.getName().equals("Detroit Bakery"))
                .flatMap(company -> company.getPurchaseList()
                .stream()
                .filter(purchase -> purchase.getProduct().getName().equals("Sugar")))
                .mapToDouble(purchase -> purchase.getQuantity()).sum();
        System.out.println();
        System.out.println("29.");
        System.out.println("Detroit Bakery zużywa cukru kg: " + sugar);

        double sum = companies
                .stream()
                .filter(c -> c.getName().equalsIgnoreCase("Detroit Bakery"))
                .mapToDouble(c -> c.getPurchaseList()
                        .stream()
                        .filter(p -> p.getProduct().getName().equalsIgnoreCase("sugar"))
                        .mapToDouble(Purchase::getQuantity)
                        .sum())
                .sum();

        System.out.println("Sum of sugar used by Detroit Bakery equals: " + sum);

        // 30. Wypisz wszystkie zakupy firmy "Solwit".
        System.out.println();
        System.out.println("30.test");
        companies.stream()
                .filter(company -> company.getName().startsWith("Solwit"))
                .flatMap(company -> company.getPurchaseList().stream())
                .forEach(System.out::println);



        System.out.println();
        System.out.println("30.");
        System.out.println("Zakupy firmy Solwit:");
        companies
                .stream()
                .filter(company -> company.getName().equals("Solwit"))
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .forEach(purchase -> System.out.println(purchase.getProduct().getName() + " " + purchase.getQuantity()));

        // 31. Wypisz wszystkie produkty które są tańsze (jednostkowo) niż 3$.
        System.out.println();
        System.out.println("31.test");
        companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getProduct().getPrice() < 3)
                .map(purchase -> purchase.getProduct())
                .collect(Collectors.toSet())
                .stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("31");

        Set<Product> set_31 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .map(purchase -> purchase.getProduct())
                .filter(product -> product.getPrice() < 3)
                .collect(Collectors.toSet());

        set_31.stream()
                .forEach(product -> System.out.println(product.getName() + " " + product.getPrice()));

        // 32. Wypisz ile sprzedano najtańszego produktu

        Optional<Product> opt_zad32test = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .map(purchase -> purchase.getProduct())
                .min(Comparator.comparingDouble(Product::getPrice));

        if (opt_zad32test.isPresent()) {
            Product min_zad32test = opt_zad32test.get();
            System.out.println();
            System.out.println("32.test");
            System.out.println(min_zad32test);

            double zad32test = companies.stream()
                    .flatMap(company -> company.getPurchaseList().stream())
                    .filter(purchase -> purchase.getProduct().equals(min_zad32test))
                    .mapToDouble(value -> value.getQuantity())
                    .sum();

            System.out.println(zad32test);
        }


        System.out.println();
        System.out.println("32");
        Optional<Product> opt_zad_32 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .map(purchase -> purchase.getProduct())
                .min(Comparator.comparingDouble(product -> product.getPrice()));

        if (opt_zad_32.isPresent()) {
            Product zad_32 = opt_zad_32.get();
            System.out.println("najtańszy produkt: " + zad_32.getName());

            double double_zad_32 = companies.stream()
                    .flatMap(company -> company.getPurchaseList()
                    .stream())
                    .filter(purchase -> purchase.getProduct().equals(zad_32))
                    .mapToDouble(purchase -> purchase.getQuantity())
                    .sum();

            System.out.println("ilość najtańszego produktu: " + double_zad_32);
        }

        double zad_32 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> purchase.getProduct().getName().startsWith("Penc"))
                .mapToDouble(purchase -> purchase.getQuantity())
                .sum();

        System.out.println(zad_32);

        // 33. Firma "Take me home" zajmuje się transportem. Na początku działalności kupiła wiele samochodów do użytku. Oblicz ile litrów paliwa (średnio) spalają ich samochody (zakładamy że wszystkie palą benzynę i że tankowane są wszystkie.
        System.out.println();
        System.out.println("33test");
        double zad_33test = companies.stream()
                .filter(company -> company.getName().startsWith("Take me"))
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getProduct().getName().startsWith("Fuel, ga"))
                .mapToDouble(value -> value.getQuantity())
                .sum();
        System.out.println(zad_33test);

        System.out.println();
        System.out.println("33");
        double zad_33_ilosc_samochodow = companies.stream()
                .filter(company -> company.getName().startsWith("Take me"))
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> purchase.getProduct().getName().startsWith("Fiat")
                    || purchase.getProduct().getName().startsWith("Audi")
                    || purchase.getProduct().getName().startsWith("Skoda")
                    || purchase.getProduct().getName().startsWith("Ford"))
                .mapToDouble(purchase -> purchase.getQuantity())
                .sum();

        System.out.println("ilość samochodów: " + zad_33_ilosc_samochodow);

        double zad_33_ilosc_paliwa = companies.stream()
                .filter(company -> company.getName().startsWith("Take me"))
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> purchase.getProduct().getName().startsWith("Fuel, gas"))
                .mapToDouble(purchase -> purchase.getQuantity())
                .sum();

        System.out.println("ilość paliwa: " + zad_33_ilosc_paliwa);

        System.out.println("średnie zużycie paliwa: " + zad_33_ilosc_paliwa / zad_33_ilosc_samochodow);

        // 34. Wypisz firmę która zużywa najwięcej kawy
        System.out.println();
        System.out.println("34test");
        Optional<Company> opt_zad_34test = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList()
                        .stream()
                        .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                        .mapToDouble(value -> value.getQuantity())
                        .sum()
                ));

        if (opt_zad_34test.isPresent()) {
            Company zad34test = opt_zad_34test.get();
            System.out.println(zad34test);
        }

        System.out.println();
        System.out.println("34");
        Optional<Company> opt_zad_34 = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList()
                        .stream()
                        .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                        .mapToDouble(purchase -> purchase.getQuantity())
                        .sum()
                ));

        if (opt_zad_34.isPresent()) {
            Company zad_34 = opt_zad_34.get();
            System.out.println(zad_34.getName() + " " + zad_34.getCityHeadquarters());
        }

        // 35. Wypisz firmę która zużywa najwięcej na papier.
        System.out.println();
        System.out.println("35test");
        Optional<Company> opt_zad35test = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList()
                        .stream()
                        .filter(purchase -> purchase.getProduct().getName().startsWith("Pap"))
                        .mapToDouble(value -> value.getQuantity() * value.getProduct().getPrice())
                        .sum()
                ));
        if (opt_zad35test.isPresent()) {
            Company zad35test = opt_zad35test.get();
            System.out.println(zad35test);
        }

        System.out.println();
        System.out.println("35");
        Optional<Company> opt_zad_35 = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList()
                        .stream()
                        .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("paper"))
                        .mapToDouble(purchase -> purchase.getProduct().getPrice() * purchase.getQuantity())
                        .sum()
                ));

        if (opt_zad_35.isPresent()) {
            Company zad_35 = opt_zad_35.get();
            System.out.println(zad_35.getName() + " " + zad_35.getCityHeadquarters());
        }

        // 36. Wypisz wszystkie produkty które były kupowane w większych ilościach niż 50 (jednostek/kilogramów)
        System.out.println();
        System.out.println("36test");
        Set<Product> set36test = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getUnit().equals(UNIT.UNIT) || purchase.getUnit().equals(UNIT.KILOGRAM))
                .filter(purchase -> purchase.getQuantity() > 50)
                .map(purchase -> purchase.getProduct())
                .collect(Collectors.toSet());
        set36test.forEach(System.out::println);

        System.out.println();
        System.out.println("36");
        companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> purchase.getQuantity() > 50)
                .map(purchase -> purchase.getProduct())
                .collect(Collectors.toSet())
                .stream()
                .forEach(product -> System.out.println(product.getName()));

        // 37. Wypisz ile każda z firm zużywa na kawę (ile pieniędzy wydaje) (jako wynik zwróć mapę Map<String, Double> gdzie kluczem jest nazwa firmy, wartością jest ilość pieniędzy wydawanej na kawę
        System.out.println();
        System.out.println("37test");
        Map<String, Double> map_zad37test = companies.stream()
                .collect(Collectors.toMap(
                        c -> c.getName(),
                        c -> c.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                            .mapToDouble(value -> value.getQuantity() * value.getProduct().getPrice())
                            .sum(),
                        (e1, e2) -> e1 + e2
                ));

        map_zad37test.forEach((k, v) -> System.out.println(k + " " + v));



        System.out.println();
        System.out.println("37.a");
        Map<String, Double> map_zad_37a = companies.stream()
                .collect(Collectors.toMap(
                        c -> c.getName(),
                        c -> c.getPurchaseList()
                            .stream()
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                            .mapToDouble(purchase -> purchase.getProduct().getPrice() * purchase.getQuantity())
                            .sum(),
                        (e1, e2) -> e1 + e2
                ));

        map_zad_37a.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println();
        System.out.println("37test2");
        Set<String> set37test2 = companies.stream()
                .map(company -> company.getName())
                .collect(Collectors.toSet());

        Map<String, Double> map_zad37test2 = set37test2.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> companies.stream()
                            .filter(company -> company.getName().equals(s))
                            .flatMap(company -> company.getPurchaseList().stream())
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                            .mapToDouble(value -> value.getQuantity() * value.getProduct().getPrice())
                            .sum()
                ));

        map_zad37test2.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println();
        System.out.println("37.b");
        Set<String> zad_37b = companies.stream()
                .map(company -> company.getName())
                .collect(Collectors.toSet());

        Map<String, Double> map_zad_37b = zad_37b.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n -> companies.stream()
                            .filter(company -> company.getName().equals(n))
                            .flatMap(company -> company.getPurchaseList()
                            .stream())
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                            .mapToDouble(purchase ->purchase.getProduct().getPrice() * purchase.getQuantity())
                            .sum()
                ));

        map_zad_37b.forEach((key, value) -> System.out.println(key + " " + value));

        // 38. Wypisz średnie zużycie kawy na pracownika (wypisz w postaci proporcji. Jeśli firma kupiła 30 kilogramów i ma 20 pracowników to ma 1.5 kg / pracownika [w całości okresu])

        System.out.println();
        System.out.println("38test");
        Map<Company, Double> map_zad38test = companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList().stream()
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                            .mapToDouble(value -> value.getQuantity()).sum() / c.getEmployees()
                ));


        System.out.println();
        System.out.println("38");
        Map<Company, Double> map_zad_38 = companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList()
                            .stream()
                            .filter(purchase -> purchase.getProduct().getName().startsWith("Coff"))
                            .mapToDouble(purchase -> purchase.getQuantity())
                            .sum() / c.getEmployees()
                ));

        map_zad_38.forEach((key, value) -> System.out.println(key.getName() + " " + key.getCityHeadquarters() + " " + value));

        // 39. Wypisz jaki produkt poza paliwem cieszy się największą popularnością (zwróć go) (find first)
        System.out.println();
        System.out.println("39test");
        Set<Product> set_zad39test = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .map(purchase -> purchase.getProduct())
                .collect(Collectors.toSet());

        Map<Product, Double> map_zad39test = set_zad39test.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        p -> companies.stream()
                            .flatMap(company -> company.getPurchaseList().stream())
                            .filter(purchase -> purchase.getProduct().equals(p))
                            .mapToDouble(Purchase::getQuantity)
                            .sum()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new))
                ;

        map_zad39test.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println();
        System.out.println("lista");
        List<Map.Entry<Product, Double>> entryList39test = map_zad39test.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        entryList39test.forEach(System.out::println);

        // uwaga: największa popularność tzn. kupiony na największą kwotę (można jeszcze zrobić kupiony w największej
        // ilości - wtedy w max bez mnożenia razy cena)
        System.out.println();
        System.out.println("39");
        Optional<Purchase> opt_zad_39 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .filter(purchase -> !purchase.getProduct().getName().startsWith("Fuel"))
                .max(Comparator.comparingDouble(purchase -> purchase.getProduct().getPrice() * purchase.getQuantity()));

        if (opt_zad_39.isPresent()) {
            Purchase zad_39 = opt_zad_39.get();
            System.out.println(zad_39.getProduct().getName());
        }

        // chcę zrobić mapę: Product - Ouantity
        System.out.println();
        System.out.println("39.");
        Set<Product> set_zad_39 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
                .map(purchase -> purchase.getProduct())
                .filter(product -> !product.getName().startsWith("Fuel"))
                .collect(Collectors.toSet());

        set_zad_39.forEach(product -> System.out.println(product.getName()));

        Map<Product, Double> map_zad_39 = set_zad_39.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        p -> companies.stream()
//                            .filter(company -> company.getPurchaseList()
//                                .stream()
//                                .map(purchase -> purchase.getProduct())
//                                .anyMatch(product -> product.equals(p)))
                            .flatMap(company -> company.getPurchaseList()
                            .stream())
//                                .filter(purchase -> !purchase.getProduct().getName().startsWith("Fuel"))
                            .filter(purchase -> purchase.getProduct()== p)
                            .mapToDouble(purchase -> purchase.getQuantity())
                            .sum()
                ));

        System.out.println();
        map_zad_39.forEach((key, value) -> System.out.println(key.getName() + " " + value));

        System.out.println();
        map_zad_39 = map_zad_39.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        Optional<Map.Entry<Product, Double>> productQuantity = map_zad_39.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst();

        if(productQuantity.isPresent()){
            Map.Entry<Product, Double> entry_zad_39 = productQuantity.get();
            System.out.println("Największą popularnością cieszy się: " + entry_zad_39.getKey().getName());
        }

        System.out.println();
        map_zad_39.forEach((key, value) -> System.out.println(key.getName() + " " + value));


        // 40. Znajdź produkty które były kupowane zarówno w kilogramach jak i w sztukach

        System.out.println();
        System.out.println("40test");
        Set<Product> set_zad40test = companies.stream()
                .flatMap(company -> company.getPurchaseList().stream())
                .filter(purchase -> purchase.getUnit().equals(UNIT.KILOGRAM))
                .map(purchase -> purchase.getProduct())
                .collect(Collectors.toSet());
        set_zad40test.forEach(System.out::println);


        System.out.println();
        System.out.println("40");
        Set<Product> set_zad_40 = companies.stream()
                .flatMap(company -> company.getPurchaseList()
                .stream())
//                .filter(purchase -> purchase.getUnit().equals(UNIT.KILOGRAM))
                .map(purchase -> purchase.getProduct())
                .collect(Collectors.toSet());

//        System.out.println();
//        System.out.println("40");
        set_zad_40.forEach(System.out::println);

        Map<Product, Set<UNIT>> map_zad_40 = set_zad_40.stream()
                .collect(Collectors.toMap(
                        p -> p,
                        p -> companies.stream()
                            .flatMap(company -> company.getPurchaseList()
                            .stream())
                            .filter(purchase -> purchase.getProduct() == p)
                            .map(purchase -> purchase.getUnit())
//                            .filter(unit -> unit == UNIT.UNIT)
                            .collect(Collectors.toSet())
                ));
        System.out.println();
        System.out.println("map");
        map_zad_40.entrySet().stream()
                .filter(productListEntry -> productListEntry.getValue().contains(UNIT.UNIT) && productListEntry.getValue().contains(UNIT.KILOGRAM))
//                .filter(productListEntry -> productListEntry.getValue().size() > 1)
                .forEach(productListEntry -> System.out.println(productListEntry.getKey().getName() + " " + productListEntry.getValue()));

// 40. Wymyśl 5 ciekawych zapytań i spróbuj je zrealizować. Najciekawsze polecenie otrzyma nagrodę-niespodziankę z Baltimore :P



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

    // 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
    public static Optional<Company> zwrocCompanyKijevMaxEmployess2(List<Company> companies) {
        return companies.stream()
                .filter(company -> company.getCityHeadquarters().equals("Kijev"))
                .max(Comparator.comparingInt(Company::getEmployees));
    }

    // 6. Zwróć firmę z najkrótszą nazwą
    public static Optional<String> zwrocMinName(List<Company> companies) {
        return companies.stream().map(company -> company.getName())
                .min(Comparator.comparingInt(value -> value.length()));
//                .min((n1, n2) -> Integer.compare(n1.length(), n2.length()));
    }

    public static Optional<Company> zwrocMinName2(List<Company> companies) {
        return companies.stream()
                .min(Comparator.comparingInt(value -> value.getName().length()));
    }

    // 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.
    public static Optional<Company> noKiLoDeMinProducts(List<Company> companies) {
        return companies.stream()
                .filter(company -> !company.getName().equals("London") || !company.getName().equals("Detroit") || !company.getName().equals("Kijev"))
//                .min((c1, c2) -> Integer.compare(c1.getPurchaseList().size(), c2.getPurchaseList().size()));
        .min(Comparator.comparingInt(value -> value.getPurchaseList().size()));
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

//    public static Map<String, Integer> zwrocMapeNazwaIloscPracownikow2(List<Company> companies) {
//        return companies.stream()
//                .collect(Collectors.toMap(company -> company.getName(), company -> company.getEmployees()));
//    }

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
                .collect(Collectors.groupingBy(c -> c.getCityHeadquarters(), Collectors.toList()));
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
