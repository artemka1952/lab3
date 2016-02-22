/*
Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых 
чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран 
индекс строки с наибольшим по модулю произведением элементов. 
Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
/**
 *
 * @author var1541b
 */
public class Task5 {

    public static void main(String[] args) {
        int i = 0, j = 0, max = 0, s = 0, x = 0;
        int[][] a = new int[7][4];
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = ((int) (Math.random() * 11) - 5);
            }
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                max = max + Math.abs(a[i][j]);
            }

            if (max > s) {
                x = i + 1;
                s = max;
            }
            max = 0;
        }
        System.out.println("Номер строки = " + x);
    }
}
