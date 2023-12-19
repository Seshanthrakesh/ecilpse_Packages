package chat;
import java.util.HashMap;
import java.util.Map;
public class Repeativechar {
public static void main(String[] args) {
	String inputstring="maadam";
	findrepeativeChar(inputstring);
	
}

public static void findrepeativeChar(String inputstring)
{
	Map<Character,Integer> CharFrequencyMap=new HashMap<>();
	for(char c : inputstring.toCharArray())
	{
		if(Character.isLetter(c))
{
			char ch = Character.toLowerCase(c);
			CharFrequencyMap.put(ch,CharFrequencyMap.getOrDefault(ch, 0)+1);
				
}
	}
	for(Map.Entry<Character, Integer>entry :CharFrequencyMap.entrySet()) {
		if(entry.getValue() > 1) {
			System.out.println("Character "+entry.getKey()+" is repeated "+entry.getValue()+" times");
			
		}
	}
	
}
	
	
	
}

