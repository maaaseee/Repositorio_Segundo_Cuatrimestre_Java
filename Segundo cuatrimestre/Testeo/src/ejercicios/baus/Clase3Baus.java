package ejercicios.baus;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Clase3Baus {
    static int sumar(int a, int b){
        return a + b;
    }
    static int multiplicar(int a, int b) {
        return a * b;
    }
    static double division(int a, int b){
        return (double) a / b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int suma1;
        int producto;
        double division;
        
        System.out.print("Ingrese un numero: ");
        try {
            num1 = input.nextInt();
        }
        catch(InputMismatchException ex){
            System.out.println("No es un número");
            return;
        }
        System.out.print("Ingrese otro numero: ");
        num2 = input.nextInt();
        
        suma1 = sumar(num1, num2);
        producto = multiplicar(num1, num2);
        division = division(num1, num2);
        
        System.out.printf("La suma de %d y %d, es igual a %d\n",
                num1, num2, suma1);
        System.out.printf("El producto de %d y %d, es igual a %d\n"
                , num1, num2, producto);
        System.out.printf("El resultado de la division entre %d y %d es: %.2f\n",
                num1, num2, division);
    }
}
