package com.study.java_study.ch04_제어;

public class CaURingStar {
    public static void main(String[] args) {
        /*

        *
        **
        ***
        ****
        *****

         */


        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        /*

         *****
         ****
         ***
         **
         *

         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*

             *
            **
           ***
          ****
         *****

         */


        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 -1 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*
        *****
         ****
          ***
           **
            *
         */
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*

            *       1
           ***      3
          *****     5
         *******    7
        *********   9

         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - (i + 1); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            for(int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (4 - i); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
