package labs.lab_4; 
import java.util.Arrays;
public class task_2 {
    public static void main(String[] args) {
        int[] arr1 = {0,9,8,7,6};
        int[] arr2= {5,4,3,2,1};
        System.out.println("After merging:: "+Arrays.toString(mergeElementsInArray(arr1,arr2)));
    }
    static int[] mergeElementsInArray (int[] arr1, int[]arr2){
        int[] mergedArr= new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            mergedArr[i]=arr1[i];
        }
            for(int j=0;j<arr2.length; j++){
                mergedArr[arr1.length+j] = arr2[j];
            }
            return mergedArr;
    }
}