package a1_type;

public class TypeChange1 {
    public static void main(String[] args) {
        // 타입캐스팅 앞에다가 내가 원하는 데이터 타입을 소괄호를 이용하여 표현한다
        int value1 = (int)5.99;
        System.out.println(value1); // 5
        long value2 = (long)10; // 명시적으로 타입변환을 써주는게 좋다.
        long value2_1 = 10L; // 이 방법이 더 명시적으로 좋다.
        System.out.println(value2); // 10
        float value3 = (float)5.8;
        float value3_1 = 5.8F;
        // 오류 float value3_1 = 5.8; // 소수정은 기본으로 더블로 인식하기 때문에 F를 붙혀야한다
        System.out.println(value3); // 5.8
        double value4 = (double)10;
        double value4_1 = 10D;
        System.out.println(value4); // 10.0

    }
}
