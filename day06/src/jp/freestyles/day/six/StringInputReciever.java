package jp.freestyles.day.six;

import java.util.Scanner;

public class StringInputReciever {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in, "Shift_JIS");

        System.out.print("名前を入力してください: ");
        String name = stdin.nextLine();

        System.out.format("入力された名前は %s です", name);
        stdin.close();
    }
}