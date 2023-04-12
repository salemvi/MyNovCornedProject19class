package JavaRush_17and18Level;

import java.util.ArrayList;
import java.util.Collections;

public class task_1807 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));

        }
    }
}
