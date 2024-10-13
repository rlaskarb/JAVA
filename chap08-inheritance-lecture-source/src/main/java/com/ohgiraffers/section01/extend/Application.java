package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {

        /* title. 상속에 대해 이해할 수 있다. */

        /* comment.
        *   상속은 현실 세계의 상속과 비슷한 개념이다.
        *   부모가 가지고 있는 멤버(필드, 메소드) 를 자식이 물려 받는
        *   의미를 가지고 있다. 클래스 또한 부모 클래스와 자식 클래스로
        *   나뉘어 부모가 가지는 멤버를 자식이 물려 받아
        *   마치 자신의 것처럼 사용하는 것을 의미한다.
        *
        *  comment.
        *   단순히 부모의 것을 사용하는 것 뿐만 아니라,
        *   물려받은 멤버를 확장 하거나, 추가적인 멤버를 작성하는 것도
        *   가능하다.
        *   특히 메소드 재정의(overriding) 라는 기술을 통해
        *   부모가 가진 메소드를 자식이 다시 정의하는 것이 가능하다.
        *  */

        /* comment.
        *   Overriding 이란
        *   메소드를 재정의
        *   부모가 가지는 메소드 선언부를 그대로 사용하면서
        *   자식 클래스가 정의한 메소드 대로 동작할 수 있도록
        *   구현 몸체(영역) 을 새롭게 다시 작성을 한 것이다.
        *   메소드를 재정의하게 된다면 재정의한 메소드가 우선 동작을 한다.
        *  */

        /* comment.
        *   이렇게 우리가 상속이라고 하는 기술을 사용하게 되면 얻는 장점
        *   1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용 할 수 있다.
        *       1-1. 재사용 시 생산성을 크게 향상 시킬 수 있다.(새롭게 작성 안 해도 됨)
        *       1-2. 공통적으로 사용하는 코드가 부모클래스에 존재하게 되면
        *            수정사항이 생길 시, 부모 클래스만 수정을 해도 전체적으로 사용 가능(유지보수성 증가)
        *   2. 클래스 간의 계층 관계가 생기며 다형성 문법의 토대가 된다.
        *
        *  comment.
        *   하지만 상속으로 인한 단점 존재
        *   1. 부모클래스의 기능을 추가/변경 할 시 자식클래스가 정상적으로 동작하는 지 예측 어려움.
        *      상속 구조가 복잡해 질 수록 그 영향에 대한 예측이 힘들어지며
        *      이런한 복잡한 구조는 오히려 유지보수성을 악화 시킬 수 있다.
        *   2. 또한 부모 클래스의 변경이 쉽지 않다. 자식클래스에서 중요하게 사용하고 있는
        *      부모의 메소드를 수정할 시 자식 클래스에 모두 영향을 미칠 수 있다.
        *   3. 부모클래스에서는 의미 있는 기능이 자식에겐 무의미할 수 있다.
        *  */

        /* index. 1. Car 인스턴스 생성 후 메소드 호출 */
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println("===========================");

        /* index. 2. FireCar 인스턴스 생성 */
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

//        fireCar.isRunning();

        /* index. 3. 소방차 너무 재미없게 경적을 울린다..
        *   그리고 소방차는 물을 뿌리는 기능도 있으면 좋지 않을까?
        */
        /* comment. 상속은 물려받는 받는 것 뿐만 아니라 확장도 할 수 있다. */
        fireCar.sprayWater();

        System.out.println("=======================================");

        /* index. 4. 경운기 만들기. -> 경적이 없는 차 */
        FarmCar farmCar = new FarmCar();
        farmCar.soundHorn();
        farmCar.run();
        farmCar.soundHorn();

    }

}
