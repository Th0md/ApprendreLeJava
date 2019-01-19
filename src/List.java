import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class List {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(25);
		list.add("Text");
		list.add(new Object());

		System.out.println(list.get(1));

		// list.remove(0);

		// System.out.println(list.get(1));

		// list.remove(0);

		if (list.size() != 1) {
			System.out.println("le tableau n'est pas egale a 1");
		} else {
			System.out.println("le tableau est egale a 1");
		}

		if (list.contains("Text")) {
			System.out.println("La case Texte existe");
		} else {
			System.out.println("La case Texte n'existe pas");
		}

		System.out.println(
				"--------------------------------------ArrayList-----------------------------------------------------------------------");

		ArrayList<String> list2 = new ArrayList();
		list2.add("Un element");
		list2.add("Un deuxieme element");
		list2.add("Et un troisieme");

		System.out.println(list2);

		System.out.println(
				"--------------------------------------HashMap-----------------------------------------------------------------------");

		Map<String, Integer> map = new HashMap<>();
		map.put("Text", 10);
		map.put("Encore", 55);
		map.put("Et un troisieme", 40);

		if (map.containsKey("Encore")) {
			System.out.println("Encore existe");
		} else {
			System.out.println("Encore n'existe plus");
		}

		System.out.println(map.toString());

		map.remove("Encore");

		map.put("Remplacement", 50);

		System.out.println(map.toString());

		System.out.println(map.get("Text")); // Renvoie la valeur assosiee
		
		
		if (map.containsKey("Encore")) {
			System.out.println("Encore existe");
		} else {
			System.out.println("Encore n'existe plus");
		}
		
		for(Entry<String, Integer> element : map.entrySet()) {
			System.out.println("Titre  : "+element.getKey());
			System.out.println("Nombre : "+element.getValue());
		}
		
		System.out.println("/");
		
		int moy = 0;
		
		for(Entry<String, Integer> ele : map.entrySet()) {
			moy += ele.getValue();
		} 
		moy/=map.size();
		
		System.out.println("Moyenne = "+moy);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
