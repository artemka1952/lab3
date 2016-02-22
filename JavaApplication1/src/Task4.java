/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Artem
 */
public class Task4 {

    public static void main(String[] args) {
        int i = 0, j = 0;
        int[][] a = new int[8][5];
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 5; j++) {
                a[i][j] = ((int) (Math.random() * 89) + 10);
            }
        }
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(a[i][j] + "\t");
            }System.out.println();
        }
    }
}
