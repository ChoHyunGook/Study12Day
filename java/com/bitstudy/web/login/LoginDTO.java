package com.bitstudy.web.login;

/**
 * packageName: com.bitstudy.web
 * fileName        : LoginApp
 * author           : chohyungook
 * date               : 2022-01-26
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class LoginDTO {
    public static String webSite = "Login Web";

    private String id;
    private String pw;
    private String name;
    static String NAME = "조현국";
    static String ID = "abc";
    static String PASSWORD = "abc";

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getPw(){
        return pw;
    }
    public void setPw(String pw){
        this.pw=pw;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }





    }



