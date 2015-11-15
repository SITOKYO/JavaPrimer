package list14_06;

public class StaticHero {
    private static StaticHero staticHero = new StaticHero();
    
    private StaticHero(){
    }
    
    public static StaticHero getInstance(){
        return staticHero;
    }
}
