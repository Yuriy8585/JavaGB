/*
Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. 
*/

package Homework2.Lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class classroom {
    public static void main(String[] args) {
        try {
            File file = new File("lesson.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");

                StringBuilder builder = new StringBuilder("Студент ");
                for (String token : tokens) {
                    if (token.contains("фамилия")) {
                        builder.append(token.split(":")[1]);
                    } else if (token.contains("оценка")) {
                        builder.append(" получил ");
                        builder.append(token.split(":")[1]);
                    } else if (token.contains("предмет")) {
                        builder.append(" по предмету ");
                        builder.append(token.split(":")[1]);
                    }
                }

                builder.append(".");
                System.out.println(builder.toString());
            }

            //scanner.close();
        } 
        
        catch (FileNotFoundException e) {e.printStackTrace();}
        System.out.println("Ошибка при открытии файла");
    }

}
