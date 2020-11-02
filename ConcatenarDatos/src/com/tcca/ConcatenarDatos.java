package com.tcca;

import java.util.Scanner;

public class ConcatenarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclea el numero de cm que deseas convertir a metros");
		double metros =sc.nextDouble();
		
		double centimetros =metros*100;
		
		System.out.println("El numero total de centimetros son : "+centimetros+" ");
	}//los signos de  "+ +" indican cual es le valor que jalaran

}