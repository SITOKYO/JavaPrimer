package list05_03;

/**
 * mainメソッド以外からのメソッドの呼び出し
 */
public class Main {
    public static void methodA(){
        System.out.println("methodA");
	methodB();
    }
    public static void methodB(){
	System.out.println("methodB");
    }
    public static void main(String[] args){
	methodA();
    }
}
