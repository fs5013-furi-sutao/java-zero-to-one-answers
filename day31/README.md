# 31 日目

2 つの配列を連結させよう

## 結果配列に各要素を順番に詰め込んでいく

プログラム実行結果例になるように、
次の ArraysConcatenator クラスのコメント箇所に追加処理をコーディングしなさい

```java
package jp.freestyles.day.thirtyone;

import java.util.Arrays;

public class ArraysConcatenator {

    public static void main(String[] args) {

        int[] firstArray = { 1, 2, 3000, 2000, 1000 };
        int[] secondArray = { 103, 102, 101 };

        // firstArray と secondArray を
        //　連結させる処理をここに書く

        System.out.println(Arrays.toString(result));
    }
}
```

### 出力結果

```
[1, 2, 3000, 2000, 1000, 103, 102, 101]
```
