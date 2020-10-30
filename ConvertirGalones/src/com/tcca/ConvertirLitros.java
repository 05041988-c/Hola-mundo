package com.tcca;

import java.util.Scanner;

public class ConvertirLitros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclea el numero de galones que deseas convertir a litros");
		double galones =sc.nextDouble();
		
		double litros =galones*3.785;
		
		System.out.println("El numero total de litros : "+litros+" ");
		
	}

}
