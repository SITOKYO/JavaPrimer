package list14_03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendarクラスの利用
 */
public class Main {
    public static void main(String[] args) {
	// 現在の年月日を表示する
	Date now = new Date();

	Calendar calender = Calendar.getInstance();
	calender.setTime(now);
	int year = calender.get(Calendar.YEAR);
        int month = calender.get(Calendar.MONTH) + 1;
        int day = calender.get(Calendar.DATE);
	System.out.println("今は" + year + "年" + month + "月" + day + "日です");
        
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	String s = f.format(now);
	System.out.println(s);
    }
}
