package EjerciciosIngles;

import java.util.Scanner;

public class EjercicioIngles {
	public static void main(String [] args) {
		Scanner	sc=new	Scanner(System.in);
		//Variables\\
		
		//Boolean
		Boolean manzana;	//1
		Boolean tomate;		//2
		Boolean platano;	//3
		Boolean ensalada;	//4
		Boolean patatas;	//5
		
		//String
		String respuesta1;
		String respuesta2;
		String respuesta3;
		String respuesta4;
		String respuesta5;
		String respuesta6;
		
		//Analisis de ejercicio
		int resFinal;
		
		//Puntuacion
		int punt=0;
		
		//Ejecucion\\
		
		System.out.println("Traduce las siguientes palabras: ");
		System.out.println();
		System.out.print("Manzana: ");
		respuesta1=sc.next();
		System.out.println();
		System.out.print("Tomate: ");
		respuesta2=sc.next();
		System.out.println();
		System.out.print("Plátano: ");
		respuesta3=sc.next();
		System.out.println();
		System.out.print("Ensalada: ");
		respuesta4=sc.next();
		System.out.println();
		System.out.print("Patatas: ");
		respuesta5=sc.next();
		System.out.println();
		
		//Analisis
		
		System.out.print("Resultados analizados,pulsa 1 para continuar: ");
		resFinal=sc.nextInt();
		
		//Condicion\\
		
		
		if (resFinal==1) {
			//Manzana
			if (manzana=respuesta1.equalsIgnoreCase("apple")) {
				punt++;
				System.out.println("Bien " + "Puntuación:" + punt);
			}
			else {
				punt--;
				System.out.println("Mal " + "Puntuación:" + punt);
			}
			
			//Tomate
			if (tomate=respuesta2.equalsIgnoreCase("tomato")) {
				punt++;
				System.out.println("Bien " + "Puntuación:" + punt);
			}
			else {
				punt--;
				System.out.println("Mal " + "Puntuación:" + punt);
				
			}
			
			//Platano
			if (platano=respuesta3.equalsIgnoreCase("banana")) {
				punt++;
				System.out.println("Bien " + "Puntuación:" + punt);
			}
			else {
				punt--;
				System.out.println("Mal " + "Puntuación:" + punt);
			}
			
			//Ensalada
			if (ensalada=respuesta4.equalsIgnoreCase("salad")) {
				punt++;
				System.out.println("Bien " + "Puntuación:" + punt);
			}
			else {
				punt--;
				System.out.println("Mal " + "Puntuación:" + punt);
			}
			
			//Patatas
			if (patatas=respuesta5.equalsIgnoreCase("chips")) {
				punt++;
				System.out.println("Bien " + "Puntuación:" + punt);
			}
			else {
				punt--;
				System.out.println("Mal " + "Puntuación:" + punt);		
			}
		}
		
	}
}
