
public class MainFonction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c = Fonction.getCalcul(4,9);
		System.out.println(c);
		
		sendMessage("flute",4);
		sendMessage("trompette",2);
		
		System.out.println("Il te restera : "+Fonction.getResult(284, 213, false)+" euros");
		
	}
	
	private static void sendMessage(String instrument,int temps) {                 // avec static : on a just besoin du nomClass.fonction()
		 System.out.println("J'ai jouais de la "+instrument+" pendant "+temps+" heures !!");
	}
	
	
}
