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

    public int[][] cekAliveTotal(NewCell cell){
        int[][] number = new int[cell.getLength()][cell.getWidth()];
        for (int i = 0;i<cell.getLength();i++){
            for (int j = 0;j<cell.getWidth();j++){
                number[i][j] = cell.checkAliveCells(i, j);
            }
        }
        setTotal(number);
        return getTotal();
    }

    public int[][] getNextCellAlive(NewCell cell){
        for (int i = 0;i<cell.getLength();i++){
            for (int j = 0;j<cell.getWidth();j++){

            }
        }
    }

    public void getLifeCellForTurn(NewCell cell){
        for (int i = 0;i<getTurn();i++){

        }
    }

    public int[][] getTotal() {
        return this.total;
    }

    public int getTotalBasedIndex(int posX, int posY){
        return this.total[posX][posY];
    }

    public void setTotal(int[][] value) {
        this.total = value;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
