package a4_method;

public class Mathod1 {
    public static void main(String[] args) {
        // 문자열에서 특정 문자의 위치를 찾는 코드
        String name = "tom";
        char ch = 'a';
        findCharacter(name, ch); // 함수 : 문장안에서 축정 문자를 찾는 함수
        int number = 7345180;
        checkOddEven(number); // 숫자를 주면 짝수인지 홀수인지 알려주는 함수 - 지역변수
        int bigNumber = 1265343;
        int baseNumber = 3;
        // 베이스 숫자의 배수인지 여부를 알려주는 함수
        checkMultipleOf(bigNumber, baseNumber);
    } // 이 중괄호는 main이 사용중

    // 매서드의 위치는 클래스의 자식
    // 다른 매서드안에 만들지 마세요!!
    // 매서드의 기본 형태 :
    // public 리턴형 매서드이름(매개변수1, 매개변수2, ..) {}
    // 매개변수 = 변하는 값 5-6개 까지는 있을수 있음
    // static = 정적 매서드
    // puvlic = 공유
    // void = 비었다
    // ficdCharacter = 낙타형
    // 매서드는 동사로 시작
    public static void findCharacter(String name, char ch) { int index = -1;
        for (int i=0; i<name.length(); i++) {
            //System.out.println(name.charAt(i));
            if (name.charAt(i) == ch) {
                index = i;
                break;
            }
            // if (i == name.length()-1 ) {
        }
        if(index == -1) { // 못찾음
            System.out.println("찾을 수 없습니다");
        }else {
            System.out.println("위치는 = " + index);
        }

    }
    // 숫자를 주면 짝수인지 홀수인지 알려주는 함수
    public static void  checkOddEven(int number) { // 여기에 있는 인트 (넘버) 괄호는 바꿀수 있음
        String str = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
    }
    // 베이스 숫자가 배수인지 여부를 알려주는 함수
    public static void checkMultipleOf(int number, int base) {
        boolean isMultiple = (number % base == 0) ? true : false;
        System.out.println(base + "의 배수 : " + isMultiple);
    }

}
