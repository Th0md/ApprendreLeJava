
public class MainObjet {

	public static void main(String[] args) {

		Player player1 = new Player("Gille",20.0,200.0);

		System.out.println("NOM     : " + player1.getName());
		System.out.println("VIE     : " + player1.getHealth());
		System.out.println("ATTAQUE : " + player1.getAttack());
		
//		player1.damage(2);
//		System.out.println("VIE     : " + player1.getHealth());		
		
		
		Player player2 = new Player("Charles",15.0,250.0);
		
		player2.setName("Julie");
		
		player2.damage(player1.getAttack());
		
		System.out.println("NOM     : " + player2.getName());
		System.out.println("VIE     : " + player2.getHealth());
		System.out.println("ATTAQUE : " + player2.getAttack());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("-------------------------------------------------------------------------------------");
	}

}
