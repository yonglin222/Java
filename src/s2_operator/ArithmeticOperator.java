package s2_operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // 산술 연산자 (+. -, *, /, %)
        System.out.println(2+3); //5
        System.out.println(8-5); //3
        System.out.println(7*2); //14
        System.out.println(7/2); //3 - int로 인식
        System.out.println(8%5); // 3 - 나머지를 의미
        System.out.println(); // 띄워쓰기 용도

        // 증강연산자 (++, --)
        int value1 = 3; // 4byte에 3을 저장
        System.out.println(value1); // 3
        value1 = value1 + 1; // value1(변수, int, 정수) , 컴퓨터는 오른쪽을 먼저 계산하기
        System.out.println(value1); // 4
        int value2 = 3;
        ++value2; // 앞에 붙인다고 똑같은게 아니다
        System.out.println(value2); // 4

        int value3 = 3;
        int value4 = value3++; // 코드 수행라인이 2개 , 계산진행순서가 아래와 같음
        // ++ 의미는 value3 = value3 + 1
        // == int value4 = value3; // ??? valur4는 왜 업데이트를 안할까
        // value3 = value3 + 1;
        System.out.println(value3); // 4
        System.out.println(value4); // 3

        int value5 = 3;
        int value6 = ++value5; // 코드 수행라인이 2개 , 계산진행순서가 아래와 같음
        // value5 = value5 + 1 //
        // value6 = value5;
        System.out.println(value5); // 4
        System.out.println(value6); // 4

        // 정대 이런짓 하지 말자!!
        int value7 = 3;
        int value8 = 4;
        int value9 = 2 + value7-- + ++value8; // 가독성 않좋음
        int value10 = 7;
        // value9 = 2 + value7 까지 먼저 계산
        // value8 = value8 + 1; // value8 = 5
        // ++value8 같이 앞에 붙으면 value8 먼저 연산하고 식 이어서 연산
        // value9 = 2 + value7 + value8
        // value7 = value7 - 1; // value7 = 2
        // value7-- 같이 뒤에증감연산이 붙으면 마지막에 따로 계산
        System.out.println(value7); // 2
        System.out.println(value8); // 5
        System.out.println(value9); // 10
        value9 = 2 + value7-- + ++value8 + value10++;
        System.out.println(value7); // 1
        System.out.println(value8); // 6
        System.out.println(value9); // 17
        System.out.println(value10); // 8
    }
}
