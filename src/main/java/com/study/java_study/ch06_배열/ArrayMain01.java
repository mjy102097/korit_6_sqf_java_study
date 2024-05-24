package com.study.java_study.ch06_배열;

public class ArrayMain01 {
    public static void main(String[] args) {
        /*
            배열 특징
            1. 배열 안에 순서가 있다.
            2. 값에 중복을 허용한다.
            3. 배열의 공간의 크기는 늘리거나 줄일수 없다.
         */

        int[] nums = new int[100];

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

        for(int num : nums) { // forEach : nums에 들어 있는 값을 처음부터 끝까지 num에 순서대로 넣음
            System.out.println(num);
        }

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }
    }
}
