package list08_16new;

import list08_16.*;

/**
 * メインクラス
 */
public class Main {
    public static void main(String[] args){
	// 勇者を生成し初期化
        String nameOfHero = "ミナト";
	int hitPointOfHero = 100;
	Hero hero = new Hero(nameOfHero, hitPointOfHero);

	// お化けキノコA(1匹目)を生成し初期化
        int hitPointOfMatangoA = 50;
	char suffixOfMatangoA = 'A';
	Matango matangoA = new Matango(hitPointOfMatangoA, suffixOfMatangoA);

	// お化けキノコB(2匹目)を生成し初期化
        int hitPointOfMatangoB = 48;
	char suffixOfMatangoB = 'B';
	Matango matangoB = new Matango(hitPointOfMatangoB, suffixOfMatangoB);
		
	// 消極的な冒険のはじまり
	hero.slip();	// 勇者はいきなり転ぶ
	matangoA.run();	// お化けキノコAが逃げる
	matangoB.run();	// お化けキノコBも逃げる
	hero.run();	// 勇者も逃げる
    }
}