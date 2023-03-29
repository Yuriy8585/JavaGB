/*Напишите метод, который принимает на вход строку (String) и 
определяет является ли строка палиндромом (возвращает boolean значение). */

package JavaLesson;
import java.util.Scanner;
public class Palendrom {
    public static void main(String[] args) {
        System.out.println(isPalendrom("aaaabbbcddaaa"));
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        System.out.println(isPalendrom(str) ? "Да" : "Нет");
    }
    static boolean isPalendrom(String str){
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) 
            if (charArray[i] != charArray[charArray.length-1-i]) 
                return false;
            
        return true;
        }
    
}
