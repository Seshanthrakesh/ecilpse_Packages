package chat;
import java.util.HashSet;
import java.util.Set;
public class UniqueChar {
public static void main(String[] args) {
	String inputstring="madam";
	printuniqueChar(inputstring);
	
}

public static void printuniqueChar(String inputstring)
{
	Set<Character> uniqueChars=new HashSet<>();
	for(char c : inputstring.toCharArray())
	{
		if(Character.isLetter(c))
{
			char ch = Character.toLowerCase(c);
			uniqueChars.add(ch);
				
}
	}
	System.out.println("uniqueCharacter in the string ");
	for(char  uniqueChar:  uniqueChars) {
		
			System.out.println(uniqueChar);
			
		}
	}
	

	
	
}


