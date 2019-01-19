
public class Fonction {
	
	public static double getCalcul(double a, double b) {                 // avec static : on a just besoin du nomClass.fonction()
		double c = (a+b)*a/b-a;
		return c;
	}
	
	public static int getResult(int money, int price, boolean hasPhone){
		if(money > price && !hasPhone) {
			System.out.println("ACHETTE !!");
		}else {
			System.out.println("N'ACHETTE PAS !!");
		}
		return money-price;
	}

}
