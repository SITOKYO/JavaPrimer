package list12_08;

public class Main {
    public static void main(String[] args) {
	Character c = new Hero("ヒーロー");    /* HeroやWizardではなくCharacterをnewしてしまった！ */
	Matango m = new Matango();
	    c.attack(m);		     /* オーバーライドされていないのでなにも動かない */
	}
}
