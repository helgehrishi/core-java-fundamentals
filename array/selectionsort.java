package array;

public class selectionsort {
    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };

        for(int i = 0; i<arr.length ;i++){
            int min = i;
            for(int j = i+1 ; j<arr.length ;j++){
                if(arr[i] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }

    }

}
