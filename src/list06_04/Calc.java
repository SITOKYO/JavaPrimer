package list06_04;

/**
 * ファイルの分割（Calc.java）
 */
public class Calc{
    public static void main(String[] args) {
	int a = 10;
        int b = 2;
	int total = CalcLogic.tasu(a,b);
	int delta = CalcLogic.hiku(a,b);
	System.out.println("足したら" + total + "、引いたら" + delta);
    }
}
