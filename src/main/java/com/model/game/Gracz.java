package com.model.game;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
//@AllArgsConstructor

public class Gracz {
    private int pozycjaX, pozycjaY;
    private char znakGracza;
    private boolean flagaPaint;
    List<Integer[]> list;

    public Gracz(int pozycjaX, int pozycjaY) {
        this.pozycjaX = pozycjaX;
        this.pozycjaY = pozycjaY;
        this.znakGracza = 'c';
        this.flagaPaint = false;
        this.list = new ArrayList<>();
    }

    public void moveUp(Plansza plansza) throws EndOfWayException {
        if (getPozycjaY() == 0) {
            throw new EndOfWayException();
        } else {
            pozycjaY--;
        }
        System.out.println("pozycjaY: " + getPozycjaY());
        System.out.println("pozycjaX: " + getPozycjaX());
    }

    public void moveDown(Plansza plansza) throws EndOfWayException {
        if (getPozycjaY() == plansza.getMAP_SIZE() - 1) {
            throw new EndOfWayException();
        } else {
            pozycjaY++;
        }
        System.out.println("pozycjaY: " + getPozycjaY());
        System.out.println("pozycjaX: " + getPozycjaX());
    }

    public void moveDown2() {
        pozycjaY = getPozycjaY() + 1;
    }

    public void dodajPozycjeDoListy() {
        Integer[] integers = new Integer[2];
        integers[0] = pozycjaX;
        integers[1] = pozycjaY;
        list.add(integers);
        System.out.println(Arrays.toString(integers));
    }
}
