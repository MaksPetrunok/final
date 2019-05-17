import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    /**
     *     Task
     * ==============
     * 11. Система Автопарк. В систему могут зайти Водители и
     * Администраторы. В Автопарке есть автобусы, маршруты. Администратор
     * может назначать на Маршруты свободные автобусы, в автобусы свободных
     * Водителей, а также освобождать их, делая свободными. Водитель может
     * увидеть свое место работы, а также он должен подтвердить свое новое
     * Назначение.
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);

        long count = list
                .stream()
                .filter(x -> x > 5)
                .count();

        System.out.println(count);
    }
}

interface IntPred {
    boolean test(Integer value);
}



