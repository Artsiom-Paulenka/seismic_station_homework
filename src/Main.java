import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int message = sc.nextInt();
        WorkDay firstWorkDay = new WorkDay();
        //Stack<Integer> stackOfMessage = new Stack<>();
        firstWorkDay.message(message);
    }
}
