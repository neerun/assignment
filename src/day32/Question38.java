package day32;

import java.util.Scanner;

public class Question38 {
	

	//Write a program to check whether a given string is palindromes or not.
	public static void  main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the palindromes String");
		String s = input.next();
		
		for(int i =s.length()-1;i >=0 ;i--) {
			s += s.charAt(i);
		
		}
		if(s.equals(s)) {
		System.out.println("is a Palindromes string ");
	}  else{
		System.out.println("is not a palindorms string");
		
		input.close();
	}
	}
}

	
		
	
		
		
	


