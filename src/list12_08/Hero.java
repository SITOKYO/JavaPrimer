package list12_08;

/**
 * 勇者クラス
 */
public class Hero extends Character {

    public Hero(String name) {
        super(name);
    }
    
    @Override
    public void attack(Matango m) {		
	System.out.println(this.name + "の攻撃！");
	System.out.println("敵に10ポイントのダメージをあたえた");
	m.hp -= 10;
    }
}
