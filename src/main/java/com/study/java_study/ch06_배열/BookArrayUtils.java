package com.study.java_study.ch06_배열;

public class BookArrayUtils {

    int findBookIndex(String[] bookArray, String bookName) {
        for(int i = 0; i < bookArray.length; i++) {
            if(bookArray[i].equals(bookName)) {
                return i;
            }
        }
        return -1;
    }

}
