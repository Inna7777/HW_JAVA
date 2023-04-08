public class Task2_0 {
            public static void main(String[] args) {
            String jewels = "aB";
            String stones = "aaaAbbbB";
            System.out.println(fildJewelsInStones(jewels,stones));
        }
    
        public static String fildJewelsInStones(String jewels, String stones) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jewels.length(); i++) {
                int count =0;
                for (int j = 0; j < stones.length(); j++) {
                    if (jewels.charAt(i) == stones.charAt(j)) {
                        count ++;
                    }
                }
            sb.append(jewels.charAt(i)).append(count);
            }
            return sb.toString();
            }
    
        }
     
        

