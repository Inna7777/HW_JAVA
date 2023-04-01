// Реализовать алгоритм сортировки слиянием и выборкой.
public class Task3_1 {
    public static void main(String[] args) {
        int [] arr = {1, 9, 4, 6, 5, 3, 1, 8 };
        int [] arr2 = {10, 9, -1, 6, 54, 28, 1,-8 };
        mergeSort(arr);
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        choice(arr2);
        for(int i = 0; i <arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

    }
    private static void mergeSort(int [] arr){
        int n = arr.length;
        if(n ==1) return;

        int mid = n / 2;
        int[] left = new int [mid];
        int[] ragth = new int [n - mid];

        for(int i = 0; i < mid; i++){
            left[i]= arr[i];
        }
        for(int i = mid; i < n; i++){
            ragth[i-mid]= arr[i];
        }
        mergeSort(left);
        mergeSort(ragth);
        merge(arr, left, ragth);
    }
    private static void merge(int [] arr, int [] left, int [] ragth){
        int left_new = left.length;
        int ragth_new = ragth.length;
        int i = 0;
        int j = 0;
        int k =0;

        while(i < left_new && j < ragth_new ){
            if(left[i] < ragth[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else{
                arr[k] = ragth[j];
                j++;
                k++;
            }
        }
    for(int ll = i; ll < left_new; ll++){
        arr[k++] = left[ll];
    }
    for(int rr = j; rr < ragth_new; rr++){
        arr[k++] = ragth[rr];
    }
    }
    private static void choice(int [] arr){
        int l = arr.length; //число элементов в списке
        for(int i = 0; i<l; i++){
            int min = arr[i];
            int im = i;//индекс минимального
            for(int j = i+1; j <l; j++){
                if (min > arr[j]) {
                    min = arr[j];
                    im = j;
                }
            if(im != i){   //меняем местами элементы
                int t = arr[i];
                arr[i] = arr[im];
                arr[im] = t;
            }
        
            }
        }
    }
}
    

