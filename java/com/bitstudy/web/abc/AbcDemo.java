package com.bitstudy.web.abc;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.abc
 * fileName        : AbcDemo
 * author           : chohyungook
 * date               : 2022-01-26
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class AbcDemo {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        AbcApp abcApp =new AbcApp();
        String res = abcApp.abc();
        System.out.println(res);
    }
}
