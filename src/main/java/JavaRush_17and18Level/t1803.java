package JavaRush_17and18Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class t1803 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела");
        System.out.println(list);
        Comparator<String> comparator = (String o1, String o2) ->{
            return o1.length() - o2.length();
        };
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}

