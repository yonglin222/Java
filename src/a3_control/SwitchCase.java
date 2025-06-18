package a3_control;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // switch-case 구문
        // 기본형태
        // switch(비교할값) {
        //     case 값1: 실팽코드 break;
        //     case 값2: 실행코드 break; // 무조건 포함되어야함 의미가 사라짐 / 중괄호를 부수다
        //     default: 실행코드
        // }
        int a=  1;
        switch (a) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("c");
                break;
            default:
                System.out.println("D");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("요일을 입력해주세요: ");
        String day = scanner.nextLine(); // 문자열 유저입력
        switch (day) {
            case "월":
                System.out.println("월요일입니다.");break;
            case "화":
                System.out.println("화요일입니다.");break;
            case "수":
                System.out.println("수요일입니다.");break;
            case "목":
                System.out.println("목요일입니다.");break;
            case "금":
                System.out.println("금요일입니다.");break;
            case "토":
                System.out.println("휴일입니다.");break;
            case "일":
                System.out.println("휴일입니다.");break;
            default:
                System.out.println("올바른 요일을 입력해주세요.");
        }
    }
}
