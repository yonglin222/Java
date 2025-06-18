package practiceproblems;

public class PracticeProblems {
    public static void main(String[] args) {

        System.out.println(2 + 3 / 2); // 3
        System.out.println(10 % 3 + 5 / 3); // 2
        System.out.println((4 + 5 / 2) % 4); // 2

        int a = 5;
        int b = a++;
        System.out.println(a); // 6
        System.out.println(b); // 5
        System.out.println(++a); // 7
        System.out.println(++b); // 6
        System.out.println(a++ + --b);
        // a++(7) + --b(4)
        System.out.println(a + b);
        System.out.println();

        System.out.println(5 & 3);
        System.out.println(5 | 3);
        System.out.println(5 ^ 3);
        System.out.println(~5);
        System.out.println(Integer.toBinaryString(-6));
        System.out.println();

        System.out.println(7 << 2);
        System.out.println(7 >> 2);
        System.out.println(-7 << 2);
        System.out.println(-7 >> 2); // -2
        System.out.println(-1 >>> 30);
        System.out.println(Integer.toBinaryString(-7));
        // 1111 1001 = -7
        // 1111 1110 = -2
        // 11111111 11111111 11111111 11100100
        System.out.println(Integer.parseInt("1001"));
        System.out.println(0b11111111111111111111111111111001); //-7
        // 00111111111111111111111111111110
        System.out.println(0b11111111111111111111111111111110);
        System.out.println(0b1110); // 1110을 아용해서 2진수 끝까지 안쓰고 -2 가 나오게 하는 방법 찾기
        System.out.println();

        System.out.println(3 < 3);
        System.out.println(5 >= 5);
        System.out.println(5 <= 5);
        System.out.println(5== 5);
        System.out.println(5 != 5);
        System.out.println();

        System.out.println(false && true);
        System.out.println((4 <= 4) || (6 < 3));
        System.out.println(false ^ ( 3>= 4));
        System.out.println(!(3 <= 3));
        System.out.println();

        int c = 4, d = 5, e = 6; // 리액트?
        System.out.println(false && c-- > 6); // false // *** 쇼트서킷 발동
        System.out.println(true | d++ > 6); // true || 였으면 쇼트서킬 발동
        System.out.println(true ^ e++ > 6); //
        System.out.println(c); // 4
        System.out.println(d); // 6
        System.out.println(e); // 7
        System.out.println();

        int f = 3;
        f <<= 1;
        System.out.println(f); // 6
        f &= 5;
        System.out.println(f); // 4
        f -= 1;
        System.out.println(f *= 2); // 6
        System.out.println();

        int g = 3;
        int h = 5;
        int i = 7;
        System.out.println((g > h) ? "안녕하세요" : "반갑습니다");
        System.out.println((g < h) ? (h > i) ? "타입 A" : "타입 B" : (h > i) ? "타입 C" : "타입 D");
        // 뎁스 2짜리
        System.out.println();

    }
}
