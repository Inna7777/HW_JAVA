import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
 
public class Laptop {
  private String brand;
  private String model;
  private int ram;
  private int hdd;
  private String os;
  private String color;
  private double price;
  
  // конструкторы, геттеры, сеттеры
  
  public boolean matches(Map<String, Object> filters) {
      if (filters == null || filters.isEmpty()) {
          return true;
      }
      if (filters.containsKey("ram") && this.ram < (int) filters.get("ram")) {
          return false;
      }
      if (filters.containsKey("hdd") && this.hdd < (int) filters.get("hdd")) {
          return false;
      }
      if (filters.containsKey("os") && !this.os.equalsIgnoreCase((String) filters.get("os"))) {
          return false;
      }
      if (filters.containsKey("color") && !this.color.equalsIgnoreCase((String) filters.get("color"))) {
          return false;
      }
      
      return true;
  }
}



 
Set<Laptop> laptops = new HashSet<>();
laptops.add(new Laptop("Acer", "Aspire 5", 8, 512, "Windows 10", "серый", 39999.0));
laptops.add(new Laptop("Apple", "MacBook Pro", 16, 256, "macOS", "серебристый", 129999.0));




 
// Для критериев фильтрации :
 
Scanner scanner = new Scanner(System.in);
Map<String, Object> filter = new HashMap<>();
System.out.println("Введите номер критерия фильтрации:");
System.out.println("1 - ОЗУ");
System.out.println("2 - Объём ЖД");
System.out.println("3 - Операционная система");
System.out.println("4 - Цвет");
int criter = scanner.nextInt();
if (criteria == 1) {
  System.out.println("Введите минимальный объем ОЗУ:");
  int ram = scanner.nextInt();
  filter.put("ram", ram);
} else if (criteria == 2) {
  System.out.println("Введите минимальный объем ЖД:");
  int hdd = scanner.nextInt();
  filter.put("hdd", hdd);
} else if (criteria == 3) {
  System.out.println("Введите операционную систему:");
  String os = scanner.next();
  filter.put("os", os);
} else if (criteria == 4) {
  System.out.println("Введите цвет:");
  String color = scanner.next();
  filter.put("color", color);
}


 
// отфильтровать множество ноутбуков и вывести результаты:
 
Set<Laptop> filteredLaptop = new HashSet<>();
for (Laptop lap : laptops) {
  if (lap.matches(filter)) {
      filteredLaptop.add(lap);
  }
}
System.out.println("Найдено " + filteredLaptops.size() + " ноутбуков:");
for (Laptop laptop : filteredLaptops) {
   System.out.println(lap.getBrand() + " " + lap.getModel() + " - " + lap.getPrice());
}
 
private String getBrand() {
  return brand;
}
 
private String getModel() {
  return model;
}
 
private double getPrice() {
  return price;
}
