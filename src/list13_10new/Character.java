package list13_10new;


/**
 * キャラクタークラス（抽象クラス）
 */
public abstract class Character{
    String name;
    int hp;
	
    public String getName(){
	return this.name;
    }

    public void run(){
	System.out.println(this.name + "は逃げ出した");
    }
	
    public abstract void attack(Monster m);

    public int getHp() {
	return hp;
    }

    public void setHp(int hp) {
	this.hp = hp;
    }

    public void setName(String name) {
	this.name = name;
    }
	
}
