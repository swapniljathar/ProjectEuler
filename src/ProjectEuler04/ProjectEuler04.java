package ProjectEuler04;

/**
 * Created by Swapnil on 4/6/2016.
 */
public class ProjectEuler04 {
    public static void main(String[] args){
        Problem04 problem = new Problem04();

        problem.largestPalindrome(10, 100);
        problem.largestPalindrome(100, 1000);
    }

    private static class Problem04 {
        public void largestPalindrome(int start, int end) {
            int palindrome = 0;

            for (int x = start; x < end; x++) {
                for (int y = start; y < end; y++) {
                    int value = x * y;

                    if (isPalindrome(value) && value > palindrome){
                        palindrome = value;
                    }

                }
            }
            System.out.println(palindrome);
        }

        private boolean isPalindrome(int num) {
            StringBuffer sb = new StringBuffer(Integer.toString(num));
            return Integer.toString(num).equalsIgnoreCase(sb.reverse().toString());
        }
    }
}
