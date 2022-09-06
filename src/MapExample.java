import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> map= new HashMap<>();
		//insertion
		map.put("Kayva", 1234);  //key value pairs
		map.put("Niranjan", 4567);
		map.put("Shreyansh", 6353);
		map.put("Keerthana", 9348);
		System.out.println(map);   //prints unorderd maps
		
		map.put("Kayva", 94765);//Updated value
		System.out.println(map);
		//SEARCH
		if(map.containsKey("Ravi")) {
			System.out.println("Ravi is in the list");
		}
		else {
			System.out.println("Ravi name is not found in the List");
		}
	}

}
