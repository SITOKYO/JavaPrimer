package list13_10new;

public class ObjectCounter {
    
    private static ObjectCounter objectCounter = new ObjectCounter();
    private int summary;
    
    private ObjectCounter(){
    }
    
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
