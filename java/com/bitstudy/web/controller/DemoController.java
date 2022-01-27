package com.bitstudy.web.controller;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.controller
 * fileName        : DemoController
 * author           : chohyungook
 * date               : 2022-01-27
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         chohyungook        최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<2;i++) {
            System.out.println("메뉴 번호를 선택해주세요.");
            String menu = "1.BMI 2.CALC 3.GRADE 4.LOGIN 5.MAINSITE";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
        /*if (select.equals("1")){
            res="BMI가 실행되었습니다.";
        }else if (select.equals("2")){
            res="CALC가 실행되었습니다.";
        }else if (select.equals("3")){
            res="GRADE가 실행되었습니다.";
        }else if (select.equals("4")){
            res="LOGIN이 실행되었습니다.";
        }else if (select.equals("5")){
            res="MAINSITE가 실행되었습니다.";
        }*/
            switch (select) {
                case "1":
                    res = "BMI가 실행되었습니다.";
                    break;
                case "2":
                    res = "CALC가 실행되었습니다.";
                    break;
                case "3":
                    res = "GRADE가 실행되었습니다.";
                    break;
                case "4":
                    res = "LOGIN이 실행되었습니다.";
                    break;
                case "5":
                    res = "MAINSITE가 실행되었습니다.";
                    break;
                default:
                    res = "1~5의 번호를 선택해주세요";
                    break;

            }
            System.out.println(res);
        }
    }
}

