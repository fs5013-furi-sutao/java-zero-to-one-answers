package jp.freestyles.day.twelve;

public class ArrayPrinter {

    public static void main(String[] args) {

        String[] names = new String[2];
        names[0] = "山本一郎";
        names[1] = "山田次郎";

        System.out.format("%s, %s %n", names[0], names[1]);

        int[] ages = { 
            100, 101, 102, 103, 104, 105, 
        };

        System.out.format(
            "%d歳, %d歳, %d歳, %d歳, %d歳, %d歳 %n", 
            ages[5], ages[4], ages[3], ages[2], ages[1], ages[0]);
    }
}
