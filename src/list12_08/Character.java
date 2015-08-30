package list12_08;

/**
 * キャラクタークラス（抽象クラス）
 */
public abstract class Character {
    String name;
    int hp;
        
    public Character(String name) {
	this.name = name;
    }
	
    public void run(){
        System.out.println(this.name + "は逃げ出した");
    }
	
    public abstract void attack(Matango m);
}
