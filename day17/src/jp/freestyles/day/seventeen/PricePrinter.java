package jp.freestyles.day.seventeen;

import java.util.ArrayList;
import java.util.List;

public class PricePrinter {

    public static void main(String[] args) {

        List<Integer> prices = new ArrayList<>();
        prices.add(1980);
        prices.add(2980);
        prices.add(19800);
        prices.add(4980);

        for (int price : prices) {
            System.out.format("%d 円 %n", price);
        }
    }
}
