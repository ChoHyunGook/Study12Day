package com.bitstudy.web.oop.controller;

import com.bitstudy.web.oop.service.PhoneServiceImpl;
import com.bitstudy.web.oop.service.PhoneService;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.controller
 * fileName        : PhoneController
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public class PhoneController {
    public void excute(Scanner scanner){
        PhoneService service=new PhoneServiceImpl();
        String s="";
        while (true){
            System.out.println("메뉴를 선택하세요\n" +
                    "0.EXIT\n" +
                    "1.집전화\n"+
                    "2.휴대폰\n"+
                    "3.아이폰\n"+
                    "4.겔럭시노트");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    service.usePhone(scanner);
                    break;
                case "2":
                    service.useCelPhone(scanner);break;
                case "3":
                    service.useIPhone(scanner);break;
                case "4":
                    service.useGalPhone(scanner);break;
                default:
                    s="정확한 메뉴명을 입력해주세요.";break;
            }
            System.out.println(s);
        }
    }
}
