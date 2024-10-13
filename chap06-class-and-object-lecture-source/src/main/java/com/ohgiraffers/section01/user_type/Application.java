package com.ohgiraffers.section01.user_type;

public class Application {

    public static void main(String[] args) {

        /* title. 클래스가 무엇인지 이해할 수 있다. */

        /* comment.
        *   지금까지 우리는 자바에서 제공하는 자료형을 다루어 보았다.
        *   ex) int, char, String , double[] 등등
        *   회원 정보를 관리하기 위해 (아이디, 비밀번호, 이름, 나이, 성별, 취미들)
        *   지금까지 배운 내용으로 값을 넣고 출력을 해보자.
        *  */

        /* index. 1. 변수를 이용한 회원 관련 데이터 처리 */
        String id = "user01";
        String pwd = "pass01";
        String name = "조평훈";
        int age = 20;
        char gender = '남';
        String[] hobbies = new String[] {"야구", "코딩", "누워있기"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
//        System.out.println("hobbies = " + hobbies);
        System.out.print("hobbies : ");
        for(int i = 0; i < hobbies.length; i++) {
            System.out.print(hobbies[i] + " ");
        }
        System.out.println();

        /* comment.
        *   이렇게 각기 다른 변수로 데이터를 관리하게 되면 여러 가지 단점이 있다.
        *   1. 변수명을 다 알아야 한다.
        *   2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 한다면
        *      너무 많은 값을 전달인자로 보내야 해서 한 눈에 안 들어온다.
        *   3. 리턴은 1개의 값만 가능하기 때문에 회원 정보를 묶어서
        *      리턴 값으로 사용할 수 없다 WHY? 서로 다른 자료형 이기 때문에!!
        *  */

        /* index. 2. 사용자 정의의 자료형 사용하기. */
        /* index. 2-1. 변수 선언 및 객체 생성 */
        /* comment.
        *   클래스 변수명 = new 클래스명();
        *   - 위에 구문은 객체(instance) 를 만드는 구문이다.
        *   - ex) int[] arr = new int[5];
        *   클래스는 사용자 정의의 자료형이 되며, 클래스가 가지고 있는
        *   변수 or 메소드를 사용하기 위해서는 new 할당 연산자로
        *   heap 메모리 공간에 할당을 해야 한다.
        *  */

        Member member = new Member();


        /* index. 2. 생성된 인스턴스(객체)의 초기값 확인하기 */
        /* comment.
        *   우리가 Member 클래스에 작성한 전역변수(필드)에 접근하기 위해서는
        *   레퍼런스변수명.변수명 <- 이 방법으로 접근 할 수 있다.
        *   '.' 은 참조연사자 라고 하는데, 레퍼런스 변수가 참조하고 있는(주소를 가르키는)
        *   곳으로 접근한다 라는 의미이다.
        *  */

        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobbies : " + member.hobbies);

        /* index. 2-3. 필드(전역변수)에 접근해서 변수처럼 사용해보기 */
        member.id = "user02";
        member.pwd = "pass02";
        member.name = "조평순";
        member.age = 20;
        member.gender = '여';
        member.hobbies = new String[] {"야구", "코딩", "누워있기"};

        System.out.println("변경 후 member.id : " + member.id);
        System.out.println("변경 후 member.pwd : " + member.pwd);
        System.out.println("변경 후 member.name : " + member.name);
        System.out.println("변경 후 member.age : " + member.age);
        System.out.println("변경 후 member.gender : " + member.gender);
        System.out.print("변경 후 member.hobbies : ");
        for (int i = 0; i < member.hobbies.length; i++) {
            System.out.print(member.hobbies[i] + " ");
        }
        System.out.println();

    }

}
