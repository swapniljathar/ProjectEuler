package ProjectEulerProblem04;

/**
 * Created by Swapnil on 4/6/2016.
 */
public class ProjectEuler04 {

    public static void main(String[] args){
        ProjectEuler04 problem = new ProjectEuler04();

        problem.largestPalindrome(10,100);
        problem.largestPalindrome(100,1000);
    }

    private void largestPalindrome(int start, int end) {
        int palindrome = 0;

        for (int i = start; i < end; i++){
            for (int j = start; i < end; j++){
                int value = i * j ;

                if (isPalindrome(value) && value > palindrome){
                    palindrome = value;
                }
            }
        }
    }

    private boolean isPalindrome(int num) {
        StringBuffer sb = new StringBuffer(Integer.toString(num));
        return Integer.toString(num).equalsIgnoreCase(sb.reverse().toString());
    }
}
