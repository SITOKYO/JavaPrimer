/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list12_15;

/**
 * メインクラス
 */
public class Main {
   public static void main(String... args){
       CleaningService cleaningService = new KyotoCleaningShop();
       Coat coat = new Coat();
       Shirt shirt = new Shirt();
       Towl towl = new Towl();
       
       System.out.println("実行前Coat：" + coat.status);
       System.out.println("実行前Shirt：" + shirt.status);
       System.out.println("実行前Towl：" + towl.status);
       
       coat = cleaningService.washCoat(coat);
       shirt = cleaningService.washShirt(shirt);
       towl = cleaningService.washTowl(towl);
       
       System.out.println("実行後Coat：" + coat.status);
       System.out.println("実行後Shirt：" + shirt.status);
       System.out.println("実行後Towl：" + towl.status);
   } 
}
