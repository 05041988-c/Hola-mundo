package com.tcca;   //paquete

public class Insercion {// clase

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cartas[] = { 1, 10, 3, 65, 5, 7, 90}; // el arreglo se llama cartas
		int pos;	// pos =posicion
		int val;	// val= valor
		
		// mostrar cartas desordenadas
		System.out.println("El desorden de las cartas es: ");
		for (int i=0; i<cartas.length; i++)
		{
			System.out.println(cartas[i]);
		}
		 
		//ordenamiento de las cartas 
		for (int i=0; i<cartas.length; i++) {
			pos=i; val= cartas[i];
			
		while( (pos>0) && (cartas [pos-1] > val)) {
			cartas[pos] = cartas [pos-1];
			pos --;
			cartas[pos] = val;
			
			//imprime los valores ordenados
			System.out.println("El orden de las cartas es: ");
			for (int i1=0; i1<cartas.length; i1++){
				{
				System.out.println(cartas[i1]);
					
		}
		}
		
	}

}
	}
}