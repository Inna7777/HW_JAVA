// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task5_1 {
   
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 123456, bookPhone);
        addNumber("Иванов", 4561234, bookPhone);
        addNumber("Дроздов", 5464545, bookPhone);
        addNumber("Смирнов", 8950000, bookPhone);
        addNumber("Васечкин", 55556233, bookPhone);
        addNumber("Дроздов", 99987897, bookPhone);
        printPhone(bookPhone);
       }

//  Добавляем номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    //Печатаем список контактов
    
         public static void printPhone(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
        System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}