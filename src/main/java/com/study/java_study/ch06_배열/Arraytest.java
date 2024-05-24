package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class Arraytest {
    public static void main(String[] args) {
        // ArrayService 4. 이름찾기 부분 이해 하기 위해 만듬
        // forEach -> for(String c : a) -> 문자열 c를 만들어 a를 집어 넣음
        // 그러고 조건에
        // if(c.equals(b)) 를 사용하여 문자열 c를 차례로 b를 대입해서 탐색
        Scanner scanner = new Scanner(System.in);
        String[] a = {"a", "b", "c"};
        String result = null;
        System.out.print("찾을 문자 입력: ");
        String b = scanner.nextLine();
        for(String c : a) {
            if(c.equals(b)) {
                result = c;
                System.out.println(result);
                break;
            }
            break;
        }

    }
}
