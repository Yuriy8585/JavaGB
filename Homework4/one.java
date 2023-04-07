package Homework4;
/* Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список. */
import java.util.Random;
import java.util.LinkedList;

public class one {
    
    public static void main(String[] args) { 
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(10));
        } 
        System.out.println(linkedList);
            
        LinkedList<Integer> reversedList = new LinkedList<Integer>();
        
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            reversedList.add(linkedList.get(i));
        }
        System.out.println(reversedList); 

    }
}

 

    
    
           


