package list14_05;

/**
 * 暗黙の継承（メインクラス）
 */
public class Main {
    public static void main(String[] args) {
	Empty e = new Empty();
	String s = e.toString();   // toString()を呼び出せている
	System.out.println(s);
    }
}
