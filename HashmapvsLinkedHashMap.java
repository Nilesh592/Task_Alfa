import java.util.*;
class HashmapvsLinkedHashMap
{
	// This function prints ordering of all elements in hashmap which does not maintain the insertion order
	public static void main(String[] args)
	{
		Map m1 = new HashMap();
m1.put("map", "HashMap");
m1.put("schildt", "java2");
m1.put("mathew", "Hyden");
m1.put("schildt", "java2s");
System.out.println("Hashmap");
System.out.println("Key" +m1.keySet()); 
System.out.println("Value" +m1.values());

// This function prints ordering of all elements in LinkedHashMap which maintains the insertion order
LinkedHashMap lm = new LinkedHashMap();
lm.put("map", "LinkedHashMap");
lm.put("schildt", "java2");
lm.put("mathew", "Hyden");
lm.put("schildt", "java2s");
System.out.println("LinkedHashMap");
System.out.println("Key" +lm.keySet()); 
System.out.println("Value" +lm.values());
	}
}
