package list13_10new;

/**
 * ヒーロークラス
 */
public class Hero implements Attackable {
    
    private String name; 
    private Sword sword = new Sword();

    public Hero(){
        this.name = "デフォルトヒーロー";
        ObjectCounter.getInstance().addObjectCount();
    }
    
    public Hero(String name){
        this();    // Hero()呼び出し
        this.name = name;
    }
    
    public void attack(Monster monster, String swordName) {
        sword.setName(swordName);
        
        System.out.println("-------------------------------------------------");
	System.out.println(this.name + "の攻撃！");
	System.out.println("敵に" + sword.getDamagePoint() + "ポイントのダメージをあたえた");

        monster.damaged(sword.getDamagePoint());
    }
}
