package JavaRush_17and18Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class anonim_inside_class {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        Collections.addAll(lists, "Hello", "how", "are", "you?");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Collections.sort(lists, comparator);
        System.out.println(lists);
    }
}







