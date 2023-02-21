import java.util.Random;
import java.util.Stack;

public class WorkDayJob {
    public static Stack<Integer> pointsOfShoks() {
        Stack<Integer> points = new Stack<>();
        Random rm = new Random();
        int everyDayPoints = rm.nextInt(0, 30);
        for (int i = 0; i <= everyDayPoints; i++) {
            points.push(rm.nextInt(0, 6));
        }
        return points;
    }

    public static String messageOfPoint() {

        Stack<Integer> dangerousMessage = new Stack<>();
        Stack<Integer> allPoints = pointsOfShoks();
        for (Integer listOfPoints : allPoints) {
            if (listOfPoints > 3) {
                dangerousMessage.push(listOfPoints);
            }
        }

        String alarm;
        if (dangerousMessage.size() >= 5) {
            alarm = "Караул, нас трясет";
            System.out.println(alarm);
        } else {
            alarm = "";
        }
        return alarm;

    }
}
