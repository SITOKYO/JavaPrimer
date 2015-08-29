package list04_16;

/**
 * 親配列と子配列の要素数を表示
 */
public class Main {
    public static void main(String[] args) {
        int[][] scores = { { 10, 20, 30 }, { 30, 40, 50 } };  // このような初期化が可能
        System.out.println("親配列の要素数：" + scores.length);       // 2が出力される 
        System.out.println("子配列の要素数：" + scores[0].length);    // 3が出力される 
    }
}
