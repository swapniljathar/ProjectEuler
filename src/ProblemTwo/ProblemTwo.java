package ProblemTwo;

/**
 * Created by Swapnil on 3/31/2016.
 */
public class ProblemTwo {
    public static void main(String[] args){
        int previous = 0;
        int current = 1;
        int next = 2;
        int answer = 0;

        do {
            previous = current;
            current = next;
            next = previous + current;
             if (current % 2 == 0){
                 answer += current;
             }
        }while(answer < 4000000);

        System.out.println(answer);

    }
}
