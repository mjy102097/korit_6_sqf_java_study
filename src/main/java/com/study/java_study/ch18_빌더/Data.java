package com.study.java_study.ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Data {

    private String data1;
    private int data2;
    private double data3;
    private String data4;

//    public Data(String data1) {
//        this.data1 = data1;
//    }
//
//    public Data(int data2) {
//        this.data2 = data2;
//    }
//
//    public Data(double data3) {
//        this.data3 = data3;
//    }
//
//    public Data(String data4) {   // 데이터 오버로딩은 변수명을 보고 판단하는게 아니라
//        this.data4 = data4;       // 데이터 자료형을 보고 판단하기 때문에 data1이 이미 String 이기 때문에
//    }                             // data4는 만들수 없음
}
