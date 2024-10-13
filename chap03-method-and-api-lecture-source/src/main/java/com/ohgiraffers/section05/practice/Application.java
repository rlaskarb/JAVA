package com.ohgiraffers.section05.practice;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("RandomMaker 게임에 오신 걸 환영합니다.");
        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("첫 번째 게임은 최소값과 최대값을 지정하면");
        System.out.println("해당하는 범위의 난수를 발생시키게 됩니다...");

        RandomMaker rm = new RandomMaker();
        Scanner sc = new Scanner(System.in);

        System.out.print("난수의 최솟값을 지정해주세요 : ");
        int min = sc.nextInt();
        System.out.println("최솟값을 " + min + " 으로 지정했습니다.");
        System.out.println("=================================");
        System.out.print("난수의 최댓값을 지정해주세요 : ");
        int max = sc.nextInt();
        System.out.println("최대값을 " + max + " 으로 지정했습니다.");
        System.out.println("=================================");

        System.out.println("지정한 범위로 난수를 호출해드리겠습니다...");
        int random = rm.randomNumber(min, max);
        System.out.println("결과가 나왔습니다..");
        System.out.println("지정한 범위의 난수는 '" + random + "' 입니다.");

        System.out.println("=====================================");
        System.out.println("두 번째 게임은 가위 바위 보 중 한 가지를 반환합니다.");
        System.out.println("시작하겠습니다");
        String game = rm.rockPaperScissors();
        System.out.println("가위~바위~보!! =  " + game);

        System.out.println("======================================");
        System.out.println("세 번째 게임은 동전의 앞면, 뒷면 중 한 가지를 반환합니다.");
        System.out.println("시작하겠습니다");
        String coinGame = rm.tossCoin();
        System.out.println("동전을 던졌을 때의 결과는~~~~~~~~~~~~~~~~");
        System.out.println(coinGame + "입니다!!!!!!!!!!!!");


    }

}
