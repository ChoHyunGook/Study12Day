package com.bitstudy.web.feb07.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.service
 * fileName        : Feb07ServiceImpl
 * author           : chohyungook
 * date               : 2022-02-07
 * desc             :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         chohyungook        최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{

    @Override
    public void dice() {
        
        String s="";
        int i = (int) (Math.random() * 6) +1;
        //원하는 값이 1~6이므로 +1을 해준다 +1을 안할시 0~5가 출력되기때문이다.
        switch (i){
            case 1 :
                s="1";
            case 2 :
                s="2";
            case 3 :
                s="3";
            case 4 :
                s="4";
            case 5 :
                s="5";
            case 6 :
                s="6";
        }
        System.out.println(String.format("%s가 나왔습니다!",s));


    }

    @Override
    public void rps(Scanner scanner) {
        while (true) {
            System.out.println("0.가위 1.바위 2.보 3.EXIT");
            int gammer = scanner.nextInt();
            int computer;
            String s = "";
            Random random = new Random();
            computer = random.nextInt(3);
            //0~2까지 랜덤으로 번호가 입력된다.
            if(gammer==3){
                System.out.println("BYE BYE");
            return;
            }
            switch (computer - gammer) {
                case 2:
                    s = "이겼다!";
                    break;
                case -1:
                    s = "이겼다!";
                    break;
                case 1:
                    s = "졌...";
                    break;
                case -2:
                    s = "졌...";
                    break;
                case 0:
                    s = "비겼음...";
                    break;
                default:
                    s = "다시입력해주세요";
                    break;

                //컴퓨터0(가위)/게이머1(바위)(win)=-1
                //컴퓨터1(바위)/게이머2(보)(win)=-1
                //컴퓨터2(보)/게이머0(가위)(win)=2

                //컴퓨터0(가위)/게이머2(보)(lose)=-2
                //컴퓨터1(바위)/게이머0(가위)(lose)=1
                //컴퓨터2(보)/게이머1(바위)=1

            }
            System.out.println(s);
        }
    }

    @Override
    public void getPrime(Scanner scanner) {
        int num = 0;
        int area= 0;
        System.out.println("구간을 적으세요.");
        area=scanner.nextInt();
        String s="";
        //소수=약수가 1과 자신뿐인수 (i%j[자기자신보다 작아야함]==1이여야 소수)
        for (int i =2;i<=area;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    num++;
                }
            }if(num==1){
                System.out.print(i+",\t");
            }
            num=0;

        }


    }

    @Override
    public void leapYear(Scanner scanner) {
        /*윤년의 조건*/
        //윤년은 4년마다 돌아오고(i%4==0) 그리고(and==>&&)
        // 100년으로 나눠 떨어지는건 평년(i%100!=0부정[default값의반대]==>!)
        //또는(or==>||)400으로 나눈값은 윤년(i%400==0)
        System.out.println("연도를 입력해주세요!");
        int i=scanner.nextInt();
        String s;
        if((i%4==0 && i % 100 !=0) || i%400==0){
            s="윤년";
        }else
            s="평년";
        System.out.println(String.format("%d는 %s입니다.",i,s));



    }

    @Override
    public String numberGolf(Scanner scanner) {
        Random random = new Random();
        int rand = random.nextInt(100) + 1;
        String res = "";
        System.out.println("임의로 입력받은 숫자 맞추기");
        while(true) {
            System.out.print("예상 숫자를 입력하세요 : ");
            int num = scanner.nextInt();
            if (rand == num) {
                res = "정답입니다";
                return String.format(res);
            } else if (rand < num) {
                System.out.println("임의의 숫자가 더 작습니다.");
            } else if (rand > num) {
                System.out.println("임의의 숫자가 더 큽니다.");
            }
        }

    }
}
