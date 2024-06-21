
import java.util.Scanner;

/*El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.

Si está entre 9 y 10: imprimir una A

Si está entre 8 y menor a 9: imprimir una B

Si está entre 7 y menor a 8: imprimir una C

Si está entre 6 y menor a 7: imprimir una D

Si está entre 0 y menor a 6: imprimir una F

cualquier otro valor debe imprimir: Valor desconocido*/

public class HolaMundo {

    public static void main(String[] args) {

        //AREA Y PRERIMETRO DE UN RECTANGULO
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona un valor entre 0 y 10");
        int valor = consola.nextInt();
        
        if(valor == 10 || valor == 9 )  {
            System.out.println("Tu calificacion es 'A'");
        }
        else if (valor == 8){
            System.out.println("Tu calificacion es 'B'");
        }
        else if (valor == 7){
            System.out.println("Tu calificacion es 'C'");
        }
        else if (valor == 6){
            System.out.println("Tu calificacion es 'D'");
        }
        else if (valor < 6 &&  valor > 0){
            System.out.println("Tu calificacion es 'F'");
        }
        else if (valor < 0 || valor > 10){
            System.out.println("Tu valor es incorrecto");
        }
            
    }
}
