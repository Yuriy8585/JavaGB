package Lesson_03;
/*Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text
сохранить text в связный список.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
Работать до тех пор, пока не введен stop
asd
[asd]
cvbn
[asd, cvbn]
g
[asd, cvbn, g]
print~1
cvbn
[asd,g] */

import java.util.Scanner;
import java.util.LinkedList;

public class Tilda {
    public static void main() {
        LinkedList<String>list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (!str.equals("stop")) {
            list.add(str);
            str = sc.nextLine();

        }
        System.out.println(list);

    }

}
