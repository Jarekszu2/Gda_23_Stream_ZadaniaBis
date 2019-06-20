package com.model.game;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Gracz {
    int pozycjaX, pozycjaY;


    public void moveUp(Plansza plansza) throws EndOfWayException {
        if (getPozycjaY() == 0) {
            throw new EndOfWayException();
        } else {
            pozycjaY = getPozycjaY() - 1;
        }
//        System.out.println("pozycjaY" + getPozycjaY());
//        System.out.println("MAP_SIZE" + plansza.getMAP_SIZE());
    }

    public void moveDown(Plansza plansza) throws EndOfWayException {
        if (getPozycjaY() == plansza.getMAP_SIZE() - 1) {
            throw new EndOfWayException();
        } else {
            pozycjaY = getPozycjaY() + 1;
        }
//        System.out.println("pozycjaY" + getPozycjaY());
//        System.out.println("MAP_SIZE" + plansza.getMAP_SIZE());
    }

    public void moveDown2() {
        pozycjaY = getPozycjaY() + 1;
    }
}
