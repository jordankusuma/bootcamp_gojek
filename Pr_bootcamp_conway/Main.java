package com.company.Pr_bootcamp_conway;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        sample input
//        0 0 1 0
//        1 0 1 0
//        0 1 1 0
//        0 0 0 0

//          0 1 0
//          0 0 1
//          1 1 1
//          0 0 0
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
