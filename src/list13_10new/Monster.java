package list13_10new;

/**
 * モンスタークラス
 */
public abstract class Monster {
    protected int hitPoint;
    
    public Monster(){
        ObjectCounter.getInstance().add();
    }
    
    public void damaged(int damagePoint){
        hitPoint -= damagePoint;
        if (isRunaway()){
            runAway();
        } else {
            reduceHitPoint(damagePoint);
            System.out.println("残りヒットポイントは" + hitPoint);
        }
    }
    
    private boolean isRunaway(){
        return (hitPoint <= 0 ? true : false);
    }
    
    protected abstract void runAway();
    
    protected abstract void reduceHitPoint(int damagePoint);
}
