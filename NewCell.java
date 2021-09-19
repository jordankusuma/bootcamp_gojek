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

    public boolean getStatusCell(int number){
        return number == 1;
    }

    //Any live cell with fewer than two live neighbours dies, as if by underpopulation.
    //Any live cell with two or three live neighbours lives on to the next generation.
    //Any live cell with more than three live neighbours dies, as if by overpopulation.
    //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
    public int checkAliveCells(int length, int width){
        int originLength = length;
        int originWidth = width;
        int total = 0;
        for (int i = -1;i <= 1;i++){
            length += i;
            for (int j = -1;j<=1;j++) {
                width += j;
                if (length < this.length && width < this.width && length >= 0 && width >= 0) {
                    if (getStatusCell(this.array[length][width]) && (length != originLength || width != originWidth))
                        total++;
                }
                width = originWidth;
            }
            length = originLength;
        }
        return total;
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
