/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_10;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
		double[] numeros = new double[10]; // Create an array of length ten

		// Prompt the user to enter ten numbers
		System.out.print("Ingrese diez numeros: ");
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = input.nextDouble();

		// Display the smallest value
		System.out.println("El numero minimo es: " + 
			numeros[indexOfSmallestElement(numeros)] + " index " +
			indexOfSmallestElement(numeros));
	}

	/** Method indexOfSmallestElement returns the index of  
	*   the smallest element in an array of integers */
	public static int indexOfSmallestElement(double[] array) {
		if (array.length <= 1)
			return 0;
		
		double min = array[0];
		int minimumIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minimumIndex = i;
			}
		}
		return minimumIndex;
	}
}
