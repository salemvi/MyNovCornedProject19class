package JavaRush_17and18Level;

import java.util.ArrayList;
import java.util.Collections;

public class task_1810 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }
    public static String[] toStringArray(ArrayList<String> strings) {
        //напишите тут ваш код
        return (String[]) strings.toArray(String[]::new);
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        //напишите тут ваш код
        return (Integer[]) integers.toArray(Integer[]::new);
    }
}
