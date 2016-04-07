package ProjectEulerProblem05;

/**
 * Created by Swapnil on 4/6/2016.
 */
public class ProjectEuler05 {
    public static void main(String[] args){
       int num = 2521;
        while (!divisible(num,1,20)){
            num++;
        }
        System.out.println(num);
    }
    private static boolean divisible(int num, int min, int max) {
        for (int i = min; i < max; i++) {
            if (num % i != 0)
                return false;
        }
        return true;
    }
}
