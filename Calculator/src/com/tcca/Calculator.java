package com.tcca;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int answer = 0;
		System.out.println("Teclea un numero:");
		int num1 = in.nextInt();
		System.out.println("Teclea otro numero:");
		int num2 = in.nextInt();
		System.out.println("Teclea el operando de la operacion que deseas realizar:");
		char input = in.next().charAt(0);
		switch (input){
		case '*' :
		answer = num1 * num2;
		break;
		case '/' :
		answer = num1 / num2;
		break;
		case '%' :
		answer = num1 % num2;
		break;
		case '+' :
		answer = num1 + num2;
		break;
		case '-' :
		answer = num1 - num2;
		break;
		default:
		System.out.println("Operador invalido.");
		}
		System.out.println("El resultado es: " + answer);

	}

}
