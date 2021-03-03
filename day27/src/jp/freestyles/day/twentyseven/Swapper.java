package jp.freestyles.day.twentyseven;

public class Swapper {

    public static void main(String[] args) {

        float firstFloatNumber = 1.20f;
        float secondFloatNumber = 2.45f;

        System.out.println("-- 交換前 --");
        showTwoFloatNumbers(firstFloatNumber, secondFloatNumber);
        
        float temporary = firstFloatNumber;

        firstFloatNumber = secondFloatNumber;

        secondFloatNumber = temporary;

        System.out.println("-- 交換後 --");
        showTwoFloatNumbers(firstFloatNumber, secondFloatNumber);
    }

    private static void showTwoFloatNumbers(
        float firstFloatNumber, float secondFloatNumber) {

        System.out.format("1個目の小数 = %.2f %n", firstFloatNumber);
        System.out.format("2個目の小数 = %.2f %n", secondFloatNumber);
    }
}
