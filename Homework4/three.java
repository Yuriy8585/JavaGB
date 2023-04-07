
/*
Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->

К калькулятору добавить логирование.
1 + 3 = 4
4 + 3 = 7

В калькулятор добавьте возможность отменить последнюю операцию.
Пример

1
+
2
ответ:
3

+
4
ответ:
7
+
2

ответ:

9
1
Ответ 8
Отмена -> 9
Отмена -> 7
Отмена -> 3
+
2
Ответ 5

Реализовать запись в файл calc.txt
 */
package Homework4;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class three {
    private List<String> log = new ArrayList<>();
    private double result;

    public three() {
        result = 0;
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter a number: ");
            double num1 = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Enter an operator (+, -, *, /, undo): ");
            String operator = scanner.nextLine();

            System.out.print("Enter another number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case "undo":
                    undo();
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    break;
            }
            if (!operator.equals("undo")) {
                String equation = num1 + " " + operator + " " + num2 + " = " + result;
                System.out.println("Answer: " + result);
                log.add(equation);
            }

            System.out.print("Do you want to continue? (y/n): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("n")) {
                exit = true;
            }
        }

        try {
            FileWriter writer = new FileWriter("calc.txt");
            for (String equation : log) {
                writer.write(equation + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void undo() {
        
        if (log.size() > 0) {
            String lastEquation = log.remove(log.size() - 1);
            String[] parts = lastEquation.split(" ");
            double lastResult = Double.parseDouble(parts[parts.length - 1]);
            result = lastResult;
            System.out.println("Undo: " + lastEquation);
        } else {
            System.out.println("Error: No equations to undo!");
        }
        /*
        try {
            // открыть файл calc.txt для чтения и записи

            File file = new File("calc.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");

            // переместить указатель в конец файла
            raf.seek(raf.length());

            // переместить указатель на начало последней строки
            long pos = raf.getFilePointer() - 1;
            while (pos > 0) {
                raf.seek(pos);
                if (raf.readByte() == '\n') {
                    break;
                }
                pos--;
            }

            // установить размер файла на позицию начала последней строки
            raf.setLength(pos);

            // закрыть файл
            raf.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }   */
    
    }

    public static void main(String[] args) {
        three calculator = new three();
        calculator.calculate();
        //calculator.undo();
    }
}

