package com.study.java_study.ch04_제어;

public class 스위치 {
    public static void main(String[] args) {
        String grade = "C";
        switch (grade) {
            case "A":
                System.out.println("A등급");
            case "B":
                System.out.println("B등급");
            case "C" : // case에 동일한것을 찾아 거기부터 아래쪽 모두 실행
                System.out.println("C등급");
                break; // C만 출력하려면 break를 사용하여 멈춰야함
            case "D" :
                System.out.println("D등급");
            default:
                System.out.println("F등급");
        }
    }
}
