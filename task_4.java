package labs.lab_4;
public class task_4 {
    public static void main(String[] args){
        int[] arr1 = {1,27,53,42,50,64,76,81,99,10,20,30,40,52,43,74,67};
        System.out.println(countNumOfEvenOddDigits(arr1));
    }

    static String countNumOfEvenOddDigits(int[] arr){ 
        int even=0,odd = 0;
        for (int i=0;i<arr.length;i++){ 
            if(i%2== 0){
                even++;
            }
            else{
               odd++;
            }
        }
        return "Even Digits are: "+even+"\nOdd Digits are: "+odd;
    }
}