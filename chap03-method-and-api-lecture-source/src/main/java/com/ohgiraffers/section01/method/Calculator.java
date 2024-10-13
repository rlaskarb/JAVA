package com.ohgiraffers.section01.method;

public class Calculator {

    /* comment
    *   우리는 Application 에서 2개의 정수를 전달 할 것이고
    *   Calculator 클래스는 2개의 정수를 전달 받아
    *   최솟값을 구하는 메소드(기능)
    *   최댓값을 구하는 메소드(기능)
    *   실행 후 Application 에게 2개의 정수 중 큰 값과 작은 값이
    *   무엇인 지 알려 줄 것이다.
    *  */

    public int minNumberOf(int first, int second) {
        return (first < second) ? first : second;
    }

    public static int maxNumberOf(int first, int second) {

        return (first > second) ? first : second;
    }


}
