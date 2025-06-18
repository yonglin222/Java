package practiceproblems;

public class Switch {
    public static void main(String[] args) {
        // Q2
        // switch case문은 범위조건을 구현하기에 적합하지 않음
        // 그래서 점수를 10을 나눠서 앞자리로 구분하는 방법을 사용
        //     case 값1: 실행코드 break;
        //     case 값2: 실행코드 break; // 무조건 포함되어야함 의미가 사라짐 / 중괄호를 부수다
        //     default: 실행코드 switch(비교할값) {
        int score = 72;
        switch (score/10) {
            case 9, 10:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            default:
                System.out.println("F학점");
        }

        // if문의 기본형태3 : if() {} else if() {} else {}
        if(80 <= score && score < 90) {
            System.out.println("B학점");
        }else if(score >= 90) {
            System.out.println("A학점");
        }
        else if(70 <= score && score < 80) {
            System.out.println("C학점");
        }
        else {
            System.out.println("F학점");}
    }
}
