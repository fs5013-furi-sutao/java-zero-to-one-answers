# 15 日目

break 文を使おう

## while ループを中断させる

プログラム実行結果になるように、次のプログラムの while 文中に break 文をコーディングしなさい

``` java
package jp.freestyles.day.fifteen;

public class WhileLoopBreaker {

    public static void main(String[] args) {

        int counter = 0;
        boolean isNotEnd = true;

        while (isNotEnd) {

            counter++;
            System.out.println(counter);

            if (counter == 10) {
                isNotEnd = false;
            }
        }

        System.out.format("counter = %d %n", counter);
    }
}
```

### 出力結果

```
1
2
3
4
counter = 4
```
