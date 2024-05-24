package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class Whiletest {
    public static void main(String[] args) {
        //System.out.println("[메인 메뉴]");
        //System.out.println("1. 회원 등록");
        //System.out.println("2. 회원 조회");
            //System.out.println("[회원조회]");
            //System.out.println("1. 회원 번호로 조회");
            //System.out.println("2. 회원 이름으로 조회");
            //System.out.println("b. 뒤로가기");
            //System.out.println("q. 프로그램 종료");
            //System.out.print("메뉴 선택: ");
        //System.out.println("3. 회원 탈퇴");
        //System.out.println("q. 프로그램 종료");
        Scanner sc = new Scanner(System.in);

        boolean isRun1 = true;

        while(isRun1) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택: ");
            String menuSelect = sc.nextLine();

            switch(menuSelect) {
                case "1":
                    System.out.println("[회원 등록]");
                    break;
                case "2":
                    System.out.println("[회원 조회]");
                    boolean isRun2 = true;
                    while(isRun2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");
                        System.out.print("메뉴 선택: ");
                        menuSelect = sc.nextLine();
                        switch(menuSelect) {
                            case "1":
                                System.out.println("회원 번호로 조회 하겠습니다.");
                                System.out.println("회원 번호: ");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회 하겠습니다.");
                                System.out.println("회원 이름: ");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아가겠습니다.");
                                isRun2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료하겠습니다.");
                                isRun1 = false;
                                isRun2 = false;
                                break;
                            default:
                                System.out.println("잘못 입력 하셨습니다. 다시 입력 바랍니다.");
                                break;
                        }
                        System.out.println();

                    }

                    break;
                case "3":
                    System.out.println("[회원 탈퇴]");
                    break;
                case "q":
                    System.out.println("[프로그램 종료]");
                    isRun1 = false;
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다. 다시 입력 바랍니다.");
                    break;
            }
            System.out.println();
        }
    }
}
