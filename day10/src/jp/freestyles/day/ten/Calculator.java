package jp.freestyles.day.ten;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        final int FIRST_TARGET_NUM = 15;
        final int SECOND_TARGET_NUM = 3;

        System.out.format("演算対象の数字は %d と %d です %n",
                FIRST_TARGET_NUM,
                SECOND_TARGET_NUM);

        System.out.print("次の 3 つのどれかの演算子を入力してください（+, -, *）: ");
        char operator = stdin.nextLine().charAt(0);

        int result = 0;
        switch (operator) {
        case '+':
            result = FIRST_TARGET_NUM + SECOND_TARGET_NUM;
            break;
        case '-':
            result = FIRST_TARGET_NUM - SECOND_TARGET_NUM;
            break;
        case '*':
            result = FIRST_TARGET_NUM * SECOND_TARGET_NUM;
            break;
        default:
            operator = '?';
            result = 0;
        }

        System.out.format("%d %s %d = %d",
                FIRST_TARGET_NUM,
                operator,
                SECOND_TARGET_NUM,
                result);

        stdin.close();
    }
}
