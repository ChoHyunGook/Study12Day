package com.bitstudy.web.controller;


import com.bitstudy.web.bmicalc.BmiCalcApp;
import com.bitstudy.web.bmicalc.BmiCalcDemo;
import com.bitstudy.web.calc.CalcApp;
import com.bitstudy.web.calc.ClacDemo;
import com.bitstudy.web.login.LoginApp;
import com.bitstudy.web.login.LoginDemo;
import com.bitstudy.web.mainsite.MainsiteApp;
import com.bitstudy.web.mainsite.MainsiteDemo;

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
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BmiCalcApp bmiCalcApp  =new BmiCalcApp();
        BmiCalcDemo bmiCalcDemo = new BmiCalcDemo();
        CalcApp calcApp =new CalcApp();
        ClacDemo clacDemo =new ClacDemo();
        LoginApp loginApp = new LoginApp();
        LoginDemo loginDemo = new LoginDemo();
        MainsiteApp mainsiteApp = new MainsiteApp();
        MainsiteDemo mainsiteDemo = new MainsiteDemo();

        while(true){
            System.out.println("메뉴를 선택하세요.");
            String menu = "0.EXIT 1.BMICALC 2.CALC 3.GRADE 4.LOGIN 5.SEARCH";
            System.out.println(menu);
            String select =scanner.next();
            String res ="";

            switch (select){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    System.out.println(bmiCalcApp.MAIN_NAME+"\n성함 키 몸무게 입력");
                    res=bmiCalcDemo.execute(scanner.next(),scanner.nextDouble(),scanner.nextInt());
                ;break;
                case "2":
                    System.out.println(calcApp.MAIN_NAME+"\n첫번째 숫자 연산자 두번째숫자 입력");
                    res=clacDemo.execute(scanner.nextInt(),scanner.next(),scanner.nextInt());
                    break;
                case "3": res="GRADE";break;
                case "4":
                    System.out.println(loginApp.webSite+"\n아이디,비밀번호,성함을 입력하세요.");
                    res=loginDemo.execute(scanner.next(),scanner.next(),scanner.next());
                    break;
                case "5":
                    System.out.println(mainsiteApp.MAIN_NAME+"\nGoogle 검색 또는 URL 입력");
                    res=mainsiteDemo.execute(scanner.next());
                    break;
                default:res="정확한 메뉴명을 입력해주세요.";break;
            }
            System.out.println(res);
        }

    }
}

