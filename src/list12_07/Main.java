package list12_07;

public class Main {
	public static void main(String[] args) {
		//Character c = new Character();		/* HeroやWizardではなくCharacterをnewしてしまった！ */
                Character c = new Hero();		/* Heroにする */
		Matango m = new Matango();
		c.attack(m);						/* オーバーライドされていないので
		 									なにも動かない */
	}
}
