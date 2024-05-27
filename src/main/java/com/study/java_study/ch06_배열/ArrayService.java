package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;
        // crud : create(생성) reade(조회) update(수정) delete(삭제)

        while(isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택: ");

            String selectedMenu = scanner.nextLine();
            String[] newNames = null;
            int findIndex = -1;

            switch(selectedMenu) {
                case "1":
                    System.out.println("[이름등록]");
                    newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    break;
                case "2":
                    System.out.println("[수정]");
                    System.out.println("수정 할 기존 이름: ");
                    String modifyName = scanner.nextLine();
                    // 클래스 참조를 사용하여 수정하기
                    findIndex = arrayUtils.findIndexByName(names, modifyName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.println("새 이름: ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료");
                    break;

                case "3":
                    System.out.println("[삭제]");
                    System.out.println("삭제할 이름: ");
                    String removeName = scanner.nextLine();

                    findIndex = arrayUtils.findIndexByName(names, removeName);
                    if (findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break; // 스위치문을 빠져나가는 break
                    }
                    newNames = new String[names.length - 1];
                    for(int i = 0; i < newNames.length; i++) {
                        if(i < findIndex ) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    names = newNames;
                    System.out.println(removeName + "을(를) 삭제하였습니다.");
                    break;

                    /*
                    내가한거
                    String[] subNames = new String[names.length - 1];

                    String delName = scanner.nextLine();
                    int c = 0;
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(delName)) {
                            c = i; // 지워야 하는 동일 이름의 순서를 c에 저장
                        }
                        for(int j = 0; j < names.length; j++) { // j는 names 길이 만큼 반복
                            if(j < c) { // c 순서 보다 작을땐 그대로 집어 넣으면 됨
                                subNames[j] = names[j];
                            }
                            if(j > c) { // c가 2라고 가정할때 subNames[2]에 names[3] 이 들어가고
                                subNames[j - 1] = names[j]; // subNames[3]에 names[4] 이 들어가야 하기 때문에 subNames[j -1]
                            }                               // 그래서 반복 횟수를 names와 맞추었음
                        }
                    }
                    names = subNames;
                    break;
                     */
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String findName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, findName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료하겠습니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }
        }
    }
}
