package com.ohgiraffers.section03.wrapper;

public class Application3 {

    /* title. 기본자료형 값을 문자열로 변경할 수 있다. */

    /* comment.
    *   valueOf() : 기본 자료형 값을 Wrapper 클래스 타입으로 변환
    *   toString() : 필드 값을 문자열로 반환하는 메소드
    *   문자열 합치기
    *  */

    String b = Byte.valueOf((byte)1).toString();

    /* comment. String 클래스에서 제공하는 valueOf() 를 사용할 수 있다. */
    String str = String.valueOf(7);

    /* comment. 문자열 합치기를 이용해서 String 타입으로 변환할 수 있다. */
    String str2 = 123 + "";


}
