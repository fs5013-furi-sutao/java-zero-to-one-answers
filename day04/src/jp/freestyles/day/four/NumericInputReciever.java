package jp.freestyles.day.four;

import java.util.Scanner;

public class NumericInputReciever {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.print("数字を入力してください: ");
        int num = stdin.nextInt();

        System.out.format("入力された数字は %d です", num);
        stdin.close();
    }
}