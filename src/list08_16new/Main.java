package list08_16new;

import list08_16.*;

/**
 * メインクラス
 */
public class Main {
    public static void main(String[] args){
	// 勇者を生成
        String nameOfHero = "ミナト";
	int hitPointOfHero = 100;
	Hero hero = new Hero(nameOfHero, hitPointOfHero);

	// お化けキノコAを生成
        int hitPointOfMatangoA = 50;
	char suffixOfMatangoA = 'A';
	Matango matangoA = new Matango(hitPointOfMatangoA, suffixOfMatangoA);

	// お化けキノコBを生成
        int hitPointOfMatangoB = 48;
	char suffixOfMatangoB = 'B';
	Matango matangoB = new Matango(hitPointOfMatangoB, suffixOfMatangoB);
		
	// 消極的な冒険のはじまり
	hero.slip();
	matangoA.run();
	matangoB.run();
	hero.run();
    }
}