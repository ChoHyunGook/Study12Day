package com.bitstudy.web.bmicalc;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.bmicalc
 * fileName        : BmiCalcDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc             :BMI 계산기 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

public class BmiCalcDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BmiCalcApp bmiCalcApp= new BmiCalcApp();
        System.out.println(bmiCalcApp.MAIN_NAME);
        System.out.println("성함을 입력하세요.");
        System.out.println("키를 입력하세요.(예시 172cm => 1.72)");
        System.out.println("몸무게를 입력하세요.");
        String name = scan.next();
        double inch = scan.nextDouble();
        int height = scan.nextInt();
        String res = bmiCalcApp.bmCalc(name, height, inch);
        System.out.println(res);
    }
}
