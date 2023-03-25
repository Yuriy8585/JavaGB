/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
 */

package Homework1;
import java.util.Scanner;
public class Task1 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scan.nextInt();

        // вычисление треугольного числа
        int triangularNumber = n*(n+1)/2;
        System.out.printf("Треугольное число 1 + 2 + ... + %d = %d%n", n, triangularNumber);

        // вычисление факториала
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.printf("%d! = %d%n", n, factorial);
        scan.close();
    }
}