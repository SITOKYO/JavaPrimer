package list06_09;
import list06_07.CalcLogic;	// この行を追加

public class Calc{
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a,b);	// FQCNじゃなくてもOK
		int delta = list06_07.CalcLogic.hiku(a,b);
									// もちろんFQCNで書いてもOK
		System.out.println("足したら" + total + "、引いたら" + delta);
	}
}
