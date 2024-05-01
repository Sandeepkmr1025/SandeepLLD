package Comparisions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20, "Vishal", 70 ));
        students.add(new Student(30, "Krishna", 90 ));
        students.add(new Student(27, "Samir", 100 ));

        System.out.println("Before sorting: "+students);

        Collections.sort(students);

        System.out.println("After sorting: "+students);

        Collections.sort(students, new PspComparator());
        System.out.println("After psp comparator sorting: "+students);

        Collections.sort(students, (a,b)->a.name.compareTo(b.name));
        //students.sort((a, b) -> a.name.compareTo(b.name));
        //Collections.sort(students, Comparator.comparing(a -> a.name));
        System.out.println("After name comparator sorting: "+students);
    }
}
