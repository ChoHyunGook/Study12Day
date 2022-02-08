package com.bitstudy.web.algorithm.service;

/**
 * packageName: com.bitstudy.web.algorithm.service
 * fileName        : DfsService
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public interface DfsService {
    int targetNumber(int[] numbers, int target);
    int network(int n, int[][] computers);
    int wordChange(String begin, String target, String[] words);
    String[] trip(String[][] tickets);

}
