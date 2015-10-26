package list13_10new;


/**
 * メインクラス
 */
public class Main {
    public static void main(String[] args) {
        Character hero = new Hero();
        hero.setName("マイヒーロー");
        
	Monster[] monsters = new Monster[4];
	monsters[0] = new Slime();
	monsters[1] = new Goblin();
	monsters[2] = new DeathBat();
        monsters[3] = new Matango();
	for(Monster m : monsters) {
	    //m.runAway();
            hero.attack(m);
	}
    }
}
