package list05_06;

public class Main {
	public static void main(String[] args){
		int x = 100;
		int y = 10;
		add(x, y);
	}
	public static void add(int x, int y){
		int ans = x + y;		// ここで使用するつもり（エラー）
		System.out.println(x + "+" + y + "=" + ans);
	}
}