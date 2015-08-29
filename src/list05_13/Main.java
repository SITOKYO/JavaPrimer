package list05_13;

/**
 * 同じ配列を参照していることを確認する
 */
public class Main {
    // int型配列を受け取り、
    // 配列内の要素すべてに1を加えて返すメソッド
    public static void incArray(int[] array) {
	for( int i = 0; i < array.length; i++ ){
	    array[i]++;
	}
        // returnを返さない
    }
    public static void main(String[] args){
	int[] array = {1,2,3};
	incArray(array);	
	for(int i : array) {
	    System.out.println(i); // 1,2,3ではなく2,3,4と返る
	}
    }
}
