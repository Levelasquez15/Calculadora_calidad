package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        try {
            System.out.print("Digite el primer número: ");
            int a = leer.nextInt();

            System.out.print("Digite el segundo número: ");
            int b = leer.nextInt();

            System.out.println("Seleccione la operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Opción: ");
            int op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Resultado de la suma: " + calc.sumar(a, b));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + calc.restar(a, b));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " + calc.multiplicar(a, b));
                    break;
                case 4:
                    try {
                        System.out.println("Resultado de la división: " + calc.dividir(a, b));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("debe ingresar solo números.");
        }

        leer.close();
    }
}
