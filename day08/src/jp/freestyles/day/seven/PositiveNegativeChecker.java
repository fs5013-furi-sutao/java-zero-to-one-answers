package jp.freestyles.day.seven;

import java.util.Scanner;

public class PositiveNegativeChecker {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.print("正数または負数を入力してください: ");
        int num = stdin.nextInt();

        if (num > 0) {
            System.out.println("入力値は正数です");
        } else {
            System.out.println("入力値は負数です");
        }

        stdin.close();
    }
}