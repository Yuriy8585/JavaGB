package Homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Metod {
    public static void main(String[] args) {

        Notebook n1 = new Notebook("Apple", 16, 512, "MacOs", "silver");
        Notebook n2 = new Notebook("Dell", 8, 256, "Windows", "black");
        Notebook n3 = new Notebook("Hp", 4, 128, "Linux", "white");
        Notebook n4 = new Notebook("Lenovo", 8, 512, "Windows", "black");
        Notebook n5 = new Notebook("Apple", 32, 1024, "MacOs", "silver");
        Set<Notebook> list = new LinkedHashSet<>(Set.of(n1, n2, n3, n4, n5));

        choiseNotebook(list, filter());
    }

    public static HashMap<String, Object> filter() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Object> custom = new HashMap<String, Object>();
        custom.put("ram", 0);
        custom.put("hdd", 0);
        custom.put("os", "");
        custom.put("color", "");
        System.out.println("\nChoose your criteria:\n");
        while (true) {
            System.out.println("\n1. Value RAM");
            System.out.println("2. Value HDD");
            System.out.println("3. OS");
            System.out.println("4. Color");
            System.out.println("0. Exit");
            System.out.println("Choose your criteria: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter min Value RAM: ");
                    int ram = sc.nextInt();
                    custom.put("ram", ram);
                    return custom;

                case 2:
                    System.out.println("\nEnter min Value HDD: ");
                    int hdd = sc.nextInt();
                    custom.put("hdd", hdd);
                    return custom;

                case 3:
                    System.out.println("\n Choose your OS \n");
                    System.out.println("1. Windows");
                    System.out.println("2. Linux");
                    System.out.println("3. MacOs");
                    System.out.println(" Choose your OS: ");
                    int choiceOs = sc.nextInt();
                    switch (choiceOs) {
                        case 1:
                            custom.put("os", "Windows");
                            return custom;
                        case 2:
                            custom.put("os", "Linux");
                            return custom;
                        case 3:
                            custom.put("os", "MacOs");
                            return custom;
                        default:
                            System.out.println("Not found");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("\nChoose you color\n");
                    System.out.println("1. Silver");
                    System.out.println("2. White");
                    System.out.println("3. Black");
                    System.out.println("Choose your color: ");
                    int choiceColor = sc.nextInt();
                    switch (choiceColor) {
                        case 1:
                            custom.put("color", "silver");
                            return custom;
                        case 2:
                            custom.put("color", "white");
                            return custom;
                        case 3:
                            custom.put("color", "black");
                            return custom;
                        default:
                            System.out.println("Not found");
                            break;
                    }
                    break;

                case 0:
                    sc.close();
                    return custom;

                default:
                    System.out.println("Not found");
                    break;
            }

        }

    }

    public static void choiseNotebook(Set<Notebook> list, HashMap<String, Object> filter) {
        ArrayList<Notebook> result = new ArrayList<>();
        for (Notebook element: list) {
            if (element.getRam() >= (Integer) filter.get("ram") &&
                    element.getHdd() >= (Integer) filter.get("hdd") &&
                    (element.getOs().equals((String) filter.get("os"))
                            || filter.get("os").equals(""))
                    &&
                    (element.getColor().equals((String) filter.get("color"))
                            || filter.get("color").equals(""))) {
                result.add(element);
            }
        }
        if (result.size() == 0)
            System.out.println("Note book in such parametrs doesn't exist.");
        else {
            System.out.println("\n Please choose from above:");
            for (int index = 0; index < result.size(); index++) {
                System.out.println(result.get(index));
            }
        }

    }
}