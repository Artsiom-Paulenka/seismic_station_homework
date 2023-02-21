import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int message = sc.nextInt();

        String result;
        if (message == -97) {
            result = WorkDayJob.messageOfPoint();
        } else {
            result = "";
        }
        System.out.println(result);
    }
}
