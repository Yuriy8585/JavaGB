package Lesson_03;

import java.util.ArrayList;
import java.util.LinkedList;
/*1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим. */
import java.util.Random;


public class LinkeList {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        long startA = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
        arrList.add(0, i);
        }
        long stopA = System.currentTimeMillis();
        System.out.println(stopA - startA);

        LinkedList<Integer> linkedList = new LinkedList<>();
        long startB = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(0, i);
        }
        long stopB = System.currentTimeMillis();
        System.out.println(stopB - startB);
    }
}
/*
    public static void ArrayL() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startA = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(new Random().nextInt(100));

    }
    long endA = System.currentTimeMillis();
    System.out.println("ArrayList: " + (endA - startA));
    LinkedList<Integer> linkedList = new LinkedList<>();
    long startB = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
        linkedList.add(new Random().nextInt(100));
    }
    long endB = System.currentTimeMillis();
    System.out.println("LinkedList: " + (endB - startB));
    */

