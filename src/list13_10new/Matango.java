package list13_10new;


/**
 * お化けキノコクラス
 */
public class Matango extends Monster{
    public Matango(){
        super.hitPoint = 100;
    }
	
    @Override
    protected void run() {
	System.out.println("お化けキノコは逃げ出した！");
    }
    
    @Override
    protected void reduceHitPoint(int damagePoint) {
	System.out.println("お化けキノコは" + damagePoint + "のダメージを受けた！");
    }
}
