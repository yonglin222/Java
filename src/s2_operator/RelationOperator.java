package s2_operator;

public class RelationOperator {
    public static void main(String[] args) {
        // 비교연산자 (<, >. >=. ?=. ==. !=)
        // 반드시 그 결과가 참 또는 거짓으로 나오는 연산자.
        System.out.println(5<2); // == false
        System.out.println(5>2); // true
        System.out.println(5<=5); // true
        System.out.println(5>=5); // true
        System.out.println();

        // 변수를 이용한 비교연산자 표현
        int a = 5;
        int b = 2;
        int c = 5;
        System.out.println(a==b); //false
        System.out.println(a!=b); // true
        System.out.println(a==c); // true
        System.out.println(a!=c); // false
        System.out.println();

        //스트링(참조자료형 = 힙에 만들어지는 메모리 저장소)영어1byte, 한글2byte
        // 중요!! 참조자료형의 특징! 참조비교
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2); // false
        // 참조자료형에서==는 문자열의 값을 비교하는게 아님
        System.out.println(str1 == str1); // true
        System.out.println(str1.equals(str2)); // true
        // epuals: 힙에 있는 데이터 비교
        // ==: 스택에 있는 테이터 비교

        // 리터럴 방식의 문자열 생성과 비교
        String str3 = "Hello"; // 이걸로 인해 메타스페이스에
        String str4 = "Hello";
        System.out.println(str3 == str4); // true
        // 메타스페이스 일부가 리터럴영역이라고 있음( 공통사용공간이라 안지워짐)
        //??? 메타스페이스에 데이터는 얼마나 큰가?

        int x;
        String str;
        str = new String("");
        str = "steve"; // new 없이 힙에 메모리를 가져올수 있는 유일한 참조자료형

        RelationOperator aaa = new RelationOperator(); //???

        // 참조값의 복사 후 비교
        String str5 = new String("안녕");
        String str6 = str5;
        System.out.println(str5 = str6); // true - 스택에 저장된 값이 같아서 같은거임
        //??? 스택을 변환시키는 문자도 있을까

        int x1 = 5;
        int y = x1; // 값을 그대로 복사

    }
}




















