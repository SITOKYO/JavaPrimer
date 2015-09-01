package list04_08;

/**
 * 点数管理プログラム（配列使用例）
 */
public class Main {
    public static void main(String[] args) {
	int[] score = {20,30,40,50,80};
	int sum = score[0]+score[1]+score[2]+ score[3]+ score[4];  // 合計の算出
	int avg = sum / score.length;  // 平均の算出

	// 合計と平均の表示
	System.out.println("合計点:" + sum);                    
	System.out.println("平均点:" + avg);   
    }
}
