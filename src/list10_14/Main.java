package list10_14;

/**
 * メインクラス
 */
public class Main {
    public static void main(String[] args) {
	Hero h = new Hero();
	h.setName("");		// 長さ0文字の名前をセットしようとする
        System.out.println("名前は" + h.getName());
    }
}
