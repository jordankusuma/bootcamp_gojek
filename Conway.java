package com.company;
import java.util.Scanner;

public class Conway {
    private int[][] total;
    private int turn;

    public Conway(NewCell cell, int turn){
        int[][] total = new int[cell.getLength()][cell.getWidth()];
        this.turn = turn;
    }

    public void setArrayValues(NewCell cell){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers between 1 and 0 for the array: ");
        for(int i = 0; i < cell.getLength(); i++) {
            for(int j = 0; j < cell.getWidth(); j++) {
                int input = sc.nextInt();
                while (input != 0 && input != 1) {
                    System.out.println("Enter numbers again: ");
                    input = sc.nextInt();
                }
                cell.setArraywithIndex(i, j, input);
            }
            System.out.println("");
        }
    }

    public int[][] getArrayCells(NewCell cell){
        return cell.getArray();
    }

    public int[][] cekAliveTotal(NewCell cell, Conway conway){
        for (int i = 0;i<cell.getLength();i++){
            for (int j = 0;j<cell.getWidth();j++){
                conway.setTotalwithIndex(i, j, cell.checkAliveCells(i, j));
            }
        }
        return conway.getTotal();
    }

    public int[][] getTotal() {
        return this.total;
    }

    public int getTotalwithIndex(int posX, int posY){
        return this.total[posX][posY];
    }

    public void setTotalwithIndex(int posX, int posY, int value) {
        this.total[posX][posY] = value;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
