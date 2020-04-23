package com.algos;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		String test1 = "SILENT";
		String test2 = "LISTEN";
		
		boolean isWorkdsAnagram = checkAnagram(test1, test2);
		System.out.println(isWorkdsAnagram);
		
		test1 = "test";
		test2 = "tset";
		
		isWorkdsAnagram = checkAnagram(test1, test2);
		System.out.println(isWorkdsAnagram);
		
	}

	private static boolean checkAnagram(String test1, String test2) {
		char[] test1Char = test1.toCharArray();
		char[] test2Char = test2.toCharArray();
		
		Arrays.sort(test1Char);
		Arrays.sort(test2Char);
		
		List<char[]> charss = Arrays.asList(test1Char);
		//char[] charArray = (char[])charss.toArray();
		
		
		if(test1Char.length==test2Char.length) {
			for(int i=0; i<test1Char.length; i++) {
				if(test1Char[i]!=test2Char[i]) {
					return false;
				}
			}
		}else {
			return false;
		}
		
		List<char[]> charlist = Arrays.asList(test1Char);
		for(int i=0; i<charlist.size(); i++) {
			
		}
		
		
		return true;
	}
}
