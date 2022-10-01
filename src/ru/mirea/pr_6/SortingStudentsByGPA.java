package ru.mirea.pr_6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGPA(), o2.getGPA());
    }

    public SortingStudentsByGPA(Student[] studentsList) {
        quickSort(studentsList, 0, 9);
    }

    public void quickSort(Student[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private int partition(Student[] arr, int begin, int end) {
        Student pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (compare(arr[j], pivot) != -1) {
                i++;
                Student swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Student swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
