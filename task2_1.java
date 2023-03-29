// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”




public class task2_1 {
    public static void main(String[] args) {
        String s = "cbaj";
        int[] index = {3,4,1,2};
        String n =(shuffle(s, index));
        System.out.println(n);
    }



    public static String shuffle(final String s, final int[] index){
        char[] chars = new char[s.length()];
    for(int i = 0; i < s.length(); i++){
        chars[index[i]-1] = s.charAt(i);
       
    }
    return new String(chars);
} 

}