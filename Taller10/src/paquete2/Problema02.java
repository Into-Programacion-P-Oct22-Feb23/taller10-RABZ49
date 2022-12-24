/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[][] ventasIndividual = new int[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int suma = 0;

        for (int i = 0; i < vendedores.length; i++) {
            System.out.print("-----------------------------------\n");
            System.out.println(vendedores[i]);
            for (int j = 0; j < ventasIndividual[i].length; j++) {
                System.out.println("Ingrese el número de venta del día: ");
                ventasIndividual[i][j] = entrada.nextInt();

                suma = suma + ventasIndividual[i][j];

            }

        }
        for (int i = 0; i < vendedores.length; i++) {
            System.out.printf("Vendedor(a) %s\n", vendedores[i]);

        }
        System.out.printf("Ha realizado un total de %d en ventas.\n", suma);

    }
}
