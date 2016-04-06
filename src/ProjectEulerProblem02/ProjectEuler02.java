package ProjectEulerProblem02;

/**
 * Created by Swapnil on 3/31/2016.
 */
public class ProjectEuler02 {
    public static void main(String[] args) {
        long fib1 = 0;
        long fib2 = 1;
        long result = fib1 + fib2;
        long sum = 0;

        while (result <= 4000000) {
            fib1 = fib2;
            fib2 = result;
            result = fib1 + fib2;

            if (result % 2 == 0) {
                sum += result;
            }
        }
        System.out.println(sum);
    }
}






