package com.tcca;

import java.util.Scanner;
public class PalindromeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Teclea una palabra:");
		String word = in.next();
		int firstPosition = 0;
		int lastPosition = word.length() - 1;
		boolean isAPalindrome = true;
		while(firstPosition < lastPosition){
		if(word.charAt(firstPosition)!=word.charAt(lastPosition))
		isAPalindrome = false;
		firstPosition++;
		lastPosition--;
		}
		if(isAPalindrome)
		System.out.println("La palabra es un Palindrome");
		else
		System.out.println("La palabra no es un  Palindrome");


	}

}
