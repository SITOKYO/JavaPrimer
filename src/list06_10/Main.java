package list06_10;

/**
 * API利用の例
 */
public class Main{
    public static void main(String[] args){
	int[] heights = {172, 149, 152, 191, 155};
	java.util.Arrays.sort(heights);	 // 並び替え実行！
	for(int h : heights) {
	    System.out.println(h);
	}
    }
}
