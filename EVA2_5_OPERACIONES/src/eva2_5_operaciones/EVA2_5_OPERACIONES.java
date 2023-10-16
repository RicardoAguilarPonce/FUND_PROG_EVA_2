/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operaciones;

/**
 *
 * @author Ricardo
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADOR --> SIMBOLO QUE EJECUTA ALGUNA ACCION
        //SUMA --> +
        int suma, val1, val2;
        val1 = 100;
        val2 = 200;
        suma = val1 + val2;//suma aritmetica
        System.out.println("SUMA--------------");
        System.out.println("La suma es = " + suma);
        //RESTA --> -
        int resta;
        resta = val1 - val2;
        System.out.println("RESTA-------------");
        System.out.println("La resta es = " + resta);
        //MULTIPLICACION --> *
        int multiplicacion;
        multiplicacion = val1 * val2;
        System.out.println("MULTIPLICACION----");
        System.out.println("La multiplicacion es = " + multiplicacion);
        //DIVISION //> /
        int division;
        division = val1 / val2;
        System.out.println("DIVISION----------");
        System.out.println("La division es = " + division);
        //POTENCIA --> No hay operador de potencia
        double potencia = Math.pow(3, 3);
        System.out.println("POTENCIA----------");
        System.out.println("3 elevado a la 3= " + potencia);
        //RAIZ --> No hay operador
        double raiz = Math.pow (100, 0.5);
        System.out.println("RAIZ--------------");
        System.out.println("La raiz cuadrada de 100 = " + raiz);
        //precedencia de operadores
        int resuOp, x = 3, y = 2, z = 5;
        resuOp = (x * z) + (x * y) / 2 - (y - z);
                //(15) + (6)/2 - (-3)
                //15 + 3 - (-3)
                //15 + 3 + 3 = 21
        System.out.println("El resultado es = " + resuOp);
        //FORMULA GENERAL: 
        double resuForm, a =3, b = 9, c = 3;
        resuForm = ((-b) - Math.pow(((b * b) - (4 * a * c)),0.5)) / (2 * a);
        System.out.println("El resultado es = " + resuForm);
    }   
    
}
