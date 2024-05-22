package com.study.java_study.ch02_클래스01;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10;
        // Class(참조자료형) -> 대문자로 시작
        ObjectA objectA1 = new ObjectA(); //100번
        ObjectA objectA2 = new ObjectA(); //200번

        System.out.println(a);
        System.out.println(objectA1); // 값은 지정하지 않았기 때문에
        System.out.println(objectA2); // 타고 들어간 주소가 출력됨

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name);
    }
}