package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bookArray = new String[0];
        BookArrayUtils bookArrayUtils = new BookArrayUtils();

        boolean isRun = true;

        while(isRun) {
            // crud : create(생성) reade(조회) update(수정) delete(삭제)
            System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 도서등록");
            System.out.println("2. 도서조회");
            System.out.println("3. 도서수정");
            System.out.println("4. 도서삭제");
            System.out.println("5. 도서전체조회");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            String[] newbooks = null;
            int findIndex = -1;

            switch(selectedMenu) {
                case "1":
                    System.out.println("[도서등록]");

                    newbooks = new String[bookArray.length + 1];
                    for(int i = 0; i < (bookArray.length); i++) {
                        newbooks[i] = bookArray[i];
                    }
                    bookArray = newbooks;
                    System.out.print("등록할 도서 이름: ");
                    bookArray[bookArray.length -1] = scanner.nextLine();
                    System.out.println("도서 등록 완료");
                    break;
                case "2":
                    System.out.println("[도서조회]");
                    System.out.print("조회 할 도서이름: ");
                    String findBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findBookIndex(bookArray, findBook);
                    if(findIndex == -1) {
                        System.out.println("해당 도서는 등록 되어있지 않습니다.");
                        break;
                    }
                    System.out.println("해당 도서는 이미 등록되어 있습니다.");
                    break;
                case "3":
                    System.out.println("[도서수정]");
                    System.out.print("수정할 도서이름: ");
                    String modifyBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findBookIndex(bookArray, modifyBook);
                    if(findIndex == -1) {
                        System.out.println("해당 도서가 없습니다.");
                        break;
                    }
                    System.out.print("새 이름: ");
                    bookArray[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료");
                    break;
                case "4":
                    System.out.println("[도서삭제]");
                    System.out.print("삭제 할 도서 이름: ");
                    String delBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findBookIndex(bookArray, delBook);
                    if(findIndex == -1) {
                        System.out.println("해당 도서가 없습니다.");
                        break;
                    }
                    newbooks = new String[bookArray.length - 1];
                    for(int i = 0; i < newbooks.length; i++) {
                        if(i < findIndex) {
                            newbooks[i] = bookArray[i];
                            continue;
                        }
                        newbooks[i] = bookArray[i + 1];
                    }
                    bookArray = newbooks;
                    break;
                case "5":
                    System.out.println("[도서전체조회]");
                    for(int i = 0; i < bookArray.length; i++) {
                        System.out.println(bookArray[i]);
                    }
                    break;
                case "q":
                    System.out.println("[프로그램 종료]");
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }
        }
    }
}
