package com.ohgiraffers.section01.method;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application9 {

    public static final double PI = 3.14;

    public static void main(String[] args) {

        /* title. 다른 클래스에 작성한 메소드를 호출 할 수 있다. */

        /* comment
         *   우리는 Application 에서 2개의 정수를 전달 할 것이고
         *   Calculator 클래스는 2개의 정수를 전달 받아
         *   최솟값을 구하는 메소드(기능)
         *   최댓값을 구하는 메소드(기능)
         *   실행 후 Application 에게 2개의 정수 중 큰 값과 작은 값이
         *   무엇인 지 알려 줄 것이다.
         *  */

        int first = 15;
        int second = 40;

        /* comment. non-static method 호출 방식 */
        Calculator calc = new Calculator();
        
        int min = calc.minNumberOf(first, second);

        System.out.println("min = " + min);



        /* comment. static method 호출 방식 */

        /* comment.
        *   static 메소드도 non-static 메소드 처럼 호출은 가능하다.
        *   하지만 권장하지 않는다. why? -> 원래 방식이 있는데 굳이 왜 하냐
        *   이미 메모리에 로딩이 되어 있는 static 메소드는 여러 객체가 공유하게
        *   된다.
        *   new 키워드로 접근을 하게 된다면, 공유된 값에 예상치 못 한 동작을
        *   유발할 수 있기 때문에 사용을 제한해달라는 컴퓨터의 주의 문구 이다.
        *  */
        int max2 = calc.maxNumberOf(20, 30);

        int max = maxNumberOf(first, second);

        System.out.println("max = " + max);
        
    }

}
