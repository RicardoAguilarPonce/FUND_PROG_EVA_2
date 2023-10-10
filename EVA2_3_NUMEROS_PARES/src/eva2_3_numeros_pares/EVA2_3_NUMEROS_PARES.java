/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor, residuo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el valor a evaluar:");
        valor = input.nextInt();
        
        residuo = valor % 2;//modulo, calcula el residuo.
        
        if(residuo == 0)//verdad --> el numero es par
            System.out.println("El numero es par.");
        else
            System.out.println("El numero es impar.");
    }
    
}
