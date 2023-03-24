package JavaLesson;

import java.util.Scanner;

/**
 * Scan
 */
public class Scan {

    public static void main(String[] args) {
        System.out.println("Hello, World! \n");  //ln переход на строку
        Scanner sc = new Scanner(System.in);  // доступ к входящим переменным
        int age = sc.nextInt();  // получение возраста
        String name = sc.nextLine();  // получение имени пользователя
        System.out.println("Ваш возраст: " + age);
        System.out.println("Ваше имя: " + name);
        sc.close();  // закрытие сканера

    }

}