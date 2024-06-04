package com.study.java_study.ch18_빌더;

public class Main {

    public static void main(String[] args) {
        // 내부 클래스

        // 내부 클래스인 B가 static이 아닌 경우 호출 방법
        A a = new A();
        A.B b = a.new B();

        a.test();
        b.print();

        // 내부 클래스인 C가 static이지만 메소드 show()는 static이 아닐때
        A.C c = new A.C();
        c.show();

        // 내부 클래스인 C와 메소드 show() 둘다 static 일때
        A.C.show2();
    }
}
