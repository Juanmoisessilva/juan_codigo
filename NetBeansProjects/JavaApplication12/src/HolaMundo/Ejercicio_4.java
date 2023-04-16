
//Dada una cantidad de grados centígrados se debe mostrar 
// su equivalente en grados Fahrenheit.
//La fórmula correspondiente es: F = 32 + (9 * C / 5).


package HolaMundo;

import java.util.Scanner;



public class Ejercicio_4 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los grados centigrados");
        int celcius = leer.nextInt();
        int fahrenheit = 32 + (9 * celcius/ 5);
        System.out.println("Su equivalencia en fahrenheit es de: " + fahrenheit);
    }

    
}
