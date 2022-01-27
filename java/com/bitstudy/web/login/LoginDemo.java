package com.bitstudy.web.login;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web
 * fileName        : LoginDemo
 * author           : chohyungook
 * date               : 2022-01-26
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class LoginDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(loginApp.webSite);
        //LoginApp에 webSite 명 받아오는 메소드//
        System.out.println("아이디,비밀번호,성함을 입력하세요.");
        String id = scan.next();
        String pw = scan.next();
        String name = scan.next();
        //int값 = .nextInt(), double값 = .nextDouble(), float값 = .nextFloat()//
        String result = loginApp.Login(id, pw, name);
        //LoginApp에서 입력받은 값 받아준다//
        System.out.println(result);
        //return값 받아서 result 출력

    }
}
