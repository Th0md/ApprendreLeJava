
public class MainException {

	public static void main(String[] args) {

		int[] nums = { 4, 7, 8, 3, 5, 1 };

		int calc = 5 + 1;

		try {
			System.out.println(nums[4]);
			calc /= 0;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		}

		int i = 6;

		try {
			System.out.println(nums[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("L'indice [" + i + "] est hors de protée !!");
		} finally {
			System.out.println("Life is good");
		}

		System.out.println(
				"--------------------------------------Les Exceptions-----------------------------------------------------------------------");

		double balance = 5000;
		double price = 5500;

		buy(balance, price);

		try {
			buy2(balance, price);
		} catch (Exception e) {
			System.out.println("Fonds insuffisant !!");
		}

		try {
			buy3(balance, price);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------");

	}

	private static void buy(double balance, double price) {
		double newBalance = balance - price;
		System.out.println("Balance after opperation : " + newBalance);

		if (newBalance < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("Fonds insuffisant !!");
			}
		}

	}

	private static void buy2(double balance, double price) throws Exception {
		double newBalance = balance - price;
		System.out.println("Balance after opperation : " + newBalance);

		if (newBalance < 0) {

			throw new Exception();

		}
	}

	private static void buy3(double balance, double price) throws NoMoneyException {
		double newBalance = balance - price;
		System.out.println("Balance after opperation : " + newBalance);

		if (newBalance < 0) {

			throw new NoMoneyException();

		}

	}

}
