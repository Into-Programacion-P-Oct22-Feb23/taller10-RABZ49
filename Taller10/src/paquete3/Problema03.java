/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        int f;
        int c;

        for (f = 0; f < notasCuantitativas.length; f++) {
            for (c = 0; c < notasCuantitativas[f].length; c++) {
                if (notasCuantitativas[f][c] >= 0
                        && notasCuantitativas[f][c] <= 2.9) {
                    notasCualitativas[f][c] = "insuficiente";
                } else if (notasCuantitativas[f][c] >= 3
                        && notasCuantitativas[f][c] <= 4.9) {
                    notasCualitativas[f][c] = "regular";
                } else if (notasCuantitativas[f][c] >= 5
                        && notasCuantitativas[f][c] <= 7.9) {
                    notasCualitativas[f][c] = "buena";
                } else if (notasCuantitativas[f][c] >= 8
                        && notasCuantitativas[f][c] <= 9.5) {
                    notasCualitativas[f][c] = "muy buena";
                } else if (notasCuantitativas[f][c] >= 9.6
                        && notasCuantitativas[f][c] <= 10) {
                    notasCualitativas[f][c] = "sobresaliente";
                }
            }
        }
        for (f = 0; f < notasCuantitativas.length; f++) {
            for (c = 0; c < notasCuantitativas[f].length; c++) {
                System.out.printf("%.2f = Nota %s\n",
                        notasCuantitativas[f][c],
                        notasCualitativas[f][c]);
            }
        }

    }
}
