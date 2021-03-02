package jp.freestyles.day.twentytwo;

public class Television {

    private int channelNo;
    private String broadcastStationName;

    public Television(int channelNo, String broadcastStation) {
        this.channelNo = channelNo;
        this.broadcastStationName = broadcastStation;
        showStartOfBroadcasting();
    }

    public void showStartOfBroadcasting() {
        System.out.format(
            "START: %d チャンネルの %s が放送開始します %n", 
            this.channelNo,
            this.broadcastStationName);
    }

    public void showEndOfBroadcasting() {
        System.out.format(
            "END: %d チャンネルの %s が放送終了します %n", 
            this.channelNo,
            this.broadcastStationName);
    }
}
