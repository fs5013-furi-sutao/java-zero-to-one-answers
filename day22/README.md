# 22 日目

コンストラクタを使おう

## テレビに初期設定をさせる

次の TvUser を実行すると、以下の実行結果になるように、Television クラスを作成しなさい

Television クラスにはコンストラクタを実装すること

Television クラスには、次のフィールドとメソッドを実装すること
- channelNo: チャンネル番号をあらわすフィールド
- broadcastStationName: 放送局名をあらわすフィールド
- showStartOfBroadcasting(): 放送開始を表示するメソッド
- showEndOfBroadcasting(): 放送終了を表示するメソッド

```java
package jp.freestyles.day.twentytwo;

public class TvUser {

    public static void main(String[] args) {

        Television tokaiTv = new Television(1, "東海テレビ");
        Television cbcTv = new Television(5, "CBCテレビ");

        tokaiTv.showEndOfBroadcasting();
        cbcTv.showEndOfBroadcasting();
    }
}
```

### 出力結果

```
START: 1 チャンネルの 東海テレビ が放送開始します 
START: 5 チャンネルの CBCテレビ が放送開始します
END: 1 チャンネルの 東海テレビ が放送終了します
END: 5 チャンネルの CBCテレビ が放送終了します
```
