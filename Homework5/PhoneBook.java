package Homework5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String name = scanner.nextLine();
        System.out.println("Введите номер:");
        String number = scanner.nextLine();

        ArrayList<String> numbers = phoneBook.getOrDefault(name, new ArrayList<String>());
        numbers.add(number);
        phoneBook.put(name, numbers);

        System.out.println("Номер добавлен в телефонную книгу.");
        scanner.close();
    }

    public void printAll() {
        for (String name : phoneBook.keySet()) {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите\n1) Добавление номера\n2) Вывод всего\n >>>>");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    phoneBook.addNumber();
                    break;
                case 2:
                    phoneBook.printAll();
                    break;
                default:
                    System.out.println("Ошибка: некорректный ввод.");
                    break;
                }
        
            try {
                    FileWriter writer = new FileWriter("phonebook.txt");
                    
                    for (String name : phoneBook.keySet()) {
                        
                        writer.write(name +"\n");
                    }
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }
        }

    private String[] keySet() {
        return phoneBook.keySet().toArray(new String[0]);
    }
}

    



