package list13_10new;


/**
 * ヒーロークラス
 */
public class Hero extends Character {
    
    Sword sword = new Sword();
    
    public void attack(Monster m, String swordName) { /* モンスター攻撃用 */
        sword.setName(swordName);
        
        System.out.println("-------------------------------------------------");
	System.out.println(this.getName() + "の攻撃！");
	System.out.println("敵に" + sword.getDamagePoint() + "ポイントのダメージをあたえた");

        m.damaged(sword.getDamagePoint());
    }
}
