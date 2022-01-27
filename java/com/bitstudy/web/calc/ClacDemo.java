package com.bitstudy.web.calc;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.calc
 * fileName        : ClacDemo
 * author           : chohyungook
 * date               : 2022-01-26
 * desc             : 계산기 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class ClacDemo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();//CalcApp=Expression(생성자를 만드는 식)
        System.out.println(calcApp.MAIN_NAME);
        System.out.println("첫번째 숫자를 입력하세요.");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        int num2 = scanner.nextInt();
        System.out.println("연산자 +,-,*,/,%(나머지값계산)를 입력해주세요.");
        String op = scanner.next();

        String result =  calcApp.calc(num1,num2,op);

        System.out.println(result);
    }
}
