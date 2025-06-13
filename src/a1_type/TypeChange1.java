package a1_type;

public class TypeChange1 {
    public static void main(String[] args) {
        // 타입캐스팅 앞에다가 내가 원하는 데이터 타입을 소괄호를 이용하여 표현한다
        int value1 = (int)5.99;
        System.out.println(value1); // 5
        long value2 = (long)10; // 명시적으로 타입변환을 써주는게 좋다.
        long value2_1 = 10L; // 이 방법이 더 명시적으로 좋다.
        System.out.println(value2); // 10

    }
}
