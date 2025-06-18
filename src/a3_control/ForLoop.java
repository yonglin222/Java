package a3_control;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{ // 예외처리
        // 반복 제어문
        // For
        // 기본형태
        // for (초기식; 조건식(변수); 증감식) {//숫자를 세기ㅇ
        // 실행문구
        // }
        for (int i=0; i<10; i++) {
            System.out.print(i); // 거짓일때만 실행하는건 없나 // 이게 횟수만큼 나와야함
        }
        // System.out.println(i); // 이거는 왜 안되는거임
        System.out.println("반복끝");
        System.out.println();

        for (int i=10; i>0; i--) {
            System.out.print(i);
        }
        System.out.println("반복끝");

        // 컴파일 에러가 발생하지 않지만 무한루프에 빠지게 되므로 사용X
        // 무한루프를 설계해도 적절한 Sleep과 리소스 관리를 동반하면 문제없음!!
//        for ( ;; ) {
//            System.out.println("무한루프");
//        }
        // 안전한 무한루프
//        Scanner scanner = new Scanner(System.in);
//        for ( ; ; ) {
//            System.out.println("유저 입력 대기중: ");
//            String userInput = scanner.nextLine();
//            System.out.println(userInput);
//            if (userInput.equals("exit"))  {
//                break;
//            }
//            Thread.sleep(1000);
//        }
//        System.out.println("무한루프 탈출");

        // 증감식의 변화 (2씩 증가)
        for (int i=0; i<10; i=i+2) {
            System.out.print(i);;// 0 2 4 6 8 // 8은 따로 ln붙이여서 반복끝 아래줄로 내리려면 어떻게 하나요???
        }
        System.out.println("반복끝");

        // iterator(=반복자)여러개인 경우
        for (int i=0, j=0; i<10 && j<10; i++, j++) {
            System.out.println(i + " " + j);
        }
    }
}
