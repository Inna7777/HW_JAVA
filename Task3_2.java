//Пусть дан произвольный список целых чисел,
// удалить из него чётные числа
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Task3_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(getSort(list));    
    } 
    public static List<Integer> getSort(List<Integer> list){
        List<Integer> SortedList = new ArrayList<>();   
            for (Integer i: list) {
                if (i % 2 != 0){
                    SortedList.add(i);
                }
            
            }
         return SortedList;      
        }
    }
    
