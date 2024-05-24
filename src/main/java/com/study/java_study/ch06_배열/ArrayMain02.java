package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // "김준일" => 999(주소)
        String a = "김준일";               // 999
        String b = new String("김준일");   // 200 -> 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] names2 = {"김준일", new String("김준일")};

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]); // 같은 new String으로 새로 선언을 했기 때문에 주소값이 다름
        System.out.println(names == names2); // 이것도 new String[]으로 새로 선언을 했기 때문에 주소같이 다름

        int n = 10;

        n = n + 1;
        n++;
        n += 1;

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
        // System.out.println({"a", "b"}); 중괄호는 배열 선언 할때 사용 가능
    }
}
