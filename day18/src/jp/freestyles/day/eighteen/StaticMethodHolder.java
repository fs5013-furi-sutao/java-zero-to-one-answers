package jp.freestyles.day.eighteen;

public class StaticMethodHolder {

    public static void main(String[] args) {

        int a = 57;
        int b = 25;

        int result = add(a, b);
        System.out.format("%d + %d = %d %n", a, b, result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
