package list06_08;
import list06_04.CalcLogic;	// この行を追加

/**
 * Calc.javaにimport文を追加する
 */
public class Calc{
    public static void main(String[] args) {
	int a = 10;
        int b = 2;
	int total = CalcLogic.tasu(a,b);	// FQCNじゃなくてもOK
	int delta = CalcLogic.hiku(a,b);        // もちろんFQCNで書いてもOK
	System.out.println("足したら" + total + "、引いたら" + delta);
    }
}
