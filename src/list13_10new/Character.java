package list13_10new;


/**
 * キャラクタークラス（抽象クラス）
 */
public abstract class Character{
    private String name;
    private int hitPoint;
	
    public String getName(){
	return this.name;
    }

    public int getHitPoint() {
	return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
	this.hitPoint = hitPoint;
    }

    public void setName(String name) {
	this.name = name;
    }

    public abstract void attack(Monster monster, String SwordName);
    
}
