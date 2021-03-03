package jp.freestyles.day.twentyeight;

public class DigitsCounter {

    public static void main(String[] args) {

        int targetNumber = 123456;
        int count = 0;

        while (targetNumber != 0) {
            targetNumber /= 10;
            count++;
        }

        System.out.format("targetNumber の桁数 = %d %n", count);
    }
}
