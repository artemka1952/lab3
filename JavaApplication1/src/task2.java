/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на 
экран в строку, а затем этот же массив выведите на экран тоже в строку, но в 
обратном порядке (99 97 95 93 … 7 5 3 1).
 */

/**
 *
 * @author var1541b
 */
public class Task2 {

    public static void main(String[] args) {

        int[] a = new int[10];
        int j = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                a[j] = i;
                System.out.print(" " + a[j]);
            }
        }
        System.out.println();
        j = 0;
        for (int i = 99; i >= 1; i--) {
            if (i % 2 != 0) {
                a[j] = i;
                System.out.print(" " + a[j]);
            }
        }
    }
}
