package jp.freestyles.day.thirtyone;

import java.util.Arrays;

public class ArraysConcatenator {

    public static void main(String[] args) {

        int[] firstArray = { 1, 2, 3000, 2000, 1000 };
        int[] secondArray = { 103, 102, 101 };

        int length = firstArray.length + secondArray.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : firstArray) {
            result[pos] = element;
            pos++;
        }

        for (int element : secondArray) {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
    }
}
