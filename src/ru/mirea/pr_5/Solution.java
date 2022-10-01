package ru.mirea.pr_5;

public class Solution {
    private int sum = 0;

    public void Ex3(int min, int max) {
        if (min < max) {
            System.out.print(min + " ");
            Ex3(min + 1, max);
        }
        if (min > max){
            System.out.print(min + " ");
            Ex3(min - 1, max);
        }
        if (min == max) System.out.println(min);
    }

    public int Ex4(int k, int s) {
        return findrec(k, s);
    }

    public int findrec(int s, int k) {
        int res = 0;
        if (s == 1 && k < 10) res = 1;
        else if (s > 1)
            for (int i = 0; i < Math.min(10, k); i++)
                res += findrec(k - i, s - 1);
    return res;
}

    public int sumOfNums(int n){
        sum += n % 10;
        return (n > 0)
                ? (sumOfNums(n / 10))
                : sum;
    }
}
