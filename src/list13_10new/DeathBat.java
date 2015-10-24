package list13_10new;


/**
 * 地獄コウモリクラス
 */
public class DeathBat extends Monster{	
    
    private final int DETEH_BAT_HITPOINT = 1000;
    
    public DeathBat(){
        super.hitPoint = DETEH_BAT_HITPOINT;
    }
    
    @Override
    protected void run() {
	System.out.println("地獄コウモリは逃げ出した！");
    }
    
    @Override
    protected void reduceHitPoint(int damagePoint) {
	System.out.println("地獄コウモリは" + damagePoint + "のダメージを受けた！");
    }
}
