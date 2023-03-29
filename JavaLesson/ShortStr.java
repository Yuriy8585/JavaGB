
/* Напишите метод, который сжимает строку. 


Пример: вход aaaabbbcddaaa.
a4b3cd2a3*/

package JavaLesson;
import java.util.Scanner;
public class ShortStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scan.next();
        scan.close();
        System.out.println(shortStr(str));
    }
    static String shortStr(String str) {
        if (str.length() < 2)
            return str;
        StringBuilder result = new StringBuilder();
        int count = 1;
        char [] charArray = str.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i-1]) {
                count+=1;
            } else {
                
                if (count != 1) {
                    result.append(count);
                }
                result.append(charArray[i-1]);
                count = 1;
                
            }
        }
        result.append(charArray[charArray.length-1]);
        if (count != 1) {
            result.append(count);
        }
        return result.toString();
    }
}
