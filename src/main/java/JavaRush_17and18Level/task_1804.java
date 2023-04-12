package JavaRush_17and18Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class task_1804 {
    public static void main(String[] args) {

        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);
        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
    public static void sortNumbers(ArrayList<Integer> numbers) {
        Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
            return o1 - o2;
        };
        Collections.sort(numbers, comparator);
    }
}