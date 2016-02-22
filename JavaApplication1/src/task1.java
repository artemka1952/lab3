/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author var1541b
 */
public class Task1 {

    public static void main(String[] args) {

        int[] a = new int[10];
        int j = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                a[j] = i;
                System.out.println("a[" + j + "]=" + a[j]);
                j++;
            }
        }
    }
}
