
package Homework1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение в формате 'q? + ?w = e?': ");
        String equation = scanner.nextLine();

        // Перебор всех возможных комбинаций цифр на месте знаков вопроса
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String possibleEquation = equation
                        .replace("?", Integer.toString(i))
                        .replace("?", Integer.toString(j));

                // Проверка полученного выражения на корректность
                if (isValidEquation(possibleEquation)) {
                    System.out.println(possibleEquation);
                    return;
                }
            }
        }

        System.out.println("Решение не найдено");
    }

    private static boolean isValidEquation(String equation) {
        // Разбиваем уравнение на части и преобразуем к числовому типу
        String[] parts = equation.split("[+=]");
        int q = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        int e = Integer.parseInt(parts[2]);

        // Проверяем, что все числа больше или равны нулю
        if (q < 0 || w < 0 || e < 0) {
            return false;
        }

        // Проверяем, что сумма q и w равна e
        return q + w == e;
    }
}







