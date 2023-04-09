import java.util.Deque;
import java.util.LinkedList;

//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false


public class Task4_3 {
    public static boolean isValid(String b) {
        Deque<Character> bracket = new LinkedList<>();

        for(char c: b.toCharArray()){
            if (c =='(' || c =='[' || c =='{'){
                bracket.push(c);
            }else if(c==')' && !bracket.isEmpty() && bracket.peek()=='('){
                bracket.pop();
            }else if(c==']' && !bracket.isEmpty() && bracket.peek()=='['){
                bracket.pop();
            }else if(c=='}' && !bracket.isEmpty() && bracket.peek()=='{'){
                bracket.pop();
            }else{
                return false;
            }
        }
        return bracket.isEmpty();
    }
    
    public static void main (String[] args) {
        String b1 = "()[]";
        String b2 = "()";
        String b3 = "{[()]}";
        String b4 = "()()";
        String b5 = ")(()(";
        
        System.out.println(isValid(b1)); // истинный
        System.out.println(isValid(b2)); // истинный
        System.out.println(isValid(b3)); // истинный
        System.out.println(isValid(b4)); // истинный
        System.out.println(isValid(b5)); // ЛОЖЬ
    }

    
}
    
    

