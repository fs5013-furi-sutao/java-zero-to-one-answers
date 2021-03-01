package jp.freestyles.day.four;

import java.util.Scanner;

public class NumericInputReciever {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.print("数字を入力してください: ");
        int num = stdin.nextInt();

        double rate = 2.0;
        double resultCalculated = num * rate;

        System.out.format(
                "入力された数 %d を %.1f 倍すると %.1f です",
                num,
                rate,
                resultCalculated);

        stdin.close();
    }
}