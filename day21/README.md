# 21 日目

クラスを作ってみよう

## 犬をあらわすクラスを作ってみる

次の PetClinic を実行すると、以下の実行結果になるように、Dog クラスを作成しなさい

```java
package jp.freestyles.day.twentyone;

public class PetClinic {

    public static void main(String[] args) {

        Dog[] dogs = { 
            new Dog("山本一郎", 3, "プードル"), 
            new Dog("山田次郎", 1, "ブルドッグ"), 
            new Dog("山下三郎", 75, "秋田犬"), 
        };

        for (Dog dog : dogs) {
            dog.introduce();
        }
    }
}
```

### 出力結果

```
プードル の 山本一郎 は 3 歳です   
ブルドッグ の 山田次郎 は 1 歳です 
秋田犬 の 山下三郎 は 75 歳です  
```
