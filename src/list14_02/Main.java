package list14_02;

import java.util.Date;

/**
 * Dateクラスの利用
 */
public class Main{
    public static void main(String[] args){
	Date now = new Date();    // デフォルトコンストラクタは現在日付
	System.out.println(now);
	System.out.println(now.getTime());
	Date past = new Date(1316622225935L);  // コンストラクタに指定日付
	System.out.println(past);
    }
}
