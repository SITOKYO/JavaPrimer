package list13_10new;

/**
 * モンスタークラス
 */
public abstract class Monster {
    protected int hitPoint;
	
    public void damaged(int damagePoint){
        hitPoint -= damagePoint;
        if (isRunaway()){
            run();
        } else {
            reduceHitPoint(damagePoint);
        }
    }

    private boolean isRunaway(){
        return (hitPoint <= 0 ? true : false);
    }
    
    protected abstract void run();
    
    protected abstract void reduceHitPoint(int damagePoint);    
}
