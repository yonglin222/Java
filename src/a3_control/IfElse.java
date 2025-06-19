package a3_control;
import java.util.Scanner; // 외부라이브러리를 사용하려면 먼저 import해야 함

public class IfElse {
    public static void main(String[] args) {
        // if조건문(선택제어문) if () {} else {}
        int a = 10;
        // if문의 기본형태1 : if() {}
        if (a>5) { // 조건이 거짓이면 실행되는 코드가 없음
            System.out.println(a);
        }
        // if문의 기본형태2 : if() {sout()} else {sout()}
        if (a>5) {
            System.out.println(a);
        }else {
            System.out.println("조건은 거짓");
        }
        // if문의 기본형태3 : if() {} else if() {} else {}
        // 나이를 입력하면 연령대를 출력하는 조건문
        // 나이 입력을 동적(=유저입력)으로 하기 위해 외부라이브러리가(코드덩어리) 필요함!
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력해주세요: ");
        int userAge = scanner.nextInt(); // 예외처리 필수 = 개발자가 의도한 상황이 아닌것//최소화 설계필요
        if (userAge >= 20 && userAge <= 29) {
            System.out.println("20대");
        }
        else if (userAge >= 30 && userAge <= 39) {
            System.out.println("30대");
        }
        else if (userAge >= 40 && userAge <= 49) {
            System.out.println("40대");
        }
        else {
            System.out.println("나머지");
        }
        scanner.nextLine(); // Scanner가 가지고 있는 엔터버퍼를 비워주는 역할
        // 엔터버퍼 : ???
        // 하드코딩 : 내 수정 없이 바뀔수 없음
        // 동적코드 필요 = 유저가 나이 입력하게 만들어야함 = ui

        // 숫자입력은 되나 (혼자 연습)
//        System.out.println("한번더 입력해주세요: ");
//        String userName = scanner.nextLine();
//        System.out.println();

        // 이름 입력
        System.out.println("이름을 입력해주세요: ");
        String userName = scanner.nextLine(); // 엔터입력 이후에 라인 전체를 받는다
        System.out.println(userName);
        System.out.println("end");
        System.out.println();
        scanner.close(); // 스캐너 객체를 메모리에서 삭제시킴
    }
}
