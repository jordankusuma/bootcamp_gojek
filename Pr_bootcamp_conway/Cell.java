//package com.company.Pr_bootcamp_conway;
//
//public class Cell {
//    private int length;
//    private int width;
//    private int[][] array;
//    private int[][] answer;
//
//    //constructor
//    public Cell(int length, int width, int[][] array){
//        this.length = length;
//        this.width = width;
//        this.array = array;
//        this.answer = new int[length][width];
//    }
//
//    //method for checking the status alive or not
//    public boolean checkStatus(int number){
//        return number == 1;
//    }
//
//    //Any live cell with fewer than two live neighbours dies, as if by underpopulation.
//    //Any live cell with two or three live neighbours lives on to the next generation.
//    //Any live cell with more than three live neighbours dies, as if by overpopulation.
//    //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
//    public int checkAliveFirstRow(int length, int width){
//        int total = 0;
//        int len = -1;
//        length += len;
//
//        int oriWidth = width;
//        for (int i = -1; i <= 1; i++) {
////            if (i < 0)
////                width += i;
////            else
////                width -= i;
//
//            width += i;
//
//            if (length < getLength() && width < getWidth() && length >= 0 && width >= 0) {
//                if (checkStatus(this.array[length][width]))
//                    total++;
//            }
//            width = oriWidth;
//        }
//        return total;
//    }
//
//    public int checkAliveSecondRow(int length, int width){
//        int total = 0;
//        int len = 0;
//        int oriLength = length;
//        length += len;
//
//        int oriWidth = width;
//        for (int i = -1; i <= 1; i++) {
////            if (i < 0)
////                width += i;
////            else
////                width -= i;
//
//            width += i;
//
//            if (length < getLength() && width < getWidth() && length >= 0 && width >= 0) {
////                System.out.print(length);
////                System.out.print(width);
////                System.out.println("Array" + this.array[length][width]);
//                if (checkStatus(this.array[length][width])){
//                    if (length != oriLength || width != oriWidth) {
//                        //System.out.println("a");
//                        total++;
//                    }
//                }
//            }
//            width = oriWidth;
//        }
//        //System.out.println("");
//        return total;
//    }
//
//    public int checkAliveThirdRow(int length, int width){
//        int total = 0;
//        int len = 1;
//        length += len;
//
//        int oriWidth = width;
//        for (int i = -1; i <= 1; i++) {
////            if (i < 0)
////                width += i;
////            else
////                width -= i;
//            width += i;
//
////            System.out.print(length);
////            System.out.print(width);
////            System.out.println("");
//
//            if (length < getLength() && width < getWidth() && length >= 0 && width >= 0) {
////                System.out.print(length);
////                System.out.print(width);
////                System.out.println("Array" + this.array[length][width]);
//                if (checkStatus(this.array[length][width]))
//                    total++;
//            }
//            width = oriWidth;
//        }
//        //System.out.println("");
//        return total;
//    }
//
//    public int[][] getNextCell(){
//        int total = 0;
//        for (int i = 0; i < this.length; i++){
//            for (int j = 0; j < this.width; j++){
//                int number = checkAliveFirstRow(i, j) + checkAliveSecondRow(i, j) + checkAliveThirdRow(i, j);
//                //int number = checkAlive(i, j);
//                total += number;
//                //System.out.print(total);
////                System.out.print(i);
////                System.out.print(j);
////                System.out.print(checkAliveFirstRow(i, j));
////                System.out.print(checkAliveSecondRow(i, j));
////                System.out.print(checkAliveThirdRow(i, j));
////                System.out.println("");
//                if (checkStatus(this.array[i][j]) && total < 2 || total > 3) {
//                    this.answer[i][j] = 0;
//                } else if (!checkStatus(this.array[i][j]) && total == 3) {
//                    this.answer[i][j] = 1;
//                } else {
//                    this.answer[i][j] = this.array[i][j];
//                }
//                total = 0;
//            }
//            //System.out.println("");
//        }
//        return this.answer;
//    }
//
//    //setter dan getter
//    public int getLength() {
//        return this.length;
//    }
//
//    public int getWidth() {
//        return this.width;
//    }
//
//    public int[][] getArray() {
//        return this.array;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public void setArray(int[][] array) {
//        this.array = array;
//    }
//}
