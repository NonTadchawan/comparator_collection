package org.example;

public class Student {
    Integer age;

    public Student(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                '}';
    }

}
