package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance; // 자기 자신의 인스턴스를 만들어서

    private StudentRepository() {
        names = new String[5];
    }

    public static StudentRepository getInstance() { // 자기 자신의 메소드에도 자료형을 자기 자신으로 해둠
        if(instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }
    public void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}
