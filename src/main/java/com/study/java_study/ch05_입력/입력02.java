package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name = null;     // next()
        int age = 0;            // nextInt()
        String address = null;  // nextLine()
        String gender = null;   // next()
        String phone = null;    // nextLine()

        /*
          이름: 김준일
          나이: 31
          주소: 부산 동래구 중앙대로
          성별: 남
          연락처: 010-9988-1916
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        name = sc.next();
        System.out.print("나이: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("주소: ");
        address = sc.nextLine();
        System.out.print("성별: ");
        gender = sc.next();
        sc.nextLine();
        System.out.print("연락처: ");
        phone = sc.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
        System.out.println("성별: " + gender);
        System.out.println("연락처: " + phone);

    }
}
