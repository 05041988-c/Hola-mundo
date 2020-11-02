package com.tcca;

import java.util.Scanner;

public class ChecarValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int value = 0;
		System.out.println("Teclea un numero:");
		value = in.nextInt();
		
		if( value == 7)
		System.out.println("¡Que buena suerte!");
		else if( value == 13)
		System.out.println("¡que mala suerte!");
		else
		System.out.println("¡Eso no es ni suerte ni mala suerte!");

	}

}
