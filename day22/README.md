# 22 日目

コンストラクタを使おう

## 樹齢が正しく設定されるようにする

次の ForestPark を実行すると、以下の実行結果になるように、Tree クラスを修正しなさい

```java
package jp.freestyles.day.twentytwo;

public class ForestPark {

    public static void main(String[] args) {

        Tree palmTree = new Tree(56);

        palmTree.showAge();
    }
}
```

```java
package jp.freestyles.day.twentytwo;

public class Tree {

    private int age;

    public Tree(int age) {
        age = age;
    }

    public void showAge() {
        System.out.format("樹齢は %d 年です", age);
    }
}
```

### 出力結果

```
樹齢は 56 年です
```
