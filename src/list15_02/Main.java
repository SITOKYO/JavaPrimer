package list15_02;

import java.io.*;

public class Main{
    public static void main(String[] args){
        try {
            // FileWriterのコンストラクタは、IOExceptionを発生させる可能性がある
            FileWriter fw = new FileWriter("ll///ll");
        } catch (IOException ex) {
            System.out.println("エラーが発生しました。");
        } finally{
            System.out.println("エラー発生に関わらず処理");
        }      
    }
}
