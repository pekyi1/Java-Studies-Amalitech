import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static int factorial(int n){
        if(n == 1){ //base case
            return 1;
        }

        return n * factorial(n-1);
    }


    //this is code for genetating parenthesis
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        make(result, "", 0, 0, n);
        return result;
    }

    // current = the string we are building
    // open = how many '(' used
    // close = how many ')' used
    private static void make(List<String> result, String current, int open, int close, int n) {

        // if the string is full (2*n characters)
        if (current.length() == n * 2) {
            result.add(current);
            result.add("\n");
            return;
        }


        // 1. Add '(' if possible
        if (open < n) {
            make(result, current + "(", open + 1, close, n);
        }

        // 2. Add ')' if it won't break the rules
        if (close < open) {
            make(result, current + ")", open, close + 1, n);
        }
    }

}
