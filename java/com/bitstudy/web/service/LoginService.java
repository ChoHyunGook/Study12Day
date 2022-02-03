package com.bitstudy.web.service;

import com.bitstudy.web.domain.LoginDTO;

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
public class LoginService {
    public String getLogin(LoginDTO login) {

        String res = "";


        if (login.getId().equals(login.getIDEA()) && login.getPw().equals(login.getPASSWORD()) && login.getName().equals(login.getNAMING())) {
            res = String.format("로그인 성공");
        } else if (login.getId().equals(login.getIDEA()) && login.getPw().equals(login.getPASSWORD())) {
            res = String.format(" ID %s 와 PASSWORD %s는 맞으나 사용자 %s가 아닙니다. 로그인 실패"
                    , login.getId(), login.getPw(), login.getName());
        } else if (login.getId().equals(login.getIDEA()) && login.getName().equals(login.getNAMING())) {
            res = String.format("사용자 %s님의 ID %s는 맞으나 비밀번호가 틀립니다.로그인실패"
                    , login.getName(), login.getId());
        } else if (login.getPw().equals(login.getPASSWORD()) && login.getName().equals(login.getNAMING())) {
            res = String.format("사용자 %s님의 PASSWORD %s는 맞으나 아이디 %s가 틀립니다. 로그인실패"
                    , login.getName(), login.getPw());
        } else if (login.getName().equals(login.getNAMING())) {
            res = String.format("사용자 %s님의 아이디와 비밀번호가 틀립니다. 로그인실패", login.getName());
        } else if (login.getId().equals(login.getIDEA())) {
            res = String.format("ID %s는 맞으나 사용자와 비밀번호가 틀립니다.로그인실패", login.getId());
        } else if (login.getPw().equals(login.getPASSWORD())) {
            res = String.format("PASSWORD %s는 맞으나 사용자와 아이디가 틀립니다.로그인실패", login.getPw());
        } else {
            res = String.format("아이디 %s,비밀번호%s,사용자%s가 모두 틀립니다. 로그인실패!");
        }
        return res;
    }
}

        /*return (pw.equals(PASSWORD)) ? String.format("%s님의 비번 %s가 맞습니다. 로그인성공",name,pw)
                : String.format("%s 의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패.",id,pw);




        /*
        switch (PASSWORD) {
            case "abc" : res = String.format("사용자 %s님의 비밀번호%s가 맞습니다. 로그인성공"
                    ,this.name,this.pw);break;
            default: res = String.format("%s님의 ID %s는 맞고 비밀번호 %s가 틀립니다"
            ,this.name,this.id,this.pw);break;
        }*/

       /* res=(pw.equals(PASSWORD)) ? String.format("%s님의 비번 %s가 맞습니다. 로그인성공",this.name,this.pw)
                : String.format("%s 의 ID는 맞고, 비번 %s가 틀립니다. 로그인 실패.",this.id,this.pw);



        */

            /**두개의 값일때 사용가능**/




