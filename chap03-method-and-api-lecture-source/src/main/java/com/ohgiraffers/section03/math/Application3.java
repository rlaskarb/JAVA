package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /* title. java.util.Random 클래스를 사용해서 난수 발생 */

        Random random = new Random();

        /* comment.
        *   random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최솟값;
        *  */

        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        // 1 ~ 10

        // 10 ~ 15

        // -127 ~ 128

    }

}
