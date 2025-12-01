public class MatrixAddition {

    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< columns; j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }
}
