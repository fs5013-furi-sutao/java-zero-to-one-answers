# 25 日目

クラスを追加しよう

## 文房具クラスを追加する

StationaryShop を実行すると実行結果の通りになるように、Stationary クラスを追加しなさい

また、追加にともない Amount クラスにも必要な修正を行うこと

```java
package jp.freestyles.day.twentyfive;

public class StationaryShop {

    public static void main(String[] args) {

        Amount myCart = new Amount(0);
        
        Stationary ballPen = new Stationary(
            "三菱ジェットストリーム", new Amount(120), 3);
        
        Stationary eraser = new Stationary(
                "MONO消しゴム", new Amount(80), 2);

        myCart = myCart.add(ballPen.calcTotalAmount());
        myCart = myCart.add(eraser.calcTotalAmount());

        myCart = myCart.addTax();
        myCart.showValue();
    }
}
```

### 出力結果

```
三菱ジェットストリーム が 3 本あります 
MONO消しゴム が 2 本あります
金額は 562 円です
```
