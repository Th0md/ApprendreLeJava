
public class MainHeritage {

	public static void main(String[] args) {
		
		
		
		
		Day moment = Day.MATIN;
		System.out.println(moment.name());
		
		moment = Day.SOIR;
		System.out.println("Nous somme le "+moment.name()+" et il est "+moment.getHour()+" heures, l'heure de "+moment.getMessage());
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		for(Day moments : Day.values()) {
			String message = ("Nous somme le "+moments.name()+" et il est "+moments.getHour()+" heures, l'heure de "+moments.getMessage());
			System.out.println(message);
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		Apple a = new Apple();
		System.out.println(a.getName());
		a.taste();
		//a.mian();
		
		PineApple p = new PineApple();
		System.out.println(p.getName());
		p.taste();
		p.mian();
		
		
		if(a instanceof PeelFruit) {
			System.out.println("OK");
		}
		
		
		
		
	}

}
