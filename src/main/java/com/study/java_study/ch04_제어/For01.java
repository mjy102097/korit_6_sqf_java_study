package com.study.java_study.ch04_제어;

public class For01 {
    public static void main(String[] args) {
        // for 반복문 : 횟수 증가하며 반복할 때 사용
        // while 반복문 : 특정 조건을 만족할 때까지 반복 할 때 사용
        for(int i = 0; i < 10000; i++) { // for(초기문(1); 조건문(2,5); 후처리(4,7)) {
            System.out.println(i + 1);   //     실행문(3,6); }
        }

        for(int i = 0; i < 10000; i++) { // 10000에서 1까지 출력
            System.out.println(10000 - i);
        }
    }
}
