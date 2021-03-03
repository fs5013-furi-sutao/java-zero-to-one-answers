package jp.freestyles.day.twentynine;

public class MultiplicateionTable {

    public static void main(String[] args) {

        final int NUMBER_OF_COLOUMN = 9;
        final int NUMBER_OF_ROW = 9;

        for (int i = 1; i <= NUMBER_OF_COLOUMN; i++) {
            for (int j = 1; j <= NUMBER_OF_ROW; j++) {

                System.out.format(
                    "%d X %d = %2d, ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
