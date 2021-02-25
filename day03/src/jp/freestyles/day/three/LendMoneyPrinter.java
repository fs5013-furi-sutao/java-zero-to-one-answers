package jp.freestyles.day.three;

public class LendMoneyPrinter {
    public static void main(String[] args) {

        String name = "山本一郎";
        int money = 100;

        System.out.format(
                "%s さん、%d 円を貸してください", name, money);
    }
}
