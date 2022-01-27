package com.bitstudy.web.calc;


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
    public String execute(int num1,String op,int num2){
        CalcApp calcApp = new CalcApp();//CalcApp=Expression(생성자를 만드는 식)
        return calcApp.calc(num1,num2,op);


    }
}
