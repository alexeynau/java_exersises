package ru.mirea.lab_1;

public class Array {
    private int[] array;
    private int n;

    public Array(int n){
        this.n = n;
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random()*100);
        }
    }

    public String toString() {
        String series = String.valueOf(array[0]);
        for (int i = 1; i < n; i++) {
            series += ", " + array[i];
        }
        return "Array: " + series;
    }

    public void sort(){
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++){
                if (array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
