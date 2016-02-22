/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author var1541b
 */
public class Task3 {

    public static void main(String[] args) {
        int i = 0, j = 0, s = 0;
        int[] a = new int[15];
        for (i = 0; i < 15; i++) {
            a[i] = (int) (Math.random() * 9);
        }
        for (i = 0; i < 15; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (i = 0; i < 15; i++) {
            if (a[i] % 2 == 0) {
                s++;
            }
        }
        System.out.println("Четных элементов= " + s);
    }
}
