package com.bitstudy.web.bmicalc;

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

public class BmiService {
    public String getBmi(BmiCalcDTO bmi){

            double res = bmi.getHeight() / bmi.getInch() / bmi.getInch();
        /*
        switch (res){
            case res<=18 : String result ="저체중";
            case res<=22.9 : String result =String.format("%s님의 BMI지수는 %3f이며, 정상입니다.",name,res);
            case res<=23 : String result =String.format("%s님의 BMI지수는 %3f이며, 과체중입니다.",name,res);
            case res<=24.9 : String result =String.format("%s님의 BMI지수는 %3f이며, 위험체중입니다.",name,res);
            case res<=29.9 : String result =String.format("%s님의 BMI지수는 %3f이며, 1단계 비만입니다.",name,res);
            case res<=34.9 : String result =String.format("%s님의 BMI지수는 %3f이며, 2단계 비만입니다.",name,res);
            default:String result =String.format("%s님의 BMI지수는 %3f이며, 고도비만입니다.",name,res);
            return result;
        }*/



            if(res<=18){
                String result=String.format("%s님의 BMI지수는 %3f이며, 저체중입니다",bmi.getName(),res);
                return result;
            }
            else if(res<=22.9) {
                String result=String.format("%s님의 BMI지수는 %3f이며, 정상입니다",bmi.getName(),res);
                return result;
            }
            else if(res<=23) {
                String result=String.format("%s님의 BMI지수는 %3f이며, 과체중입니다",bmi.getName(),res);
                return result;
            }else if(res<=24.9) {
                String result=String.format("%s님의 BMI지수는 %3f이며, 위험체중입니다",bmi.getName(),res);
                return result;
            }else if(res<=29.9) {
                String result=String.format("%s님의 BMI지수는 %3f이며, 1단계 비만입니다",bmi.getName(),res);
                return result;
            }else if(res<=34.9) {
                String result=String.format("%s님의 BMI지수는 %3f이며, 2단계 비만입니다",bmi.getName(),res);
                return result;
            }
            else {
                String result=String.format("%s님의 BMI지수는 %3f이며, 고도비만입니다",bmi.getName(),res);
                return result;
            }


    }
}
