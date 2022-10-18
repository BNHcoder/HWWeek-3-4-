package Week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VWeek4Video3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List
		//allows duplicates   common ArrayList, LinkedList, Vector
		
		List<String> students = new ArrayList<String>();
		
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		
		
		for (String student : students) {
			
		System.out.println(student);	
	
			
		}
		
		System.out.println(students.get(2));
		System.out.println(students.get(0));
		
		
		
		//Set   
		// no duplicates, does not maintain set order, does allow one null
		// common implementation HashSet, LinkedHashSet, TreeSet
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		
		
		System.out.println(states.size());
		System.out.println(states.contains("Alabama"));
		
		for (String state : states) {
			System.out.println(state);
			
			
			}	
		
		//Map
		//Key is integers in this case Value
		//Key value pairs (like a dictionary)   key can have multiple values, example multiple Tommy's but not multiple positions
		// Common Implementations HashMap, LinkedHashMap, TreeMap, HashTable
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		//racerPlacement.remove(1); will remove Tommy
		//racerplacement.size
		
		
		System.out.println(racerPlacements.get(1));   
		//returned tommy or value in Value
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
			
			System.out.println(key + " : " + racerPlacements.get(key) );
		}
		
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			
			System.out.println(racer);
		}
		
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "Make something greater or increase");
		dictionary.put("Diminish", "Make or become less");
		dictionary.put("Ostentacious", "Vulgar or Pretentious display");
		
		
		
		
		
	}

	}
