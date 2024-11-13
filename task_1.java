package labs.lab_4;
import java.util.Arrays;
public class task_1 {
    public static void main(String[] args) {
        int[] arr1= {3,2,1,0};
        int[] arr2= {7,6,5,4};
        swapElementsInArray(arr1, arr2);
        System.out.println("After swapping:\nArray 1: "+Arrays.toString(arr1)+"\nArray 2: "+ Arrays.toString(arr2));
    }
    static void swapElementsInArray(int[] arr1 ,int[]arr2){
        for(int i=0;i<arr1.length;i++){
            int temp = arr1[i];
            arr1[i] = arr2[i];  
            arr2[i] = temp;
        }
    }
}
