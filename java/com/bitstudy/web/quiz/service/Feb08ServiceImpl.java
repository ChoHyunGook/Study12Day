package com.bitstudy.web.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.quiz.service
 * fileName        : Feb08ServiceImpl
 * author           : chohyungook
 * date               : 2022-02-08
 * desc             :권혜민 : 구구단
 * 김한슬 : 야구
 * 김진영 : 로또
 * 조현국 : 은행(bank)
 * 서성민 : 예약(book)
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         chohyungook        최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void quiz1() {
        int i, dan;
        for (dan = 2; dan <= 9; dan++) {
            System.out.print("[" + dan + "단]\t");
        }
        System.out.println();
        for (i = 1; i <= 9; i++) {
            for (dan = 2; dan <= 9; dan++) {
                System.out.print(dan + "*" + i + "=" + i * dan + "\t");
            }
            System.out.println();
        }

    }

    @Override
    public void quiz2() {

    }

    @Override
    public void quiz3() {

    }

    @Override
    public void quiz4(Scanner scanner) {
//        <조건>
//
//        1. 프로그램에는 네 가지 메뉴가 포함된다. (잔액조회,인출,입금,종료)
//
//        2. 사용자로부터 패스워드를 입력받아 정보를 보호한다. (패스워드가 틀린 경우 실행이 안 됨)
//
//        3. 인출금액은 잔액보다 클 수 없다.
//
//        4. 사용자가 종료를 원할 때까지 반복 실행한다.
//
//        5. 예금이 인출 된 후에는 인출된 만큼 잔액이 감소해야 한다.
        int menu =  Integer.parseInt(scanner.nextLine());//사용자 입력값 저장변수
        int total= 200000;//잔액
        int output=0;//출금
        int input=0;//입금
        int pw=0;//비밀번호
        int m=10000;
        int m5=50000;
        int m10=100000;

        System.out.println("사용하실 메뉴를 선택해주세요.\n" +
                "0.잔액조회 1.현금인출 2.입금 3.종료");


        while (menu!=4){
            System.out.println("비밀번호 입력");
            pw=Integer.parseInt(scanner.nextLine());

            while (pw!=1004){
                System.out.println("비밀번호 오류 재입력해주세요.");
                pw=Integer.parseInt(scanner.nextLine());
            }
            if (menu==1) {
                if (pw == 1004) {
                    System.out.println(String.format("고객님의 잔액은 %d입니다.", total));
                }
            }
            if (menu==2) {
                if (pw == 1004) {
                    System.out.println("인출하실 금액을 선택하세요." +
                            "0. 만원 1. 5만원 2. 10만원 3.50만원 4.직접입력");
                    switch (scanner.nextInt()) {
                        case 0:
                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m, total - m));break;
                        case 1:
                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m5, total - m5));break;
                        case 2:
                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m10, total - m10));break;
                        case 3:
                            System.out.println("잔액이 부족합니다. 다시입력해주세요.");return;
                        case 4:
                            System.out.println("인출금액을 입력해주세요.");
                            output=Integer.parseInt(scanner.nextLine());
                            while (output>total){
                                System.out.println("잔액이 부족합니다 다시입력해주세요.");
                                System.out.println("인출금액을 입력해주세요.");
                                output=Integer.parseInt(scanner.nextLine());
                                if(output<total){
                                    System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.",output,total-output));
                                }
                            } break;
                            default:
                            System.out.println("올바른 번호를 입력해주세요.");break;
                    }
                    if(menu==3){
                        System.out.println("입금하실 금액을 입력하세요.");
                        input=Integer.parseInt(scanner.nextLine());
                        System.out.println(String.format("입금하실금액은 %d이며 입금되어 잔액은 %d입니다.",input,total+input));
                    }
                }
            }
        }


    }

    @Override
    public void quiz5() {

    }
}
