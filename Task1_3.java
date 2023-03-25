// Реализовать простой калькулятор (+,-,=,*), только с целыми числами

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        double a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        double b = iScanner.nextInt();
        System.out.printf("Введите математическое действие +, -, *, /: ");
        char c = iScanner.next().charAt(0);
        if (c == '+') {
            a += b;
        } else if (c == '-') {
            a -= b;
        } else if (c == '*') {
            a *= b;
        } else if (c == '/') {
            a /= b;
        } else {
            System.out.println("Некорректный символ операции");
        }
         System.out.println("Результат:"+a);
         iScanner.close();
} 
}
