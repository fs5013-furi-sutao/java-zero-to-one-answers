# 24 日目

カプセル化しよう

## カプセル化とは

フィールドとそのフィールドを操作するメソッドをクラスにまとめることを「カプセル化」と呼びます。

フィールドの値をクラス外に取り出して、その値を操作することをしないため、
クラスの持つ値をクラス内に閉じ込める様子を「カプセル化」と呼んでいます。

カプセル化することで、処理が読みやすく、改修しやすくなります。

## 金額クラスを作る

StationaryShop を実行すると実行結果の通りになるように、Amount クラスを作成しなさい

※消費税率は 8% とする

```java
package jp.freestyles.day.twentyfour;

public class StationaryShop {

    public static void main(String[] args) {

        Amount myCart = new Amount(0);
        Amount ballPen = new Amount(120);
        Amount eraser = new Amount(80);

        myCart = myCart.add(ballPen);
        myCart = myCart.add(eraser);

        myCart = myCart.addTax();
        myCart.showValue();
    }
}
```

### 出力結果

```
金額は 216 円です
```
