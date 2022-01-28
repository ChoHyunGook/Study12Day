package com.bitstudy.web.controller;

import com.bitstudy.web.domain.BmiCalcDTO;
import com.bitstudy.web.service.BmiService;
import com.bitstudy.web.domain.CalcDTO;
import com.bitstudy.web.service.ClacService;
import com.bitstudy.web.domain.GradeDTO;
import com.bitstudy.web.service.GradeService;
import com.bitstudy.web.domain.LoginDTO;
import com.bitstudy.web.service.LoginService;
import com.bitstudy.web.domain.SearchDTO;
import com.bitstudy.web.service.SearchService;
import java.util.Scanner;

/**
 * packageName: com.bitstudy.web.controller
 * fileName        : DemoController
 * author           : chohyungook
 * date               : 2022-01-27
 * desc             : MVC>컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27         chohyungook        최초 생성
 * 2022-01-28         chohyungook        수정
 */


public class DemoController {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BmiCalcDTO bmi =new BmiCalcDTO();
        CalcDTO calc= new CalcDTO();
        GradeDTO grade =new GradeDTO();
        LoginDTO login = new LoginDTO();
        SearchDTO search = new SearchDTO();
        BmiService bmiService = new BmiService();
        ClacService clacService =new ClacService();
        GradeService gradeService=new GradeService();
        LoginService loginService = new LoginService();
        SearchService searchService = new SearchService();

        while(true){
            System.out.println("메뉴를 선택하세요.\n0.EXIT 1.BMICALC 2.CALC 3.GRADE 4.LOGIN 5.SEARCH");
            String res ="";

            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    System.out.println(BmiCalcDTO.MAIN_NAME+"\n성함 키(예시 172=1.72) 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setInch(scanner.nextDouble());
                    bmi.setHeight(scanner.nextInt());
                    res=bmiService.getBmi(bmi);
                ;break;
                case "2":
                    System.out.println(CalcDTO.MAIN_NAME+"\n첫번째 숫자 연산자 두번째숫자 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOp(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res=clacService.getCalc(calc);
                    break;
                case "3":
                    System.out.println(GradeDTO.GRADE_TITLE+"\n 이름 국어점수 수학점수 영어점수 입력");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    res=gradeService.getGrade(grade);

                break;
                case "4":
                    System.out.println(LoginDTO.webSite+"\n아이디,비밀번호,성함을 입력하세요.");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res=loginService.getLogin(login);
                    break;
                case "5":
                    System.out.println(SearchDTO.MAIN_NAME+"\nGoogle 검색 또는 URL 입력");
                    search.setSearch(scanner.next());
                    res=searchService.getSearch(search);
                    break;
                default:res="정확한 메뉴명을 입력해주세요.";break;
            }
            System.out.println(res);
        }

    }
}

