package list14_12;

public class Main {
    public static void main(String[] args) {
	int i1 = 15;
        String s1 = "15";
        
        if (i1 == Integer.valueOf(s1)){
            System.out.println("同じ数字です（intで比較）");
        }
        
        if (Integer.toString(i1).equals(s1)){
            System.out.println("同じ数字です（Stringで比較）");
        }

        // 以下、すべて同じ
        Integer intValue1 = 15;
        Integer intValue2 = Integer.valueOf(15);
        Integer intValue3 = Integer.parseInt("15");
        Integer intValue4 = Integer.valueOf("15");
        
        if (intValue1.equals(intValue2) && intValue1.equals(intValue3) && intValue1.equals(intValue4)){
            System.out.println("すべて同じです");
        }
    }
}
