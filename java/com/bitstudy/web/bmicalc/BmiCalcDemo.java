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
    public String execute(String name,double inch,int height){

        BmiCalcApp bmiCalcApp= new BmiCalcApp();

        return bmiCalcApp.bmCalc(name, height, inch);

    }
}
