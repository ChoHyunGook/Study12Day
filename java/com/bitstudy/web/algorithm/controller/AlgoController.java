package com.bitstudy.web.algorithm.controller;

import com.bitstudy.web.algorithm.service.HashService;
import com.bitstudy.web.algorithm.service.HashServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.algorizm
 * fileName        : AlgoController
 * author           : chohyungook
 * date               : 2022-01-27
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         chohyungook        최초 생성
 */
public class AlgoController {
    public void excute(Scanner scanner) {
        HashService hash=new HashServiceImpl();
        while(true){
            System.out.println("[SUB_Menu] 0.EXIT\n" +
                    "1.조현국\n2.권혜민\n3.서성민\n4.김한슬\n5.김진영\n");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    System.out.println("[소 메뉴]0.EXIT 1. HASH 2. DFS 3.BFS");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT");return;
                        case "1":
                            System.out.println("0.EXIT 1.완주하지못한선수 2.전화번호목록 3.위장 4.베스트앨범");
                            switch (scanner.next()){
                                case "1": break;
                                case "2":break;
                                case "3":break;
                                case "4":break;
                                default:
                                    System.out.println("똑바로번호좀");
                            }
                            break;
                        case "2":
                            System.out.println("0.EXIT 1.타겟넘버 2.네트워크 3.단어변환 4.여행경로");
                            switch (scanner.next()) {
                                case "1":
                                    break;
                                case "2":
                                    break;
                                case "3":
                                    break;
                                case "4":
                                    break;
                                default:
                                    System.out.println("똑바로번호좀");
                            }
                            ;break;
                        case "3":
                            System.out.println("BFS");break;
                        default:
                            System.out.println("올바른 번호를 입력하세요.");break;
                    }
                case "2":
                    System.out.println("0.EXIT 1.SORT  2.STACK  3.QUEUE");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT");return;
                        case "1":
                            System.out.println("SORT");break;
                        case "2":
                            System.out.println("STACK");break;
                        case "3":
                            System.out.println("QUEUE");break;
                        default:
                            System.out.println("올바른 번호를 입력하세요.");break;
                    }
                case "3":
                    System.out.println("0.EXIT 1.DP  2.BINARY");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT");return;
                        case "1":
                            System.out.println("DP");break;
                        case "2":
                            System.out.println("BINARY");break;
                        default:
                            System.out.println("올바른 번호를 입력하세요.");break;
                    }
                case "4":
                    System.out.println("0.EXIT 1.BLUTE_FORCE  2.GREEDY");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT");return;
                        case "1":
                            System.out.println("BLUTE_FORCE");break;
                        case "2":
                            System.out.println("GREEDY");break;
                        default:
                            System.out.println("올바른 번호를 입력하세요.");break;
                    }
                case "5":
                    System.out.println("0.EXIT 1.HEAP  2.GRAPH");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("EXIT");return;
                        case "1":
                            System.out.println("HEAP");break;
                        case "2":
                            System.out.println("GRAPH");break;
                        default:
                            System.out.println("올바른 번호를 입력하세요.");break;
                    }
            }
        }

    }
}
