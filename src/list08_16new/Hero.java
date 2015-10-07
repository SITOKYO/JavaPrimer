package list08_16new;

/**
 * 勇者クラス
 */
public class Hero {
    private String name;
    private int hitPoint;

    public Hero(String name, int hitPoint) {
        this.name = name;
        this.hitPoint = hitPoint;
    }

    public void sleep() {
        this.hitPoint = 100;
	System.out.println(this.name + "は、眠って回復した！");
    }

    public void sit(int sittingSeconds) {
	this.hitPoint += sittingSeconds;
	System.out.println(this.name + "は、" + sittingSeconds + "秒すわった！");
	System.out.println("HPが" + sittingSeconds + "ポイント回復した.");
    }
	
    public void slip() {
	this.hitPoint -= 5;
	System.out.println(this.name + "は転んだ！");
	System.out.println("5のダメージ！");
    }
	
    public void runAway() {
	System.out.println(this.name + "は、逃げ出した！");
	System.out.println("GAMEOVER");
	System.out.println("最終HPは" + this.hitPoint + "でした");
    }
}
