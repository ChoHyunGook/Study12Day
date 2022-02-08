package com.bitstudy.web.oop.service;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : PhoneService
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public interface PhoneService {
    void usePhone(Scanner scanner);
    void useCelPhone(Scanner scanner);
    void useIPhone(Scanner scanner);
    void useGalPhone(Scanner scanner);
}
