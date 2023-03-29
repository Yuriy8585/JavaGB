/*Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
 которая состоит из чередующихся символов c1 и c2, начиная с c1.
6
a b
ababab */

package JavaLesson;
import java.util.Scanner;
public class NumberN {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        System.out.print("Введите первый символ: ");
        String firstChar = scan.next();
        System.out.print("Введите второй символ: ");
        String secondChar = scan.next();
        scan.close();
        System.out.println(str(number, firstChar, secondChar));
    }
    static String str(int number, String firstChar, String secondChar) {
        StringBuilder result = new StringBuilder();
        String twoChars = firstChar + secondChar;
        for (int i = 0; i < number/2; i++) 
            result.append(twoChars);
        return result.toString();
        
    }
}
