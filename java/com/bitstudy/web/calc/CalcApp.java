package com.bitstudy.web.calc;

/**
 * packageName: com.bitstudy.web.calc
 * fileName        : CalcApp
 * author           : chohyungook
 * date               : 2022-01-26
 * desc             : 계산기 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class CalcApp {
    public static String MAIN_NAME ="계산기";
    private int num1;
    private int num2;
    private String op;

    public String calc (int num1,int num2,String op){
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
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
        switch (op){
            case "+" : res =num1+num2;break;
            case "-" : res =num1-num2;break;
            case "*" : res =num1*num2;break;
            case "/" : res =num1/num2;break;
            case "%" : res =num1%num2;break;
        }


        return String.format("%d %s %d 의 결과값은 %d 입니다."
                ,this.num1,this.op,this.num2,res);
    }

}
