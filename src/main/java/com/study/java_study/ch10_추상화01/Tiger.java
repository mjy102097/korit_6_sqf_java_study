package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal {
    private int power;

    public Tiger() {
        super(); // Animal객체 생성자 호출
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계에서만 가능(원래 같은 클래스에서는 같은 이름의 메소드는 만들수 없음)
    //                             -> 하지만 매게변수를 다르게 해서 만들순 있음 : 오버로딩
    @Override // @ : 어노테이션 -> @Override는 재정의 한 것을 티내려고 적는 것, Override는 따로 기능은 없음
    public void move() { // -> 업캐스팅을 해도 재정의 한 것이 출력 된다.
        System.out.println("호랑이가 두발로 뛰어갑니다.");
        super.move();
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 펀치를 날립니다.");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
