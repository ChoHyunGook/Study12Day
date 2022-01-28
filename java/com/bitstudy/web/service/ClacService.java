package com.bitstudy.web.service;


import com.bitstudy.web.domain.CalcDTO;

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
public class ClacService {
    public String getCalc(CalcDTO calc){

            int res = 0;
        /*
        if(op.equals("+")){
            res = this.num1+this.num2;
        }else if(op.equals("-")){
            res = this.num1-this.num2;
        }else
        if(op.equals("*")){
            res = this.num1*this.num2;
        }else
        if(op.equals("/")){
            res = this.num1/this.num2;
        }else
        if(op.equals("%")){
            res = this.num1%this.num2;
        }else {}*/
            switch (calc.getOp()){
                case "+" : res = calc.getNum1()+calc.getNum2();break;
                case "-" : res =calc.getNum1()-calc.getNum2();break;
                case "*" : res =calc.getNum1()*calc.getNum2();break;
                case "/" : res =calc.getNum1()/calc.getNum2();break;
                case "%" : res =calc.getNum1()%calc.getNum2();break;
            }


            return String.format("%d %s %d 의 결과값은 %d 입니다."
                    ,calc.getNum1(),calc.getOp(),calc.getNum2(),res);


    }
}
