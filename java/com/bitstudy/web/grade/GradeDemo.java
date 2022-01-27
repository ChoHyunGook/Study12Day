package com.bitstudy.web.grade;

import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.grade
 * fileName        : GradeDemo
 * author           : chohyungook
 * date               : 2022-01-26
 * desc             :
 * 사용자로부터
 * 이름 [          ]
 * 국어 [          ]
 * 영어 [          ]
 * 수학 [          ]
 * 을 차례대로 입력 받아서
 * ########## 성적표 ########
 * 이름: 홍길동
 * > 국어: 80점
 * > 영어: 79점
 * > 수학: 80점
 * 총점: 239점
 * 평균(정수): 79점
 * 합격여부: 합격(불합격)
 * #######################
 * 출력되는 프로그램을 작성
 * 단, 합격 / 불합격 기준은
 * 평균 60점 이상이면 합격
 *
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26         chohyungook        최초 생성
 */
public class GradeDemo {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();

        for (int i=2;i<3; i++){
            System.out.println(i+"번학생 국어 영어 수학 점수를 순서대로 입력하세요.");
            String name = scanner.next();
            int kor = scanner.nextInt();
            int eng = scanner.nextInt();
            int math = scanner.nextInt();
            String res = gradeApp.grade(name,kor,eng,math);
            System.out.println(res);
        }

    }
}
