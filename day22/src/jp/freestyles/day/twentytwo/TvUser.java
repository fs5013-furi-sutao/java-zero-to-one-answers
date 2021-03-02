package jp.freestyles.day.twentytwo;

public class TvUser {

    public static void main(String[] args) {

        Television tokaiTv = new Television(1, "東海テレビ");
        Television cbcTv = new Television(5, "CBCテレビ");

        tokaiTv.showEndOfBroadcasting();
        cbcTv.showEndOfBroadcasting();
    }
}
