/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURA LA CALIFICACION
        int calificacion;
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la calificacion:");
        calificacion = input.nextInt();
        
        //VAMOS A EVALUAR:
        if((calificacion >= 0) && (calificacion <= 100)){
            System.out.println("La calificacion " + calificacion + " es valida");
            if(calificacion >=70)
                System.out.println("Acreditas");
            else
                System.out.println("No acreditas");
        }else
            System.out.println("La calificacion " + calificacion + " no es valida");
    }
    
}
