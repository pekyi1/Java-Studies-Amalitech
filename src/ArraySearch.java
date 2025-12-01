public class ArraySearch {

    public static boolean arraySearch(int[][] mat, int number){
        for(int i = 0; i< mat.length; i++){
            for(int j = 0; j< mat[i].length; j++){
                if(mat[i][j] == number){
                    return true;
                }
            }
        };
        return false;
    }
}
