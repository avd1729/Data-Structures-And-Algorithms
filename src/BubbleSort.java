import java.util.Arrays;

public class BubbleSort {
    // aka sinking sort or exchange sort
    public static void main(String[] args) {
        int[] arr = {2,6,3,1,8,9,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // in-place sort
    static void sort(int[] arr){
        // for each step , max item will come at the last respective index.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
