/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class EVA_2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año a evaluar:");
        year = input.nextInt();
        
        residuo = year % 4;
        if(residuo == 0){//verdad: el año es divisible entre 4
            residuo = year % 100;
            if(residuo == 0){//verdad: el año es divisible entre 100
                residuo = year % 400;
                        if (residuo == 0)//verdad: el año es divisible entre 400
                            System.out.println("Es año bisiesto");
                        else
                            System.out.println("No es año bisiesto");
            }else
                System.out.println("Es año bisiesto");
        }else
            System.out.println("No es año bisiesto");
    }
    
}
