package jp.freestyles.day.seven;

import java.util.Random;
import java.util.Scanner;

public class NumberProphet {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        final int RANGE_FOR_CORRECT = 7;

        Random rand = new Random();
        int correct = rand.nextInt(RANGE_FOR_CORRECT);

        System.out.print("予想する数を入力してください（0 ～ 7）: ");
        int prediction = stdin.nextInt();

        if (prediction == correct) {
            System.out.println("正解です");
        }

        System.out.format("正解は %d です", correct);
        stdin.close();
    }
}