package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");
        String name = "김준일";     // 값의 자료형 String
        String phone = "0109988";  // 값의 자료형 null

        StringUtils stringUtils = new StringUtils();

        /* if (text == null || text == "") {  // ==은 두개의 값을 비교하는게 아니라
                                              // 두개의 주소값을 비교하는 것임
              System.out.println("text이 비어있습니다.");
           }                                                      */

        if (stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return; // -> 함수의 자료형이 void일 때 return 값없이 사용 가능
        }           // 참이여서 리턴이 실행 되면 밑에 껀 실행 하지 않고 끝남

        if (stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }
        if (stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return;
        }

    }
}
