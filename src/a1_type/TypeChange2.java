package a1_type;

public class TypeChange2 {
    public static void main(String[] args) {
        // 비명시적인 타입면환 = 자동 타입변환 // 업캐스팅
        float value1 = 3;
        System.out.println(value1); // 3.0
        long value2 = 5;
        System.out.println(value2); // 5
        double value3 = 7;
        System.out.println(value3); // 7.0

        // 조금 다른 공식 !! 결정적인 차이가 있다 // 다운캐스팅
        byte value4 = 127;
        byte value4_1 = (byte)128; // 오류! 서큘러 구조떄문
        System.out.println(value4); // 127
        System.out.println(value4_1); // -128 오류
        int value5 = (int)3.5; // 소수점이하자리를 없앨 목적으로 사용함
        System.out.println(value5); // 3

        // 롱과 픗록의 관계
        //? 압축할때는 플롯을 이용하나요?/ 게임할때는 플롯을 많이 씀

        /* 여러줄 주석처리
        1) 업캐스팅 (가용숫자 범위가 작은 타입에서 큰 타입으로의 변황)
        byte < shout < int < long < float < douvle
        : 일반적으로 안전하며 자동으로 타입변황이 발생함!
        (주의) float의 경우에는 값에 오류가 발생할 가능성이 있음. double 사용 권장
        2) 다운캐스팅 (업캐스팅의 반대)
        : 일반적으로 자동 타입변환이 안됨.
        : 명시적인 타입변환이 요구되나 오류의 가능성이 높음.
        */
    }
}
