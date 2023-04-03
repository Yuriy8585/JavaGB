package Lesson_03;
/*
 * Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
public class sort {
    public static void main(String[] args)
    {
    ArrayList<Integer> list = new ArrayList<Integer>(10);
    Random random = new Random();

    for (int i = 0; i < 10; i++) 
        list.add(random.nextInt(0,100));
    
    System.out.println(list);
    list.sort(Comparator.naturalOrder());
    System.out.println(list);
}
}