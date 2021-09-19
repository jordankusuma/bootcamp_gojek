package com.company.Pr_bootcamp_conway;
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

    public void printTotal(NewCell cell){
        System.out.println("Print total Alive Neighbours : ");
        for (int i = 0;i<cell.getLength();i++){
            for (int j = 0;j<cell.getWidth();j++){
                System.out.print(getTotalBasedIndex(i, j) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public int[][] getNextCellAlive(NewCell cell){
        for (int i = 0;i<cell.getLength();i++){
            for (int j = 0;j<cell.getWidth();j++){
                int total = getTotalBasedIndex(i, j);
                if (cell.getStatusCell(cell.getArrayBasedIndex(i, j)) && total < 2 || total > 3) {
                    cell.setAnswerwithIndex(i, j, 0);
                } else if (!cell.getStatusCell(cell.getArrayBasedIndex(i, j)) && total == 3) {
                    cell.setAnswerwithIndex(i, j, 1);
                } else {
                    cell.setAnswerwithIndex(i, j, cell.getArrayBasedIndex(i, j));
                }
            }
        }
        return cell.getAnswer();
    }

    public void getLifeCellForTurn(NewCell cell){
        cell.printArray();
        System.out.println("Print Answer for the next" + getTurn() + " turn");
        for (int i = 0;i<getTurn();i++){
            cekAliveTotal(cell);
            printTotal(cell);
            cell.setArray(getNextCellAlive(cell));
            cell.printAnswer();
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
