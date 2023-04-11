package JavaRush_17and18Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class task_1805 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {

        Collections.sort(strings, new StringComparator());
    }
}
class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }
}

