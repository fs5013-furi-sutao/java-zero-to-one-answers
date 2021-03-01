package jp.freestyles.day.nine;

import java.util.Scanner;

public class PositiveZeroNegativeChecker {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.print("整数を入力してください: ");
        int num = stdin.nextInt();

        if (num > 0) {
            System.out.println("入力値は正数です");
        } else if (num < 0) {
            System.out.println("入力値は負数です");
        } else {
            System.out.println("入力値は 0 です");
        }

        stdin.close();
    }
}
