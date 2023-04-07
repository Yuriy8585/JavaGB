/*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

123456 Иванов

321456 Васильев

234561 Петрова

234432 Иванов

654321 Петрова

345678 Иванов

Вывести данные по сотрудникам с фамилией Иванов. */
package Lesson_04;

import java.util.HashMap;

public class Base1 {
    public static void name(String[] args) {
        HashMap<Integer, String> passport = new HashMap<Integer, String>();
        passport.put(123456, "Иванов");
        passport.put(321456, "Васильев");
        passport.put(234561, "Петрова");
        passport.put(234432, "Иванов");
        passport.put(654321, "Петрова");
        passport.put(345678, "Иванов");
        for (var key : passport.keySet()) {
              if (passport.get(key).equals("Иванов")) {
                  System.out.println(key);
        }
    }

}
}
