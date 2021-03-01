package jp.freestyles.day.fourteen;

import java.util.Scanner;

public class PositiveNumberAdder {

    public static void main(String[] args) {

        int sum = 0;

        Scanner stdin = new Scanner(System.in);

        System.out.print("数字を入力してください: ");
        int number = stdin.nextInt();

        while (number >= 0) {

            sum += number;

            System.out.print("数字を入力してください: ");
            number = stdin.nextInt();
        }

        System.out.println("合計 = " + sum);
        stdin.close();
    }
}