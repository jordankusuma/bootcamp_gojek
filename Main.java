package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NewCell cell = new NewCell(4, 4);
        Conway conway = new Conway(cell, 4);
        int[][] array = new int[cell.getLength()][cell.getWidth()];
        int[][] total = new int[cell.getLength()][cell.getWidth()];

        conway.setArrayValues(cell);

        array = conway.getArrayCells(cell);

        for (int i = 0;i<cell.getLength();i++){
            for (int j = 0;j<cell.getWidth();j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        total = conway.cekAliveTotal(cell, conway);

//        for (int i = 0;i<cell.getLength();i++){
//            for (int j = 0;j<cell.getWidth();j++){
//                System.out.print(total[i][j] + " ");
//            }
//            System.out.println("");
//        }

    }
}
