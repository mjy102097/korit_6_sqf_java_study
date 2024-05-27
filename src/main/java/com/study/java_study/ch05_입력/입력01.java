package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        /*
            next() 메소드 특징
            1. 값을 입력 받을 때 공백(스페이스바)과 줄바꿈(엔터)는 무시한다.
            2. 버퍼를 사용한다.
            3. 값을 입력 후 공백과 줄바꿈은 버퍼에 저장이됨
            4. nextLint() 만 공백과 줄바꿈을 무시 하지 않는다.
         */
        String a = scanner.next();
        System.out.println("에이 : " + a);

        System.out.print("b : ");
        String b = scanner.nextLine();
        System.out.println("비 : " + b);

    }
}
