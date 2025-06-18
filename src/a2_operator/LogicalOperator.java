package a2_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자 (&&, ||(더블파이프), ^, !)
        // 발음은 순서대로 앰퍼샌드/ 파이프/ 캐럭/ 니게이션
        // ampersand, pipe, caret, negation(=not)

        // AND 논리연산자 까다롭다
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false);// false
        System.out.println(true && (5<3)); // false
        System.out.println((5<=5) && (7>2)); // true
        System.out.println();

        //OR 논리연산자 널널하다
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false|| true); // true
        System.out.println(false || false); // false
        System.out.println(false || (5<3));// false
        System.out.println((5<=5) || (7>2)); // true
        System.out.println();

        // NOT
        System.out.println(!true); // flase
        System.out.println(!false); // true
        System.out.println();

        // XOR (exclusive OR 베타적논리합)
        // 두개의 값이 다르면 true(=1), 같으면 false(=0)
        System.out.println(true ^ true); // false
        System.out.println(true ^ true); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); //false

        // 실제예시 1) NOT연산자의 사용법
        // 보통 토글장치를 구형할 때 사용함

        boolean capsButton = false;
         capsButton = !capsButton; // 효율적임
//        if (capsButton == true) {
//            capsButton = false;
//        }else {
//            capsButton = true;


// 실제예시 2) XOR연산자의 사용법
// 기본적인 암호화/ 복호화 구현에 사용됨
// step1 보내렬는 문자와 키를 이진수로 변환
// 보내려는 문자 'A'. 키는 숫자 7
// 0100 0001 = 'A'
// 0000 0111 = 7
// --------------
// 0100 0110 = 암호화된 데이터
// 0000 0111 = 키
// --------------
// 0100 0001 = A

        // ********중요!!!********
        // 쇼트서킷 (Short Circuit)
        // && 순서대로 코드를 수행하고 아닌부분을 발견하면 뒤쪽은 수행할 필요가 없음으로 즉시 짧은길로 이동한다
        // || 반대로하면된다
        // 썜 AND와 OR 논리연산자에 사용됨
        // AND
        // 첫번째 조건이 false면 두번쨰 조건은 실행하지 않음 => 결과는 무조건 false
        // OR
        // 첫번쨰 조건이 true면 두번째 조건은 실행X => 결과는 무조건 true
        int value1 = 3;
        System.out.println(false && ++value1 > 6);
        // 두번째 조건 ++ㅍ민ㄷ1 > 6 을 계산할 필요 없음, 결과는 무조건 false

    }
}
