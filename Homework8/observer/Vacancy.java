package Homework8;

import java.util.Random;

public class Vacancy {


    final String[] list_vacancy = {"Водитель", "Программист", "Менеджер", "Дизайнер", "Директор"};
    Random rand = new Random();
    int index = rand.nextInt(list_vacancy.length);
    public String nameVacancy = list_vacancy[index];


    public Vacancy() {
    }


}
