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
    public String execute(String id,String pw, String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.Login(id, pw, name);

    }
}
