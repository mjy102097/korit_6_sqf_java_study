package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("a", 10, 10.5, "b");
        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(3.14);

        // 빌더 : 내가 넣고 싶은 변수에만 값을 넣는 법
        // 그러려면 빌더를 작성 해줘야 하는데
        // 하는 방법은 DataEntity 클래스 참고(직접 작성하는 방법)
        // DataEntity2 는 변수만 만들어주고 @Builder 선언해주면 끝임(DataEntity 와 같은 역할)
        DataEntity dataEntity = DataEntity.builder()
                .data1("a")
                .data2(10)
                .data4("b")
                .build();

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(20)
                .data3(3.14)
                .data4("b")
                .build();

    }
}
