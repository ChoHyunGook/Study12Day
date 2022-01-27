package com.bitstudy.web.mainsite;

/**
 * packageName: com.bitstudy.web
 * fileName        : MainsiteApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc             : 구글 검색하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class MainsiteApp {
    public static String MAIN_NAME = "Google";
    private String search = "";

    public String getSearch(String search){
        this.search=search;

        return String.format("%s를 검색합니다.",
                this.search);
    }

}
