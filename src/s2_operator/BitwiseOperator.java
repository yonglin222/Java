package s2_operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        // 비트를 다루는 연산 // 속도, 메모리 효율 // 인공위설만들때 중요 // 비트단위를 이해하면 더 쓸모있는 내가 된다
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // 1101 - 2진수
        System.out.println(Integer.toOctalString(data)); // 15 - 8진수
        System.out.println(Integer.toHexString(data)); // d - 16진수
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // 13
        System.out.println(Integer.parseInt("15", 8)); // 13
        System.out.println(Integer.parseInt("d", 16)); // 13
        System.out.println();

        System.out.println(13); // 13
        System.out.println(0b1101); // 13 이진수를 표기할 때는 0b를 붙인다
        System.out.println(015); // 13 8진수를 표기할때는 0 으르 붙인다
        System.out.println(0xd); // 13 16진수를 표기할때는 0x를 붙인다
        System.out.println();

        // &
        // 논리연산자(&&)와 다르게 & 한개를 사용한다
        // 두개의 비트가 모두 1인 경우에만 결과가 1
        System.out.println(3 & 10); // 2
        // 0000 0011 = 3
        // 0000 1010 = 10
        // --------------
        // 0000 0010 = 2

        // |
        // 두 비트중 한개만 1이어도 결과가 1
        System.out.println(3 | 10); // 11
        // 0000 0011 = 3
        // 0000 1010 = 10
        // --------------
        // 0000 1011 = 11

        // ^
        // 두 비트가 다르면 1, 같으면 0
        System.out.println(3 ^ 10); // 9
        // 0000 0011 = 3
        // 0000 1010 = 10
        // --------------
        // 0000 1001 = 9

        // ~ 비트연산자의 NOT은 논리연산자(!)와 다름
        // 모든 비트(부호비트 포함)의 값을 반대로 바꿈
        // 컴퓨터가 2진수로 음수로 사용하기 위한
        System.out.println(~3); // -4
        // 0000 0011 = 3
        // 1111 0011
        // --------------
        // 1111 1100 = -4
        // ~ 연산자는 컴퓨터의 음수표현에 사용됨
        // N의 음수는 ~N + 1로 계산 가능하다 (=2
        System.out.println(Integer.toBinaryString(-3)); // 1111 1101

    }
}
