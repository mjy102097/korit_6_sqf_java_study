package com.study.java_study.ch14_Object;

/*
    Object 클래스(최상위 클래스)

 */

import javax.crypto.spec.PSource;
import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("김준일", 31);
        Student student2 = new Student("김준일", 31);

        Object[] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("김준일", 31);

        System.out.println(student);
        String str = "데이터"; // -> new String("데이터") 원래는 이런 형식임
        System.out.println(str.toString()); // toString()은 생략 가능

        String studentData = student.toString(); // 그냥 student는 주소값이고 .toStrint()을 붙히면 String 값이다.

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(Objects.hash("김준일"));
        System.out.println(Objects.hash("김준일"));


    }
}
