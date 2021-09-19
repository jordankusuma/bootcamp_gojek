package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width, turn : ");
        int length=sc.nextInt();
        int width=sc.nextInt();
        int turn=sc.nextInt();

        NewCell cell = new NewCell(length, width);
        Conway conway = new Conway(cell, turn);

        //input the array
        conway.setArrayValues(cell);

        //run conway game of life based on how many turns
        conway.getLifeCellForTurn(cell);
    }
}
