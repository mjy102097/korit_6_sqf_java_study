package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> ?

        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage();
        // 와일드 카드는 자료형이 Object 이기 때문에 다운캐스팅 해줘야함



        // 와일드 카드 제약(수용 할수있는 범위)
        Message<? extends String> m3 = new Message<>("10"); // 하행
        // 자료형이 자기 자신이거나 자기를 상속 받은것만 사용 가능

        Message<? super String> m4 = new Message<>(new Object()); // 상행
        // 나 자신으로부터 부모는 되는데 형제는 안됨

        String s2 = m3.getMessage();

    }
}
