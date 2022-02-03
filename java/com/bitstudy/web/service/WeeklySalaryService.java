package com.bitstudy.web.service;

import com.bitstudy.web.domain.WeeklySalaryDTO;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : WeeklySalaryService
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */
public class WeeklySalaryService {
    public String getWeekSalary(WeeklySalaryDTO weeklySalary){

        int res=weeklySalary.getWork_hour()*weeklySalary.getTime_salary();
        int res1=res*weeklySalary.getWork_day();


        return String.format("%s 님의 일급은 %d 이며 주급은 %d 입니다."
                ,weeklySalary.getName(),res,res1);
    }
}
