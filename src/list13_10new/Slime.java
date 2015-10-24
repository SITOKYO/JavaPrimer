package list13_10new;


/**
 * スライムクラス
 */
public class Slime extends Monster{
    
    
    public Slime(){
        super.hitPoint = 50;
    }

    @Override
    protected void run() {
	System.out.println("スライムは体をうねらせながら逃げ出した！");
    }
    
    @Override
    protected void reduceHitPoint(int damagePoint) {
	System.out.println("スライムは" + damagePoint + "のダメージを受けた！");
    }
}
