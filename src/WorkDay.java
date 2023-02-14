import java.util.Stack;

public class WorkDay {


    //Вы работаете на станции слежения за подземными толчками.
    // Толчки магнитудой до 3 пунктов вас не интересуют. Ваш рабочий день заканчивается,
    // когда со станции управления приходит сигнал - число -97.
    //Вам необходимо понять, было ли за время вашего дежурства что-то странное.
    // Если за время вашего дежурства было зафиксировано не менее 5 толчков сильнее 3 пунктов -
    // их нужно написать в консоль и сообщить о возможном землетрясении. Иначе не писать ничего

    int point;

    private Stack<Integer> stackOfMessage = new Stack<>();

    public Stack<Integer> getStackOfMessage() {
        return stackOfMessage;
    }

    public void setStackOfMessage(Stack<Integer> stackOfMessage) {
        this.stackOfMessage = stackOfMessage;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void message(int point) {

        if (point > 3) {
            stackOfMessage.push(point);
            if (stackOfMessage.size() > 5) {
                System.out.println(stackOfMessage);
            }
        } else if (point == -97) {
            System.out.println("Работа окончена");
            ;
        }
    }
}




