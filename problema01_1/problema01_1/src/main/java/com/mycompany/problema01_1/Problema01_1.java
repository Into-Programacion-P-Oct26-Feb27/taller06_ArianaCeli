/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema01_1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero1;
        int numero2;
        int opcion;
        int resultado = 0;
        boolean operacionValida = true;
        String nombreOperacion = "";

        System.out.println("Ingrese el valor del numero");
        numero1 = entrada.nextInt();

        System.out.println("Ingrese el otro valor");
        numero2 = entrada.nextInt();

        System.out.println("Ingrese la operacion que requiere generar\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicacion\n"
                + "4. Division\n"
                + "5. Modulo\n"
                + "6. Potencia\n");
        opcion = entrada.nextInt();

        if (opcion > 0 && opcion <= 6) {
            if (opcion == 1) {
                nombreOperacion = "Suma";
                resultado = numero1 + numero2;
            } else {
                if (opcion == 2) {
                    nombreOperacion = "Resta";
                    resultado = numero1 - numero2;
                } else {
                    if (opcion == 3) {
                        nombreOperacion = "Multiplicacion";
                        resultado = numero1 * numero2;
                    } else {
                        if (opcion == 4) {
                            nombreOperacion = "Division";
                            resultado = numero1 / numero2;
                        } else {
                            if (opcion == 5) {
                                nombreOperacion = "Modulo";
                                resultado = numero1 % numero2;
                            } else {
                                if (opcion == 6) {
                                    nombreOperacion = "Potencia";
                                    resultado = (int) Math.pow(numero1, numero2);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("La opcion seleccionada no es valida.");
            operacionValida = false;
        }

        if (operacionValida) {
            System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                    + "Primer numero: %d\n"
                    + "Segundo numero: %d\n"
                    + "Operacion seleccionada: %s\n\n"
                    + "Resultado: %d\n", numero1, numero2, nombreOperacion, resultado);
        } else {
            System.out.println("No es posible realizar la operación");
        }
    }
}
