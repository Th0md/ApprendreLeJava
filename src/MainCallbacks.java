
public class MainCallbacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		substract(10, 7, new CalculsCallbacks() {
			
			@Override
			public void onPositiveResult() {
				System.out.println("Super !");				
			}
			
			@Override
			public void onNullResult() {
				System.out.println("Attention !!");
				
			}
			
			@Override
			public void onNegativeResult() {
				System.out.println("Dommage !!");
				
			}
		});
		

	}

	private static void substract(int a, int b, CalculsCallbacks c) {

		int result = a - b;
		System.out.println("Resultat = " + result);

		if (result > 0) {
			System.out.println("Le resultat est positif !!");
			c.onPositiveResult();
		} else if (result < 0) {
			System.out.println("Le resultat est negatif !");
			c.onNegativeResult();
		} else {
			System.out.println("Le resultat est null !");
			c.onNullResult();
		}

	}

}
