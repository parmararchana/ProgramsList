package Program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) 
	
	{
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,"Urvesh");
		map.put(2, "Ripal");
		map.put(3, "Archana");
		
		System.out.println(map);
		
		Set<String> xyz =  new HashSet<> ();
		
		xyz.add("Urvesh");
		xyz.add("Ripal");
		xyz.add("Archana");
		xyz.add("Urvesh");
		xyz.add("Ripal");
		
		System.out.println(xyz);
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}