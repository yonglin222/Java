package a8_modifier.Static;

class A {
    int m = 3;
    static int n = 5; // 스태틱 필드(=정적필드) // Class<A> n = 5
}

public class Static1 { // ???스태틱 영억 저장위치 심화공부 필요
    /* 정적필드의 특징
        - 정적필드는 Heep의 정적영역에 생성됨
        - 생성시점은 main()메서드가 실행되기 이전 ???
        - 정적필드의 값은 오직 정적역역에만 존재하고 객체는 그 위치를 참조
        - 1) 정적필드(static field)는 전체 애플리케이션에서 유일한 값을 가지고
        - 2) 객체를 생하지 않아도 읽거나 수정 가능 (클래스명.정적필드)
     */
    public static void main(String[] args) {
        A a1 = new A(); // 인스턴스화, 객체화 -> m=3, n = (스태틱영역의 n=5)
        A a2 = new A(); // 이렇게 하면 어떻게 되?
        int a3 = 5;
        System.out.println(a1.m); // 3
        System.out.println(a1.n); // 5

        // 정적필드 직접 읽기
        // System.out.println(A.m); // 오류
        System.out.println(A.n); // 5

        // 정적필드 수정 (스태틱영역)
        A.n = 6;
        System.out.println(a1.n); // 6
        System.out.println(A.n); // 6
        // Class A -> A반이라는 교실
        //

//        A a2 = new A(); // 인스턴스화, 객체화 -> m=3, n = (스태틱영역의 n=6)
        System.out.println(a2.n); //
        a2.n = 7; // 스태틱영역의 n=6
        System.out.println(a2.n); // 7
        System.out.println(a1.n); // 7
        System.out.println(A.n); // 7
    }
}
