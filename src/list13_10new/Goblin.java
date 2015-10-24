package list13_10new;


/**
 * ゴブリンクラス
 */
public class Goblin extends Monster{
    private final int GOBLIN_HITPOINT = 500;
    
    public Goblin(){
        super.hitPoint = GOBLIN_HITPOINT;
    }
    
    @Override
    protected void run() {
	System.out.println("ゴブリンはダダダっと逃げ出した！");
    }
    
    @Override
    protected void reduceHitPoint(int damagePoint) {
	System.out.println("ゴブリンは" + damagePoint + "のダメージを受けた！");
    }
}
