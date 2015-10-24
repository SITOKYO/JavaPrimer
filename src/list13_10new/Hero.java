package list13_10new;


/**
 * ヒーロークラス
 */
public class Hero extends Character {
    public void attack(Monster m) {		/* モンスター攻撃用 */
        System.out.println("-------------------------------------------------");
	System.out.println(this.name + "の攻撃！");
	System.out.println("敵に200ポイントのダメージをあたえた");
	//m.hp -= 10;
        m.damaged(200);
    }
}
