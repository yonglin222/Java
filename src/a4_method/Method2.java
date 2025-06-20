package a4_method;

public class Method2 {
    public static void main(String[] args) { // 실행순서 //@1
        //리텬형이 있는 함수(=매서드)
        // 리턴형은 매서드가 실행 결과로 반환하는 값의 자료형이다.
        // (a + b) * c 를 수행하는 경우, +를 수행하는 함수와 *를 수행하는 함수로
        // 나눠서 구현한다면, plus함수와 multiply함수가 필요
        int a = 3; // @2
        int b = 5; //@3
        int c = 10; //@4
        int value = plus(3,5); // 함수의 계산 결과를 변수에 저장함 //@5
        multiply(value, c); // 저장한 계산결과를 다른 하뭇가 이용할 수 있음
    }

    public static int plus(int a, int b) { // 메타스페이스 plus(a, b)
        int result = a +b;
        return result; // 리턴 후 플러스 변수 삭제
    }
    public static void multiply(int x, int y) {// 메타스페이스 multiply(value, c) // 보이드형 리턴형이 없다
        int result = x * y;
        System.out.println(result); // 이거 main 매서드 영역에 써ㅏㄷ 똑같은 값 나오게 할수 있을까???
    }
}
