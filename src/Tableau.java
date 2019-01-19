
public class Tableau {
	
	public static void main(String[] args) {
		
		String pseudo = "Banana";
		String[] names = new String[] {"Pomme", "Poire", "Abrocot"};
		
		System.out.println(names[0]);
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		if (names[0].equals(names[1])) { //RUN Ctrl + F11
			System.out.println("OUI");
		}
		else {
			System.out.println("NON");
		}
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		
		int[] nums = {12,7,19};
		
		int cal = (nums[0] + nums[1] +nums[2])/nums.length;
		
		System.out.println(cal);
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		
		int numbs[][] = {
				{
					5,7,8
				},
				{
					3,2,1
				},
				{
					9,4,2
				}
		};
		
		System.out.println(numbs[0][2]);
		
		System.out.println("-------------------------------------------------------------------------------------");
		
		
		
		String noms = "Un,Deux,Trois";
		
		String[] nomss = noms.split(",");
		
		for(int i=0;i<nomss.length;i++) {
			System.out.println(nomss[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
