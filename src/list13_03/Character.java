package list13_03;

public abstract class Character implements Life{
	String name;
	int hp;
	
	public String getName(){
		return this.name;
	}

	public void run(){
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m);
}
