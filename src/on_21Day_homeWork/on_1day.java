package on_21Day_homeWork;

import java.util.Scanner;

/**
 * 题目：设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数点。
 **/

public class on_1day {
    public static void main(String[] args) {
        int firstScore, twoScore;
        float score;
        System.out.println("please input firstScore...");
        Scanner firSc = new Scanner(System.in);
        firstScore = firSc.nextInt();

        System.out.println("please input twoScore...");
        Scanner twoSc = new Scanner(System.in);
        twoScore = twoSc.nextInt();

        score = (float) (twoScore - firstScore) / firstScore * 100;
        System.out.print("成绩提高了：");
        System.out.println(String.format("%.2f%%",score));

    }
}

