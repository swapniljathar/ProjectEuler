package ProblemTwo;

/**
 * Created by Swapnil on 3/31/2016.
 */
public class ProblemTwo {
    public static void main(String[] args){
        long fib1 = 0;
        long fib2 = 1;
        long result = fib1 + fib2;
        long sum = 0;

        while (result <= 4000000){
            if (result % 2 == 0 ){
                sum += result;
            }

            fib1 = fib2;
            fib2 = result;
            result = fib1 + fib2;

        }
        System.out.println(sum);
    }
}






