package com.model.game;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor

public class Plansza {
    private final int MAP_SIZE;
    private char[][] map;
    private Gracz gracz;

    public Plansza(int size, Gracz gracz) {
        this.MAP_SIZE = size;
        this.map = new char[MAP_SIZE][MAP_SIZE];
        initializeMap();
        this.gracz = gracz;
    }

    private void initializeMap() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = ' ';
            }
        }
    }

    public void drawMap() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if(i == gracz.pozycjaY && j==gracz.pozycjaX){
                    System.out.print('c');
                }else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }
    }

//    public void drawBox(int size) {
//        for (int i = 0; i < size; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//        for (int i = 0; i < (size - 2); i++) {
//            System.out.print("*");
//            for (int j = 0; j < (size - 2); j++) {
//                if(i == gracz.pozycjaY && j==gracz.pozycjaX){
//                    System.out.print('c');
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("*");
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.print("*");
//        }
//    }
}
