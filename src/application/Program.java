package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * // HashSet is implementation more fast //The HashSet does not obey the order
		 * //TreeSet Treeset keeps the data ordered Set<String> set = new
		 * LinkedHashSet<>();
		 * 
		 * set.add("Tv"); set.add("Notebook"); set.add("Tablet");
		 * 
		 * //remove as strings iniciadas com caracter T
		 * set.removeIf(x->x.charAt(0)=='T'); //remove as strings com 3 ou mais
		 * caracteres //set.removeIf(x->x.length()>=3); //set.remove("Tablet");
		 * //System.out.println(set.contains("Notebook"));
		 * 
		 * for (String p : set) { System.out.println(p); } }
		 */
		/*
		 * Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10)); Set<Integer> b
		 * = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10)); // union Set<Integer> c =
		 * new TreeSet<>(a); c.addAll(b); System.out.println(c); // intersection
		 * Set<Integer> d = new TreeSet<>(a); d.retainAll(b); System.out.println(d); //
		 * difference Set<Integer> e = new TreeSet<>(a); e.removeAll(b);
		 * System.out.println(e);
		 */

		/*
		 * Set<Product> set = new TreeSet<>();
		 * 
		 * set.add(new Product("TV", 900.0)); set.add(new Product("Notebook", 1200.0));
		 * set.add(new Product("Tablet", 400.0));
		 * 
		 * for (Product p : set) { System.out.println(p); }
		 */
	
		//    Key   Value   TreeMap ordena por ordem alfabética no caso a chave por String
		/*
		 * Map<String, String> cookiesMap = new TreeMap<>();
		 * 
		 * cookiesMap.put("username", "Maria"); cookiesMap.put("email",
		 * "maria@gmail.com"); cookiesMap.put("phone", "999711122");
		 * 
		 * cookiesMap.remove("email"); //Map sobrescreve a entrada com a chave anterior
		 * cookiesMap.put("phone", "999711133");
		 * System.out.println("Contains 'phone' key: " +
		 * cookiesMap.containsKey("phone")); System.out.println("Phone number: " +
		 * cookiesMap.get("phone")); System.out.println("Size: " + cookiesMap.size());
		 * 
		 * System.out.println("All COOKIES");
		 * 
		 * for(String keyString :cookiesMap.keySet()) { System.out.println(keyString +
		 * ": " + cookiesMap.get(keyString)); }
		 */
		
		
		/*
		 * Map<Product, Double> stockMap=new HashMap<>();
		 * 
		 * Product p1=new Product("Tv", 900.0); Product p2=new Product("Notebook",
		 * 1200.0); Product p3=new Product("Tablet", 400.0);
		 * 
		 * stockMap.put(p1, 10000.0); stockMap.put(p2, 20000.0); stockMap.put(p3,
		 * 30000.0);
		 * 
		 * Product ps = new Product("Tv", 900.0);
		 * System.out.println("Constains 'ps' key: " + stockMap.containsKey(ps));
		 */
		
		
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.println("Enter file full path: ");
		String path = "C:\\Users\\Pedro\\Git\\Eclipse_Workspace\\DataStructuresSetTreeSetMap\\Temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
			
		
	}
	
}
