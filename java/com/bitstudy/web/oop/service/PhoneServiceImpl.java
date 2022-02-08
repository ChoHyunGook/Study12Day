package com.bitstudy.web.oop.service;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : PhoneServiceImpl
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void usePhone(Scanner scanner) {
        System.out.println("집전화");
    }

    @Override
    public void useCelPhone(Scanner scanner) {
        System.out.println("핸드폰");

    }

    @Override
    public void useIPhone(Scanner scanner) {
        System.out.println("아이폰");

    }

    @Override
    public void useGalPhone(Scanner scanner) {
        System.out.println("겔럭시노트");

    }
}
