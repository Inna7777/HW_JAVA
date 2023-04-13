// Пусть дан список сотрудников:
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//  Отсортировать по убыванию популярности.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task5_2 {
    public static void main(String[] args) {
        String[] list1 = new String[] {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Лыков", "Павел Чернов"};
        ArrayList<String> listName = getName(list1);// Из массива строковых создаем список методом getName
        Map<String, Integer> mapName =  getMap(listName); //Методом getMap переводим список в список Map в котором объекты хранятся в паре "ключ - значение"
        System.out.println("Повторяющиеся имена и количество повторений: ");
        nameRepeat(mapName);
        System.out.println("Имена, отсортированные по убыванию популярности: ");
        sortName(mapName);
    }
    public static ArrayList<String> getName(String [] list){
        ArrayList<String> listName = new ArrayList<>();
        for (String el : list) {
            String [] elList = el.split(" ");
            listName.add(elList[0]);
        }
        return listName;
    }
    public static Map<String, Integer> getMap(ArrayList<String> name) {
        Map<String, Integer> mapName = new HashMap<>();
        for (int i = 0; i < name.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < name.size(); j++){
                if (name.get(i).equals(name.get(j))) count += 1;
            }
            if (mapName.containsKey(name.get(i)) == false) mapName.put(name.get(i), count);
        }
        return mapName;
    }
    //Поиск повторяющихся имен (Имя-ключ)
    public static void nameRepeat(Map<String, Integer> map){
        for(var i: map.entrySet()){
            if (i.getValue() > 1) 
            System.out.printf("%s: %d \n", i.getKey(), i.getValue());
        }
    }
    public static void sortName(Map<String, Integer> map){
        ArrayList<Integer> listCount = new ArrayList<>();
        for(var item: map.entrySet()) {
            if (listCount.contains(item.getValue()) == false) listCount.add(item.getValue());
        }
        listCount.sort(null);
        for (int i = listCount.size()-1; i > -1; i--){
            for (var item: map.entrySet()){
                if (listCount.get(i) == item.getValue()) 
                System.out.printf("%s : %d \n", item.getKey(), item.getValue());
            }
        }
}
}
