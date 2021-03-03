# 30 日目

要素の並び替えをしよう

## バブルソートを実装する

プログラム実行結果例になるように、
次の BubbleSorter クラスのコメント箇所に追加処理をコーディングしなさい

```java
package jp.freestyles.day.twentynine;

public class BubbleSorter {

    public static void main(String[] args) {

        int[] numbers = { 55, 71, 1, 71560, 77, 65, 91, 2, 777, };

        // 小さい値から大きい値の順番に並ぶように
        // numbers の要素を並び替える

        showAllNumbers(numbers);
    }

    private static void showAllNumbers(int[] numbers) {

        String result = "{ ";

        for (int num : numbers) {
            result += String.format("%d, ", num);
        }
        result += "}";
        
        System.out.println(result);
    }
}
```

### 出力結果

```
{ 1, 2, 55, 65, 71, 77, 91, 777, 71560, }
```
