package com.bitstudy.web.algorithm.service;

/**
 * packageName: com.bitstudy.web.algorithm.service
 * fileName        : HashService
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public interface HashService {
    String loserplayer(String[] participant, String[] completion);
    boolean phonechart(String[] phone_book);
    int spy(String[][] clothes);
    int[] bestAlbum(String[] genres, int[] plays);


}
