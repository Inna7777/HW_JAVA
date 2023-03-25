// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
// Затем вводятся 2 числа из этого диапазона.
//  Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        int size = 100;
        double[] arr = new double[size];
        
        for (int i = 0; i < size; i ++) {
            arr[i] = Math.pow(i, 3);
            System.out.println(arr[i]+" ") ;
          
         
        }
        System.out.printf("Введите число: ");
        double a = iScanner.nextInt();
         a = Math.pow(a, 3);

        for (int i = 0; i < size; i ++) {
            if (a == arr[i])
                System.out.println("Куб числа: "+arr[i]);
        }        
        iScanner.close();
    } 
}


    
