package com.bitstudy.web.service;

import com.bitstudy.web.domain.ChangeDTO;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : ChangeService
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */
public class ChangeService {
    public String getChange(ChangeDTO change) {

        int res;
        res = change.getInput() - change.getCoffee();
        return String.format("거스름돈은 %d 입니다.", res);
    }
}
