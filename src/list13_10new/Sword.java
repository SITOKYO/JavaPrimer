package list13_10new;

/**
 * 剣クラス
 */
public class Sword {
    private String name;         // 剣の名前
    private int damagePoint;	 // 剣の攻撃力
    
    public int getDamagePoint(){
        return damagePointFromSwordName(name);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    private int damagePointFromSwordName(String name){
        if ("ムラマサ".equals(name)){
            return 100;
        } else if ("エターナルソード".equals(name)) {
            return 200;
        } else if ("ロトの剣".equals(name)) {
            return 1000;
        } 
        return 0;
    }
}