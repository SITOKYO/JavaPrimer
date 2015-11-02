package list13_10new;

/**
 * お化けキノコクラス
 */
public class Matango extends Monster{
    private final int MATANGO_HITPOINT = 50;
    
    public Matango(){
        super.hitPoint = MATANGO_HITPOINT;
    }
	
    @Override
    protected void runAway() {
	System.out.println("お化けキノコは消えてしまった！");
    }
    
    @Override
    protected void reduceHitPoint(int damagePoint) {
	System.out.println("お化けキノコは" + damagePoint + "のダメージを受けた！");
    }
}
