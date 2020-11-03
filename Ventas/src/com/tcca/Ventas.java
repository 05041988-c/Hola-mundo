package com.tcca;

import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Cuantas membresias compraste?");
		int sales = in.nextInt();
		switch(sales){
		case 6: System.out.println("Ganaste  $1000");
		case 5: System.out.println("Gasnaste un Samsung Galaxy III-S");
		case 4: System.out.println("Ganaste una Laptop");
		case 3: System.out.println("Ganaste un  iPod");
		case 2: System.out.println("Ganaste una engrapadora");
		case 1: System.out.println("Ganaste un quita grapas");
		break;
		default: System.out.println("Sin regalo");

	}
	}
}
