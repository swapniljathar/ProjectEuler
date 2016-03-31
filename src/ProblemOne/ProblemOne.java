package ProblemOne;

/**
 * Created by Swapnil on 3/31/2016.
 */
public class ProblemOne {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        while ( i < 1000){
            if (i % 3 == 0 || i % 5 == 0 ){
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum is: " +sum);
    }
}
