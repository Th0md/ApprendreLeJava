
public abstract class Fruit { //abstract : permet de redéffinir les methodes dans les sous classes.
	
	
	private String name;	
	
	public Fruit(String name) {
		this.name = name;
	}

	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	public void mian() {
		System.out.println("Je suis un fruit");
	}
	
	public String getName() {
		return name;
	}
	
	

}
