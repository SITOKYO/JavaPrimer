package list08_16new;

/**
 * お化けキノコクラス
 */
public class Matango {
    private int hitPoint;
    private final int LEVEL = 10;
    private char suffix;

    public Matango(int hitPoint, char suffix) {
        this.hitPoint = hitPoint;
        this.suffix = suffix;
    }
    public void runAway() {
	System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
