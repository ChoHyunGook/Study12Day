package com.bitstudy.web.service;

import com.bitstudy.web.domain.CircleAreaDTO;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : CircleAreaService
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */
public class CircleAreaService {
    public String getCircleArea(CircleAreaDTO circleArea){
        double result = circleArea.getHalf()*circleArea.getHalf()
                *circleArea.getPi();
        return String.format("반지름 %d와 원주율 %3f의 원넓이는 %3f입니다."
                ,circleArea.getHalf(),circleArea.getPi(),result);
    }
}
