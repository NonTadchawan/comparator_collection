package org.example;

import java.util.*;
public class App
{
    public static void main( String[] args ) {
        List<Student> list = new ArrayList<>();
        List<Student> students = List.of(new Student(12), new Student(14),new Student(10), new Student(13));
        list.addAll(students);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age.compareTo(o2.age);
            }
        });
        System.out.println(list);
    }
}
