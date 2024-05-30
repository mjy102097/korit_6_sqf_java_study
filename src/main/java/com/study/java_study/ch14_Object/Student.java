package com.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {

    private String name;                            // 변수 정리
    private int age;

    public Student(String name, int age) {          // 생성자
        this.name = name;
        this.age = age;
    }

                                                    // getter, setter

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {                           // equals
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student)obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {                         // hashCode
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {                      // toString
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
