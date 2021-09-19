package com.company;
import java.util.Scanner;

public class Conway {
    private NewCell[][] array;
    private NewCell[][] answer;
    private int[][] total;
    private int turn;

    public Conway(NewCell cell, int turn){
        NewCell[][] array = new NewCell[cell.getLength()][cell.getWidth()];
        NewCell[][] answer = new NewCell[cell.getLength()][cell.getWidth()];
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
                array[i][j].setArraywithIndex(i, j, input);
            }
            System.out.println("");
        }
    }

    public int[][] cekAliveTotal(NewCell cell){
        for (int i = 0;i<cell.getLength();i++){
            for (int j = 0;j<cell.getWidth();j++){
                total[i][j] = array[i][j].checkAliveCells(i, j);
            }
        }
        return total;
    }

}
