package ProjectEulerProblem06;

/**
 * Created by Swapnil on 4/7/2016.
 */
public class ProjectEuler06 {
    public static void main(String[] args) {
        ProjectEuler06 problem = new ProjectEuler06();
        problem.solve(10);
        problem.solve(100);
    }

    private void solve(int end) {
        System.out.println(squareOfSums(end) - sumOfSquare(end));
    }

    private long sumOfSquare(int end) {
        int solution = 0;
        for (int i = 1; i <= end ; i++) {
            solution += i * i;
        }
        return solution;
    }
    private long squareOfSums(int end) {
        int solution = 0 ;
        for (int i = 1; i <= end ; i++) {
            solution += i;
        }
        return solution * solution;
    }
}
