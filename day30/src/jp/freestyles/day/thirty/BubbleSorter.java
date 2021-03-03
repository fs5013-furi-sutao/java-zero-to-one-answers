package jp.freestyles.day.thirty;

public class BubbleSorter {

    public static void main(String[] args) {

        int[] numbers = { 55, 71, 1, 71560, 77, 65, 91, 2, 777, };

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temporary = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporary;
                }
            }
        }

        showAllNumbers(numbers);
    }

    private static void showAllNumbers(int[] numbers) {

        String result = "{ ";

        for (int num : numbers) {
            result += String.format("%d, ", num);
        }
        result += "}";
        
        System.out.println(result);
    }
}
