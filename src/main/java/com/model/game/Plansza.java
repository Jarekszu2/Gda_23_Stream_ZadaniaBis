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
        if (!gracz.isFlagaPaint()) {
            for (int i = -1; i < (MAP_SIZE + 1); i++) {
                System.out.print('X');
            }
            System.out.println();

            for (int i = 0; i < MAP_SIZE; i++) {
                System.out.print('X');
                for (int j = 0; j < MAP_SIZE; j++) {
                    if (i == gracz.getPozycjaY() && j == gracz.getPozycjaX()) {
                        System.out.print(gracz.getZnakGracza());
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println('X');
            }

            for (int i = -1; i < (MAP_SIZE + 1); i++) {
                System.out.print('X');
            }
        } else {
            for (int i = -1; i < (MAP_SIZE + 1); i++) {
                System.out.print('X');
            }
            System.out.println();

            for (int i = 0; i < MAP_SIZE; i++) {
                System.out.print('X');
                for (int j = 0; j < MAP_SIZE; j++) {
                    for (int k = 0; k < gracz.getList().size(); k++) {
                        if (i == gracz.getList().get(k)[1] && j == gracz.getList().get(k)[0]) {
                            System.out.println(gracz.getZnakGracza());
                        } else {
                            System.out.print(' ');
                        }
                    }
                }
                System.out.println('X');
            }

            for (int m = -1; m < (MAP_SIZE + 1); m++) {
                System.out.print('X');
            }
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

