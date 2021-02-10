import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {

    public static void main(String[] args) {
            pares();
    }
    
        /**
    * Método pares a modificar. Debe incluir las condiciones 
    * necesarias para mostrar por pantalla todos los números pares
    * comprendidos entre 1 y num, num incluido, si es par
    */
    public static void pares() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es un número par.");
            } else {
                
            }
        }
    }
}