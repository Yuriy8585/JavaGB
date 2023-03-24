// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
// Если в массиве нет подряд идущих 1, вывести 0.

package JavaLesson;

import java.util.Scanner;

/**
 * Scan
 */
public class Static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                max++;
            }
        }
        
        System.out.println(max);
        sc.close();
    }
}   
