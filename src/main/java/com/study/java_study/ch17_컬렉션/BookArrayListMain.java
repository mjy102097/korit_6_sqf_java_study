package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {
        /*
            프로그램 시작
            도서명: 도서1
            저자명: 저자1
            new Book("도서1", "저자1")
            BookList에 추가

            도서명: 도서2
            저자명: 저자2
            new Book("도서2", "저자2")
            BookList에 추가

            도서명: 도서3
            저자명: 저자3
            new Book("도서3", "저자3")
            BookList에 추가

            도서 전체 조회
            도서명 >> 도서1 ~ 3   -> toString 으로 출력 하지말고
            저자명 >> 저자1 ~ 3   -> 반복문으로 하나씩 출력

            삭제 할 도서명: 도서2

            도서 전체 조회
            도서명 >> 도서1, 3
            저자명 >> 저자1, 3
         */
        Scanner sc = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            String bookName;
            String author;
            System.out.print("도서명: ");
            bookName = sc.nextLine();
            System.out.print("저자명: ");
            author = sc.nextLine();

            bookList.add(new Book(bookName, author));
            // 여기 변수 넣는곳에 그냥 바로 scanner 넣으면 안되는지?
        }

        // 도서 전체 조회
        for(Book book : bookList) {
            System.out.println("도서명: " + book.getBookName());
            System.out.println("저자명: " + book.getAuthor());
        }

        // 삭제
        System.out.println("삭제 할 도서명: ");
        String removeBookName = sc.nextLine();
        for(Book book : bookList) {
            if(book.getBookName().equals(removeBookName)) {
                bookList.remove(book);
                break; // 중간에 지워버리면 주소가 바뀌어서 break 해주기
            }
        }

        for(int i = 0; i < bookList.size(); i++) {
            if(bookList. get(i).getBookName().equals(removeBookName)) {
                Book removeBook = bookList.remove(i);
                System.out.println("삭제된 도서 정보: " + removeBook);
                break;
            }
        }

        for(int i = 0; i < bookList.size(); i++) {
            System.out.println("도서명: " + bookList.get(i).getBookName());
            System.out.println("저자명: " + bookList.get(i).getAuthor());
        }
    }
}
