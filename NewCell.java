package com.company;

public class NewCell {
    private int length;
    private int width;
    private int[][] array;
    private int[][] answer;

    public NewCell(int length, int width){
        this.length = length;
        this.width = width;
        this.array = new int[length][width];
        this.answer = new int[length][width];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArraywithIndex(int posX, int posY, int value) {
        this.array[posX][posY] = value;
    }

    public int[][] getAnswer() {
        return answer;
    }

    public void setAnswerwithIndex(int posX, int posY, int value) {
        this.answer[posX][posY] = value;
    }
}
