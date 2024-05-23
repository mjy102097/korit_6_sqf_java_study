package com.study.java_study.ch03_함수;

public class Function04 {
    // 오버로딩
    // 동일한 이름의 함수의 어떤 자료형을 가지고 있냐에 따라서
    // 호출하는 함수가 다르다
    // 매개변수의 개수가 다르거나 매개변수의 자료형이 달라야함
    // 자료형의 순서도 중요함
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
