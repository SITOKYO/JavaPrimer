package list13_10new;


/**
 * スライムクラス
 */
public class Slime extends Monster{
    private final int SLIME_HITPOINT = 200;
    
    public Slime(){
        super.hitPoint = SLIME_HITPOINT;
    }

    @Override
    protected void runAway() {
	System.out.println("スライムは体をうねらせながら逃げ出した！");
    }
    
    @Override
    protected void reduceHitPoint(int damagePoint) {
	System.out.println("スライムは" + damagePoint + "のダメージを受けた！");
    }
}
