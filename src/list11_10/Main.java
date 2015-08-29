package list11_10;

/**
 * メインクラス
 */
public class Main {
    public static void main(String[] args) {
	SuperHero sh = new SuperHero();
        Matango matango = new Matango();
        sh.fly();
        sh.attack(matango);
    }
}
