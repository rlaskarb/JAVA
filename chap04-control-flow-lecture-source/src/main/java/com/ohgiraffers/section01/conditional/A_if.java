package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    /* title. if 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

    /* comment.
    *   [if 문의 표현식]
    *   if(조건식) {
    *       조건이 true 일 때 수행할 명령문;
    *   }
    *  */

    /* comment.
    *   조건식 : true or false 가 나오는 연산식을 조건식이라고 한다.
    *   if 문은 조건식의 결과 값이 참(true) 이면 {} 안에 코드를 실행
    *   거짓(false)이면 {} 안에 코드를 무시하고 넘어가게 된다.
    *  */

    /* index. 1. 문제
    *   정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수 입니다."
    *   라고 출력하고, 짝수가 아니면 출력하지 않는 구문을 작성 할 것이다.
    *   단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다"
    *   라고 출력을 하도록 해보자.
    *  */

    public void testSimpleIfStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나를 입력해주세요 : ");
        int num = sc.nextInt();

        /* index. 2. 조건 생각해보기. 짝수 => 어떤한 수를 2로 나누었을 때 나머지가 0이면 짝수다. */
        if(num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        System.out.println("프로그램을 종료합니다.");

    }

    public void testNestedIfStatement() {
        /* index. 3. 문제
        *   정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
        *   짝수이면 "입력하신 숫자는 양수이면서 짝수입니다" 를 출력하고,
        *   둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자.
        *   단, 조건과 상관 없이 프로그램이 종료될 때, "프로그램을 종료합니다" 라고
        *   출력되도록 해보자.
        *  */
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 한 개 입력해주세요 : ");
        int num = sc.nextInt();
        // 입력한 정수가 양수인 지 확인하는 if문
        if(num > 0) {

            // 양수가 맞을 때, 한 번 더 짝수인 지를 확인.
            if(num % 2 == 0) {
                System.out.println("입력하신 정수는 양수이며 짝수입니다.");
            }

        }

        System.out.println("프로그램을 종료합니다.");
    }

}








