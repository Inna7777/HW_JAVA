//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
    // result [6,6,0,1]

    import java.util.ArrayDeque;
    import java.util.Arrays;
    import java.util.Deque;
    
    public class Task4_1 {
        public static void main(String[] args) {
            Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6,5,4,3,4,5,6));
    
            boolean res = true;
            for (int i = 0; i < deque.size() / 2; i ++) {
                int f = deque.pollFirst();
                int l = deque.pollLast();
                if (f != l) {
                    res = false;
                    break;
                }
            }
    
            System.out.println(res ? "Палиндром" : "Не палиндром");
        }    
    
        }