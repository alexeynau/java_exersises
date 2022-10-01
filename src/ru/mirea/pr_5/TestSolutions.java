package ru.mirea.pr_5;
import java.util.Scanner;

public class TestSolutions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1 задание
        System.out.println("1 exercise");
        int a = input.nextInt();
        int b = input.nextInt();
        new Solution().Ex3(a, b);

        // 2 задание
        System.out.println("\n2 exercise");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(new Solution().Ex4(a, b));

        // 3 задание
        System.out.println("3 exercise");
        a = input.nextInt();
        System.out.println(new Solution().sumOfNums(a));

    }
}
