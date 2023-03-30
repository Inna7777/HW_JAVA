import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество рецептов в книге: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] resepts = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите рецепт " + (i + 1) + ": ");
            resepts[i] = scanner.nextLine();
        }
        System.out.print("Количество строчек заменяемых продуктов: ");
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] product = new String[m];
        String[] replacements = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.printf("Заменяемые продукты" + (i + 1) + ": ");
            String[] line = scanner.nextLine().split(" - ");
            product[i] = line[0];
            replacements[i] = line[1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resepts[i] = resepts[i].replaceAll("\\b" + product[j] + "\\b", replacements[j]);
                resepts[i] = resepts[i].replaceAll("\\b" + product[j].substring(0, 1).toUpperCase() + product[j].substring(1) + "\\b", replacements[j].substring(0, 1).toUpperCase() + replacements[j].substring(1));
            }
            System.out.println(resepts[i]);
        }
    }
}