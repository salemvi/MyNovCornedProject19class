package JavaRush_17and18Level;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class practice_19_1802 {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Иванов", 22),
                new Student("Петров", 18),
                new Student("Сидоров", 19)
        );

        Collections.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
 class AgeComparator implements Comparator<Student>{
    //напишите тут ваш код
     public int compare(Student s1, Student s2){
         return s2.getAge() - s1.getAge();
     }


}
 class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент - " + name +
                ", возраст - " + age +
                '.';
    }
}
