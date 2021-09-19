package com.company;
import java.util.Scanner;

public class Conway {
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
                cell.setArraywithIndex(i, j, input);
            }
            System.out.println("");
        }
    }

    public int[][] getArrayCells(NewCell cell){
        return cell.getArray();
    }

    public int[][] cekAliveTotal(NewCell cell){
        for (int i = 0;i<cell.getLength();i++){
            for (int j = 0;j<cell.getWidth();j++){
                total[i][j] = cell.checkAliveCells(i, j);
            }
        }
        return total;
    }

    public void getNextCell(){

    }

//    public void getNextCell(){
//        for (int i = 0;i<total.length;i++){
//            for (int j = 0;j<total.length;j++){
//                System.out.print(total[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
}
