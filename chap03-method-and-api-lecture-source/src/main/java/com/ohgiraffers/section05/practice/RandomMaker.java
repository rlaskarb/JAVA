package com.ohgiraffers.section05.practice;

import java.util.Random;

public class RandomMaker {

    public int randomNumber(int min, int max) {

        Random random = new Random();

        int result = random.nextInt(max - min + 1) + min;

        return result;

    }


    public String rockPaperScissors() {

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String result = (randomNumber == 0) ? "가위" : (randomNumber == 1) ? "바위" : "보";

        return result;
    }

    public String tossCoin() {

        Random random = new Random();
        int coin = random.nextInt(2);

        String result = (coin == 0) ? "앞면" : "뒷면";

        return result;
    }
}
