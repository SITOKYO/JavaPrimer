package list13_10new;


/**
 * お化けキノコクラス
 */
public class Matango extends Monster{
    private final int MATANGO_HITPOINT = 500;
    
    public Matango(){
        super.hitPoint = MATANGO_HITPOINT;
    }
	
    @Override
    protected void runAway() {
	System.out.println("お化けキノコは逃げ出した！");
    }
    
    @Override
    protected void reduceHitPoint(int damagePoint) {
	System.out.println("お化けキノコは" + damagePoint + "のダメージを受けた！");
    }
}
