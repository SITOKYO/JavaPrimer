package list13_10new;


/**
 * ヒーロークラス
 */
public class Hero implements Attackable {
    
    private String name; 
    private Sword sword = new Sword();

    public Hero(String name){
        this.name = name;
    }
    
    public void attack(Monster monster, String swordName) { /* モンスター攻撃用 */
        sword.setName(swordName);
        
        System.out.println("-------------------------------------------------");
	System.out.println(this.name + "の攻撃！");
	System.out.println("敵に" + sword.getDamagePoint() + "ポイントのダメージをあたえた");

        monster.damaged(sword.getDamagePoint());
    }
}
