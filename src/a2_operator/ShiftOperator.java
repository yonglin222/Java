package a2_operator;

public class ShiftOperator {
    public static void main(String[] args) {
        // 시프트 연산자
        // >>, <<, >>>
        System.out.println(2 << 1); // 4
        // 0000 0010
        // << 1 = 0000 0100
        System.out.println(4 << 1); // 8
        // 0000 1000 = 8
        System.out.println(4 >> 1); // 2
        // 0000 0010 = 2
        System.out.println(2 >> 1); // 1
        // 0000 0001 = 1
        System.out.println();
        System.out.println(3 << 1); // 0000 0110 = 6
        System.out.println(3 << 2); // 0000 1100 = 12
        System.out.println();
        System.out.println(3 << 3); // 0001 1000 = 24
        System.out.println(Integer.toBinaryString(3));
        System.out.println(0b11000);
        System.out.println();
        System.out.println(-3 << 1); // 0000 0110 = -6
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(0b11111111111111111111111111111010);
        System.out.println(-3 << 2); // 0000 1100 = -12
        System.out.println(-3 << 3); // 0001 1000 = -24
        System.out.println();
        // << 왼쪽 시프트는 2의제곱승을 곱하는 것과 같다
        // >> 오른쩍 시프트는 2의 제곱승을 나누는 것과 같다
        // 곱셈과 나눗셈의 계산을 매우 빠르게 할 수 있음.
        // 2진수 자리이동으로 계산이 가능하다면 쉬프트를 이용하자

        System.out.println(5 >> 1); // 2
        System.out.println(-5 >> 1); // -3
        // >>는 오른쪽 비트값이 삭제되므로 정확한 계산이 불가능!
        // 점밀한 나누기 계산이 필요한 곳에는 시프트 연산 대신 나누기를 사용해야함!
        // 컴퓨터가 덧샘뺄샘을 하는방법은 하나다 곱셉은 따로있다 나누기도 따로있다(오래걸림)
        // ??? 왜 더 느려지는가 왜 더 많이하는가 어떻게 계산하길래 ???
        // 우리가 10진수를 사용하는 이유 손가락이 10개라서 (내 생각임)
        // 쉬프를 사용할수 있으면 이것으로 계산하는게 빠르다

        System.out.println(Integer.toBinaryString(-3));
        System.out.println(-3 >> 2);
        // 11111111 11111111 11111111 11111101 = -3
        // 11111111 11111111 11111111 11111111 = -1
        // >> 오른쪽 산술시프트는 부호(양수, 음수)비트를 그대로 유지하기 때문에
        // 음수의 경우에는 왼쪽자리를 1로 채우고
        // 양수의 경우에는 왼쪽자리를 0으로 채운

        //>>> 논리 시프트는 부호비트를 유지하지 않는 특징을 가지므로
        // 왼쪽자리를 그냥 0으로 채운다
        System.out.println(-3 >>> 2); //
        // 11111111 11111111 11111111 11111101 = -3
        // 00111111 11111111 11111111 11111111 = 1,073,741,823

        // <<, >>의 산술시프트와 >>>논리시프트는 왜 사용할까?
        // 1) 산술시프트는 2의 제곱승의 계산에 자주 사용됨
        // 2) 비트마스크(bit mask)에 사용됨
        // 7654  3210 : 비트위치
        // 1000 1001 : 137
        System.out.println(Integer.parseInt("10001001" ,2)); // 137
        // 기계가 3번째자리으 ㅣ문이 열려있는지의 여부만 확인하고 싶을때?
        // 1000 1001 = 137
        // 0000 1000 = mask // 마스크 만드는연산 시프트
        //----------------- & 연산
        // 0000 1000 = 마스크와 같은 값(0이 아닌 값)이 나오면 해당 위치가 1이라는 뜻
        int value = 137; // 1000 1001
        int mask = 1 << 3; // 3번째 위치를 확인하기 위해 3을 시프트연산함
        System.out.println(value & mask); // 8 (0이 아니면 해당 위치가 1일)
        mask = 1 << 2; // 2번째 위치 확인
        System.out.println(value & mask); // 0 (해당 위치가 0이라는 뜻)
        // 마스크를 통해서 특정 비트의 위치의 값을 확인할 수 있음
        // 이를 이용하여 다양한 flag의 세팅값을 확인하는데 사용한다.
        // boolean타입에 비해 8배가 메모리 효율이 좋다(==관리가 용이하다)
        // ??? 오직 하나만 1 특정비트 하나만 확인하고 싶을때 이 방법을 사용한다
    }
}
