package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NewCell cell = new NewCell(4, 4);
        Conway conway = new Conway(cell, 4);
        int[][] total = new int[cell.getLength()][cell.getWidth()];

        conway.setArrayValues(cell);
        total = conway.cekAliveTotal(cell);

        
    }
}
