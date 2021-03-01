package jp.freestyles.day.nineteen;

public class InstanceMethodHolder {

    public static void main(String[] args) {

        InstanceMethodHolder app = new InstanceMethodHolder();
        int[] targetNumbers = { -11, 0, 61, };

        for (int num : targetNumbers) {

            System.out.format(
                "%d は %s です %n", 
                num, app.getNegativePositive(num));
        }
    }

    public String getNegativePositive(int number) {

        if (number > 0)
            return "正数";
        if (number < 0)
            return "負数";

        return "ゼロ";
    }
}
