package a1_type;

public class Example1 {
    public static void main(String[] args) {
        // bate타입의 크기(1바이트)만큼 메모리를 할당받고 그 주소를 a라고 부르고
        // a 위치에 숫자 1을 저장한다.
        byte a = 1;
        byte b = 2;
        System.out.println(b); // 2
        // 바이트 위치는 랜덤 인덱실 목차랑 비슷함 창고 들어가기전에 적힌것처럼 기록됨 진짜 랜덤일까?
        b = 3; // 기존 b의 위치에 3을 덮어쓴다 // 바이트를 쓰면 오류가 나는이유 b라는 자리가 이미 있어서
        // 같은 중괄호에서는 같은이름의 변수를 새로 만들수 없음
        System.out.println(b); // 3
        // byte b = 4; // 에러발생! 같은 이름의 변수를 선얼할 수 없음
        // 사칙연산 (+, -, *아스테리스크, /)
        int c = a + b;
        System.out.println(c); // 4
        System.out.println(a*b); // 3
        System.out.println(a/b); // 0 정수이기 떄문에 바이트 이 떄문에 실수를 표현불가

        // char형은 문자 하나만 저장하고 단 따옴표를 사용한다.
        char ch1 = 'A'; // 문자 하나는 ' 여러문자는 "
        char ch2 = 'B';
        System.out.println(ch1); // A
        System.out.println(ch2); // B
        // 산술연산자 + 떄문에 숫자로 변환하여 덧셈을 수행한다.외부
        System.out.println(ch1 + ch2); // 131 (A = 65, B = 66) 자바는 문자를 숫자로 바꿔야 한다
        // = 개발자의 의도를 명시하지 못했기 때문에 기존 규칙대로 계산함
        // 대소문자 변환 플마32
        // 빈문자열이 포함되면 숫자가 아닌 문자로 인식한다.
        System.out.println("" + ch1 + ch2); //
        // AB = 문자랑, 문자구나 + 문자구나 자바는 숫자로 치환하려고함 그래서 의도가 중요함
        // 단순한 기호 등으로 자바에게 교육할 필요가 있따
        System.out.println("ch1" +
                "ch2");
        // +기호는 문자형 변수를 숫자로 인식하게 한다.
        System.out.println(+ch1); // 65 = +뒤에 나오는것은 숫자다
        System.out.println(+ch1 + +ch2); // 131

        // char name = "steve" // 에러발생
        String name = "steve"; // 문자열운 string으로 생성한다.
        // 대문자는 calls를 의미함 기본자료형은 아니다

        //그럼 숫자를 문자로 치환하는 방법을 사용해서 문자를 쓰면 어떨까 동영상, 이미지는 바이너리로 돼서 앞축 효율이 떨어짐 이미 해놓은거기때문에 ex) mp4
        //? 압축시키는 시간은 얼마나 걸리지

        System.out.println(name); // Steve
        System.out.println(name.length()); // 5
        String str1 = "한글"; // 한 단어당 2바이트 바이트 효율이 않좋은듯?
        System.out.println(str1.length()); // 2

        boolean bool = true; // thur는 참을 의미하는 예약어(키워트). 숫자로는 1
        System.out.println(bool); // thur
        bool = false;
        System.out.println(bool); // false 거짓ㅇ의 의미이고 숫자로는 0
    }
}
