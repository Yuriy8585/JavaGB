/*Создайте Hashset, заполните его числами {1,2,300,4,500,6,3} распечатайте данное содержимое */

package Lesson_04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExHash {
    public static void main(String[] args) {
        HashSet<Integer> mySetlist = new HashSet<>(Arrays.asList(1,2,300,4,500,6,3));
        LinkedHashSet<Integer> mySetlist2 = new LinkedHashSet<>(Arrays.asList(1,2,300,4,500,6,3));
        TreeSet<Integer> mySetlist3 = new TreeSet<>(Arrays.asList(1,2,300,4,500,6,3));
        System.out.printf("HashSet %s \n", mySetlist);
        System.out.printf("LinkedHashSet %s \n", mySetlist2);
        System.out.printf("TreeSet %s \n", mySetlist3);
        
    }
}
