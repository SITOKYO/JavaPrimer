package list04_14;

/**
 * nullの代入
 */
public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        a = null;   // 参照を切る
        a[0] = 10;  // 一旦参照を切ったのでこの代入は無効（コンパイルは通る）
        System.out.println(a[0]);  // 実行時エラー
    }
}
