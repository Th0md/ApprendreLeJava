
public class Player {
	
	private String name;
	private double health;
	private double attack;
	
	
	public Player() {
		// TODO Auto-generated constructor stub
	}


	public Player(String name, double attack, double health) {
		super();
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	public void damage(double damage) {
		this.health -= damage;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHealth() {
		return health;
	}


	public void setHealth(double health) {
		this.health = health;
	}


	public double getAttack() {
		return attack;
	}


	public void setAttack(double attack) {
		this.attack = attack;
	}
	
	

}
