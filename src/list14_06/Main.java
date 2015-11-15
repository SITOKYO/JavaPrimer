package list14_06;

/**
 * オブジェクトクラス（メインクラス）
 */
public class Main {
    public static void main(String[] args) {
	Object o1 = new Hero();
	Object o2 = new Hero();
        isEqualObjectMessage(o1, o2);
        
	Object o3 = StaticHero.getInstance();
        Object o4 = StaticHero.getInstance();
        isEqualObjectMessage(o3, o4);
    }
    
    private static void isEqualObjectMessage(Object o1, Object o2){
        if(o1.equals(o2)){
            System.out.println("同じオブジェクトです");
        } else {
            System.out.println("違うオブジェクトです");
        }
    }
}
