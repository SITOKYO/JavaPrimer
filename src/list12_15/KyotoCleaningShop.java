package list12_15;


public class KyotoCleaningShop implements CleaningService {
								/* インタフェースを継承しクラスを宣言する場合はimplements */
    private String ownerName;		// 店主の名前
    private String address;			// 住所
    private String phone;			// 電話番号
	
    public Shirt washShirt(Shirt s) {
	// 大型洗濯機15分
	// 業務用乾燥機30分
	// スチームアイロン5分
        s.status = "きれいになった!";
	return s;
    }
    public Towl washTowl(Towl t) {
	// タオルの洗う手順
        t.status = "きれいになった!";
	return t;
    }
    public Coat washCoat(Coat c) {
	// コート洗う手順
        c.status = "きれいになった!";
	return c;
    }	
}
