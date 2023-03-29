/*Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл. */

package Homework2.Buble;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BubleSort {

    public static void main(String[] args)
    {
        int[] numbers = new int[20];
        Random random = new Random();
        
        // заполнение массива случайными значениями
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // генерируем случайное число от 0 до 99
        }
        
        // вывод массива в консоль
        System.out.println("Массив из 20 чисел:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int num = scanner.nextInt();

        System.out.print("Введите максимальное число: ");
        int max = scanner.nextInt();

        if (num > max) {
            System.out.println("Количество чисел не может быть больше максимального числа");
            return;
        }

        int[] array = new int[20];
        int count = 0;

        while (count < num) {
            int number = (int) (Math.random() * max) + 1;

            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (array[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                array[count] = number;
                count++;
            }
        }
        
        System.out.println("Итоговый массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/
        sort(numbers);
    }

  

    public static void sort(int[] array) {
        int len = array.length;
        boolean swapped;
        try {
            FileWriter writer = new FileWriter("log.txt");
            for (int i = 0; i < len-1; i++) {
                swapped = false;
                for (int j = 0; j < len-i-1; j++) {
                    if (array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        swapped = true;
                    }
                }
                if (swapped) {
                    writer.write("Iteration " + (i+1) + ": ");
                    for (int k = 0; k < len; k++) {
                        writer.write(array[k] + " ");
                    }
                    writer.write("\n");
                } else {
                    break;
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
        