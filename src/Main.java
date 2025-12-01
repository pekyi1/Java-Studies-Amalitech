import java.util.Arrays;

public class Main {
    //Finding the max value
//    public static int findMax(int[] arr){
//        int max = arr[0];
//
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
    //Doing a binary search using the array class in java
//    public static String reverseString(String input){
//        StringBuilder builder = new StringBuilder();
//        for(int i = input.length() -1; i>=0; i--){
//            builder.append(input.charAt(i));
//        }
//        return  builder.toString();
//    }


    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 5, 9, 11},
                {14, 20, 21, 26},
                {30, 34, 43, 50}
        };
        int[][] matrix2 = {
                {1, 5, 9, 11},
                {14, 20, 21, 26},
                {30, 34, 43, 50}
        };
        System.out.println(Arrays.deepToString(MatrixAddition.addMatrix(matrix1, matrix2)));

    }
}