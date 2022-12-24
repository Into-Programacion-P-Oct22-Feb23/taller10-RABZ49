/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        int f;
        int c;
        for (f = 0; f < datos.length; f++) {
            for (c = 0; c < datos[f].length; c++) {
                System.out.printf("Ingrese el dato para la Fila [%d] Y "
                        + "columna [%d]:\n", f, c);
                datos[f][c] = entrada.nextDouble();
            }
        }
        System.out.println("<-------------------->");
        System.out.println("El arreglo queda:");
        for (f = 0; f < datos.length; f++) {
            for (c = 0; c < datos[f].length; c++) {
                System.out.printf("%.0f\t",
                        datos[f][c]);
            }
            System.out.println();
        }
    }

}
