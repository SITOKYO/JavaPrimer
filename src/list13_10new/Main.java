package list13_10new;

/**
 * メインクラス
 */
public class Main {

    public static void main(String[] args) {
        Attackable hero = new Hero("ティーダ");
        //Attackable hero = new Hero();
        
	Monster[] monsters = new Monster[4];
	monsters[0] = new Slime();
	monsters[1] = new Goblin();
	monsters[2] = new DeathBat();
        monsters[3] = new Matango();
	for(Monster monster : monsters) {
            hero.attack(monster, "エターナルソード");
	}
        
        System.out.println("***********************************************");
        System.out.println("オブジェクトの数：" + ObjectCounter.getInstance().getObjectConut());
    }
}
