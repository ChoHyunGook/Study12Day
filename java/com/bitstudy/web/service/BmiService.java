package com.bitstudy.web.service;

import com.bitstudy.web.domain.BmiCalcDTO;

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

           /* String res = "";

            switch (bmi.getBm()){
            case bmi.getBm()<=18 : res = "저체중";break;
            case bmi.getBm()<=22.9 : res= "정상";break;
            case bmi.getBm()<=23.0 : res ="과체중";break;
            case bmi.getBm()<=24.9 : res ="위험체중";break;
            case bmi.getBm()<=29.9 : res ="1단계 비만";break;
            case bmi.getBm()<=34.9 : res ="2단계 비만";break;
            case bmi.getBm()<35 : res = "고도비만";break;
        }
        return String.format("%s님의 BMI지수는 %3f이며, %s입니다.",bmi.getName(),bmi.getBm(),res);
    }
}*/


            double res = bmi.getHeight() / bmi.getInch() / bmi.getInch();

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
