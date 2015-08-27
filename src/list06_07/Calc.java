package list06_07;
public class Calc{
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = list06_07.CalcLogic.tasu(a,b);
		int delta = list06_07.CalcLogic.hiku(a,b);
		System.out.println("足したら" + total + "、引いたら" + delta);
	}
}
