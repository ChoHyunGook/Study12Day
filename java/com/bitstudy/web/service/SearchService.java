package com.bitstudy.web.service;

import com.bitstudy.web.domain.SearchDTO;

/**
 * packageName: com.bitstudy.web
 * fileName        : MainsiteDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc             : 구글 검색하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class SearchService {
    public String getSearch(SearchDTO search){

            return String.format("%s를 검색합니다.",
                    search.getSearch());


    }
}
