package list04_12;

/**
 * 配列の仕組み
 */
public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b;
        b = a;   // 値ではなく参照が渡る
        b[0] = 100;
        System.out.println(a[0]);  // 従って100が表示
    }
}
