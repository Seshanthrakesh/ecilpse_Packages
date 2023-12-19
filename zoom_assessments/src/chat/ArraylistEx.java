package chat;

import java.util.ArrayList;

public class ArraylistEx {

	public static void main(String[] args) {
		ArrayList <String> al =new ArrayList<>();
		al.add("Red");
		al.add("Blue");
		al.add("Black");
		
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println(".................");
		for (String s:al) {
			System.out.println(s);
		}
		System.out.println(".................");
		al.add("White");
		System.out.println("\n"+al+"\n");
		System.out.println(al.get(1));
		al.set(2,"white");
		System.out.println(al);
		System.out.println(al.remove(2));
		boolean con=al.contains("Red");
		System.out.println(".................");
		System.out.println(con);
	}
}


