package com.tcca;

import java.util.Scanner;

public class ChecadorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String name = "";
		System.out.println("Teclea tu nombre:");
		name = in.next();
		if( name.equals("Elvis"))
		System.out.println("Eres el rey del rock and roll");
		else if( name.equals("Michael Jackson"))
		System.out.println("Eres el rey del pop!");
		else
		System.out.println("Tu no eres el rey");

	}

}
