package list13_10new;

/**
 * オブジェクトの数をカウントするクラス
 */
public class ObjectCounter {
    private static ObjectCounter objectCounter = new ObjectCounter();
    private int summary;
    
    // コンストラクタをprivateにすることでnewを禁止する
    private ObjectCounter(){
    }
    
    // getInstanceメソッド経由でObjectCounterを取得することで唯一のインスタンスを与える
    public static ObjectCounter getInstance(){
        return objectCounter;
    }
    
    public void add(){
        summary = summary + 1;
    }
    
    public int getObjectConut(){
        return summary;
    }
}
