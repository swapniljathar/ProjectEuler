package ProjectEuler03;

/**
 * Created by Swapnil on 4/6/2016.
 */
public class ProjectEulerProblem03 {
    public static void main(String[] args) {

        long number = 600851475143L;

        int result = 0;

        for (int factor = 2; factor <= number ; factor++) {

            if (number % factor == 0){
                result = factor;
                number = number/factor;
                factor = 2;
            }
        }
        System.out.println(result);

    }
}
