package com.bitstudy.web.controller;

import com.bitstudy.web.domain.AlgoDTO;

import java.util.Scanner;


/**
 * packageName: com.bitstudy.web.controller
 * fileName        : TempController
 * author           : chohyungook
 * date               : 2022-02-03
 * desc             :
 * one[0]="조현국";
 *        oneSubject1[0]="해시";
 *        oneSubject2[0]="DFS/BFS";
 *        one[1]="권혜민";
 *        oneSubject1[1]="정렬";
 *        oneSubject2[1]="스택/큐";
 *        one[2]="김진영";
 *        oneSubject1[2]="힙";
 *        oneSubject2[2]="그래프";
 *        one[3]="김한슬";
 *        oneSubject1[3]="완전탐색";
 *        oneSubject2[3]="탐욕법";
 *        one[4]="서성민";
 *        oneSubject1[0]="동적계획법";
 *        oneSubject2[0]="이분탐색";
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         chohyungook        최초 생성
 */

//element를 instance화 해야 get,set먹음
public class TempController {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
       // AlgoDTO[] algo =new AlgoDTO[5];
       String[] oneNames = {"조현국","권혜민","김진영","김한슬","서성민"};
       String[] oneSubject = {"해시","정렬","힙","완전탐색","동적계획법",
               "DFS","스택","그래프","탐욕법","이분탐색",
               "BFS","큐","","",""};
        for (int i =0; i<oneNames.length;i++){
            System.out.println(oneNames[i]+" : " +oneSubject[i] + " , "+oneSubject[i+5]+ " , "+oneSubject[i+10] );
        }


     /*  for (int i=0;i< algo.length;i++){
           algo[i]=new AlgoDTO();
           algo[i].setName();
           algo[i].setSubject();
           System.out.println(algo[i].getName() +" : "+ algo[i].getSubject()+","
                   + algo[i+5].getSubject()+","+ algo[i+10].getSubject());
       }*/
        String[] arr = {"조현국","권혜민","김진영","김한슬","서성민","해시","정렬","힙","완전탐색","동적계획법",
                "DFS","스택","그래프","탐욕법","이분탐색",
                "BFS","큐","","",""};

        for (int i=0;i<5; i++){
            
        }


    }
}
