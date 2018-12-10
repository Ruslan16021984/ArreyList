package com.gmail.carbit3333333;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		collectArray();
		// TODO Auto-generated method stub

	}
	public static void collectArray() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		arrayList.add("G");
		arrayList.add("H");
		arrayList.add("O");
		arrayList.add("P");
		System.out.println(arrayList);
		
		arrayList.remove(0);
		arrayList.remove(0);
		arrayList.remove(arrayList.size()-1);
		
		System.out.println(arrayList);
		
	}
	

}
