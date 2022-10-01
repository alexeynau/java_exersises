package ru.mirea.pr_6;

public class TestSorting {
    public static void main(String[] args) {
        Student[] studentList = new Student[10];

        for (int i = 0; i < 10; i++)
            studentList[i] = new Student("name" + i, (int) (Math.random() * 100));
        for (int i = 0; i < 10; i++)
            System.out.println(studentList[i]);

        new SortingStudentsByGPA(studentList);
        System.out.println("After sorting:");
        for (int i = 0; i < 10; i++)
            System.out.println(studentList[i]);
    }
}
