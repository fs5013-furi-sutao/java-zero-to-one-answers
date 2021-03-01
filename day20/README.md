# 20 日目

クラスを使ってみよう

## ランプをあらわすクラスを使ってみる

プログラム実行結果になるように、次の処理をコーディングしなさい

クラス名は Camper とする

- 変数 ledLamp に「LED ランプ」を引数として生成した Lamp インスタンスを代入する
- 変数 halogenLamp に「ハロゲンランプ」を引数として生成した Lamp インスタンスを代入する

- LED ランプの明かりを消す
- LED ランプの状態を表示する

- ハロゲンランプの明かりを消す
- ハロゲンランプの明かりをつける

Camper クラスでは、次の Lamp クラスを使用すること

```java
package jp.freestyles.day.twenty;

public class Lamp {

    private String name;
    private boolean isOn;

    public Lamp(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
        showState();
    }

    public void turnOff() {
        this.isOn = false;
        showState();
    }

    public void showState() {
        if (this.isOn) {
            System.out.format("%s の明かりがついてます %n", this.name);
            return;
        }
        System.out.format("%s の明かりが消えています %n", this.name);
    }
}
```

### 出力結果

```
LED ランプ の明かりが消えています     
LED ランプ の明かりが消えています     
ハロゲンランプ の明かりが消えています 
ハロゲンランプ の明かりがついてます
```
