package Homework5;
import java.util.*;
public class names {

    public static void main(String[] args) {
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                              "Анна Мусина", "Анна Крутова", "Иван Юрин",
                              "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                              "Мария Федорова", "Марина Светлова", "Мария Савина",
                              "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                              "Иван Мечников", "Петр Петин", "Иван Ежов"};

        // Создаем мапу для хранения имен и количества повторений
        Map<String, Integer> nameCounts = new HashMap<>();

        // Итерируемся по списку сотрудников и заполняем мапу
        for (String employee : employees) {
            String[] nameParts = employee.split(" ");
            String firstName = nameParts[0];
            Integer count = nameCounts.get(firstName);
            if (count == null) {
                count = 0;
            }
            nameCounts.put(firstName, count + 1);
        }

        // Создаем список пар "имя - количество повторений" для сортировки
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(nameCounts.entrySet());

        // Сортируем список в порядке убывания количества повторений
        Collections.sort(entries, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Выводим результаты
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}