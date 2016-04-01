package ProblemTwo;

/**
 * Created by Swapnil on 3/31/2016.
 */
public class ProblemTwo {
    public static void main(String[] args){
        int previous = 2;
        int current = 3;
        int next = 5;
        int answer = 2;

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
