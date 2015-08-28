package list12_09;

public class Dancer extends Character {
    public void dance() {
        System.out.println(this.name + "は情熱的に踊った");
    }
    
    /* attack()をオーバーライドしわすれている */
    // 以下追加
    @Override
    public void attack(Matango m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
