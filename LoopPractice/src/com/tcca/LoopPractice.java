package com.tcca;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int repeat = 0;
		int sum = 0;
		do{
		System.out.println("Teclea un numero");
		int input = in.nextInt(); //user inputs a number
		sum+=input; //add user input to sum
		System.out.println("Quieres introducir otro numero?");
		System.out.println("Enter 1 para sio 2 para no:");
		repeat = in.nextInt();
		} while(repeat==1);
		System.out.println("La suma de los numeros es: " + sum);

	}

}
