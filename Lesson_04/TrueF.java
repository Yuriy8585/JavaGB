package Lesson_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*Написать программу, определяющую правильность расстановки скобок в выражении.

Пример 1: a+(d*3) - истина

Пример 2: [a+(1*3) - ложь

Пример 3: [6+(]3*3) - ложь

Пример 4: {a}[+]{(d*3)} - истина

Пример 5: <{a}+{(d*3)}> - истина

Пример 6: {a+]}{(d*3)} - ложь */
public class TrueF {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите выражение для проверки: ");
            String expression = input.nextLine();
            
            if (checkBrackets(expression)) {
                System.out.println("Скобки в выражении расставлены правильно.");
            } else {
                System.out.println("Скобки в выражении расставлены неправильно.");
            }
        }
    }
    
    public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{' || ch == '<') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}' || ch == '>') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') || (ch == ']' && top != '[')
                            || (ch == '}' && top != '{') || (ch == '>' && top != '<')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}

