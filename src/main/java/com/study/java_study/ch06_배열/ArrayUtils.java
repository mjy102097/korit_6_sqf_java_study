package com.study.java_study.ch06_배열;

public class ArrayUtils {

    // 조회, 삭제 등 할 때마다 찾는 부분이 반복되니까 참조 할수 있게 만듬
    int findIndexByName(String[] names, String name) {
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(name)){
                return i;
            }
        }
        return -1;
    }
}
