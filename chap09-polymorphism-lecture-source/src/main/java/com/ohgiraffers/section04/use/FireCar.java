package com.ohgiraffers.section04.use;
// 경적도 울릴 수 있고, 차에 기본적인 기능도 수행할 수 있다.
public class FireCar extends Car implements SoundHorn{
    @Override
    public void go() {
        System.out.println("소방차가 달려갑니다~~~~~~~~~");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다~~~~~~~~~~~~~");
    }

    @Override
    public void horn() {
        System.out.println("빠아앙~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
