package a8_modifier.Static;

class B { // 정역영역 생성 class B
    int a; // 인스턴스 필드
    static int b; // 정적필드(=스태틱필드)
    static void method() { // 정적필드에 생성
        System.out.println("정적메서드");
//        System.out.println(a); // 오류 (정적영역에는 a가 존재X)
        System.out.println(b);
        // <중요> 정먹메서드는 클래스내의 정적필드만 참조할 수 있음
        // 클래스 상태를 처리하는데 적합하지 않음!!
    }
}

public class Static2 {
    // 정적메서드 (Static method)
    // 사용이유는 ?
    // 객체생성없이 바로 메서드를 호출하기 위해서 사용
    // 예) 원의 면적구하는 메서드, 주어진 배열을 정렬하는 메서드
    // 특정클래스의 상태오 유관한 메서드(원급을 계산하는 메서드)는 정적으로 만들지 않음 ex)???
    // 클래스의 상태와 무관하게 주어진 매개변수만 처리하는 형태의 메서드는 정적으로 만들 수 있음
    public static void main(String[] args) {
        // 정적메서드는 객체를 생성해서 호출할 수 있지만 권장X
        // 올바른 사용법
        B.method(); // 정적메서드 호출
        // 권장X
        B b = new B();
        b.method();
    }
}
