package list03_01;

/**
 * 天気の変化による行動の変化をJavaで表したもの
 */
public class Main {
    public static void main(String[] args) {
        boolean tenki = true;
        if(tenki == true) {    //もしtenki変数の中身がtrueだったら…
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        } else {               //そうでなければ…
            System.out.println("DVDを見ます");
        }
    }
}
