/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_año_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class EVA2_7_AÑO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo4, residuo100, residuo400;
        Scanner input = new Scanner (System.in);
        System.out.println("Indique el año a evaluar");
        year = input.nextInt();
        //&& operador Y (and)
        //|| operador O (or)
        //! operador negacion (not)
        //!= operador diferente a
        residuo4 = year % 4;
        residuo100 = year % 100;
        residuo400 = year % 400;
        if((residuo4 == 0) && ((residuo100 != 0) || (residuo400 == 0)))
            System.out.println("El año " + year + " es bisiesto");
        else
            System.out.println("El año " + year + "no es bisiesto");
    }
    
}
