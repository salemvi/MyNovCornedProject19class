package JavaRush_17and18Level;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

public class practice_forEach1 {
    public static void main(String[] args) {
        arrayL();
        arrayLAccept();

    }
    public static void arrayL(){
        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, "Hi!", "How are you?");
        arrayList1.forEach( s -> System.out.println(s));
    }
    public static void arrayLAccept(){
       ArrayList<String> arrayList2 = new ArrayList<>();
       Collections.addAll(arrayList2, "Hello", "you here?");
       arrayList2.forEach(new Consumer<String>(){
           public void accept(String s){
                System.out.println(s);
            }
        });
    }
}
