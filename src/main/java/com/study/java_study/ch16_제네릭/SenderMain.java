package com.study.java_study.ch16_제네릭;

public class SenderMain {
    public static void main(String[] args) {

        // 제네릭을 쓸땐 기존에 쓰던 int double 이런건 못쓰고
        // 밑에 자료형 예시인 Wrapper 자료형을 사용해야함
        // Wrapper 자료형
        // Integer                   int
        // Boolean   --(언박싱)-->    boolean
        // Character                 char
        // Double    <--(박싱)--      double
        // Long                      long
        // Float                     float



        Integer num = new Integer(10); // 박싱
        int num2 = num.intValue(); // 언박싱

        Integer num3 = 20; // 자동 박싱
        int num4 = num3; // 자동 언박싱 / 자바에서는 자동으로 박싱 언박싱 해줌

        Sender<Integer, String, Double> sender1 = new Sender<>(10, "20", 30.0);

        System.out.println(sender1);
    }
}
