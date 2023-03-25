// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. 
// Выведите на экран результат умножения построчно.
// Sample Input:

// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите количество чисел: ");
        int size = iScanner.nextInt();
        
        int[] arr = new int[size];

        for (int i = 0; i < size; i ++) {
            System.out.printf("Число #"+(i + 1)+": ");
            arr[i] = iScanner.nextInt();
        }
        System.out.printf("Введите чиcло для умножения: ");
        int b = iScanner.nextInt();

        for (int i = 0; i < size; i ++) {
            arr[i] *=b;
            System.out.println(arr[i]) ;
        }
        iScanner.close();
    }
}