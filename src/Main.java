import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(6);
        integerList.add(5);
        integerList.add(8);
        integerList.add(5);
        integerList.add(10);
        integerList.add(5);

        Predicate<Integer> pred = number -> number % 2 != 0;
        integerList.removeIf(pred);

        for (Integer i : integerList) {

            System.out.println(i);

        }





    }
}