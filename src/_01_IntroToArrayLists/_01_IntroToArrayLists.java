package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("abe");
		list.add("bbe");
		list.add("ceb");
		list.add("dab");
		list.add("ee");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for(String a : list) {
			System.out.println(a);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < list.size(); i+=2) {
			System.out.println(list.get(i));
		}
		//6. Print all the Strings in reverse order.
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < list.size(); i++) {
			for(int ii = 0; ii < list.get(i).length()-1; ii++) {
				if(list.get(i).charAt(ii)== ('e')) {
					System.out.println(list.get(i));
				}
			}
		}
	}
}
