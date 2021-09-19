package com.company;
import java.util.Scanner;

public class Conway {
    private NewCell[][] array;
    private NewCell[][] answer;
    private int turn;

    public Conway(NewCell cell, int turn){
        NewCell[][] array = new NewCell[cell.getLength()][cell.getWidth()];
        NewCell[][] answer = new NewCell[cell.getLength()][cell.getWidth()];
        this.turn = turn;
    }

    public void setArrayValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers between 1 and 0 for the array: ");
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
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

    
}
