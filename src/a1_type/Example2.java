package a1_type;

import java.sql.SQLOutput;

public class Example2 {
    public static void main(String[] args) {
        // 정수형 변수 생성 연습
        byte a = 127;
        short b = 32767;
        int c = 2147483647; // 이게 기본형
        long d = 1000000L; // 더 큰녀석은 특별한 표시 필요 없음 // 뒤에 l 또는 L을 명시적으로 붙이기도 한다.
        // 실수형
        // 실수형의 기본형은 double이므로 f 또는 F를 뒤에 붙여야 한다.
        float e = 30.5F;
        double f = 3.144372894732d;
        // 문자형
        char g = 'A';
        String h = "안녕하세요"; // 참조자료형
        //불리언형
        boolean i = false;

        // 진법에 따른 표기법 연습 (10진법, 2진법, 16진법)
        System.out.println(c); // 1000
        c = 15; // 10진법
        System.out.println(c); // 15
        c = 0b1111; // 2진법
        System.out.println(c); // 15
        c = 0xf; // 16진법
        System.out.println(c); // 15

    }
}
