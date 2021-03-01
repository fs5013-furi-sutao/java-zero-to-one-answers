package jp.freestyles.day.thirteen;

public class Aggregator {
    public static void main(String[] args) {

        int[] numbers = { 3, 4, 5, -5, 0, 12 };
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        int numberOfElements = numbers.length;

        System.out.format(
            "配列の要素 %d つの合計 = %d %n", 
            numberOfElements, sum);

        
        double average = (double) sum / numberOfElements;

        System.out.format(
            "配列の要素 %d つの平均 = %.2f %n", 
            numberOfElements, average);
    }
}
