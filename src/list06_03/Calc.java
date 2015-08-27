package list06_03;

import static list06_03.CalcLogic.tasu;

public class Calc{
    public static void main(String[] args) {
	int a = 10;
        int b = 2;
	
        CalcLogic calcLogic = new CalcLogic();
        int total = calcLogic.tasu(a,b);
	int delta = calcLogic.hiku(a,b);
	System.out.println("足したら" + total + "、引いたら" + delta);
    }
}
