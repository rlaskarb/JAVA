package com.ohgiraffers.section02.userexception.exception;

// 예외 클래스 만드는 방법. Exception 을 상속 받게 되면
// 사용자 정의의 예외 클래스를 만들 수 있게 된다.
public class NegativeException extends Exception{

    public NegativeException(String message) {
        super(message);
    }

}
