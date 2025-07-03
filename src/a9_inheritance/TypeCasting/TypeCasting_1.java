package a9_inheritance.TypeCasting;

class A {
    int a = 3;
    void methodA() {
        System.out.println("A 클래스");
    }
}
class B extends A {
    int b = 4;
    void methodB() {
        System.out.println("B 클래스");
    }
}

public class TypeCasting_1 {
    public static void main(String[] args) {
        // #1. A타입
        A value1 = new A(); // 스택 <- A value1 =, 힙 <- a=3
        System.out.println(value1.a); // 3
        value1.methodA(); // A 클래스 // 힙 <- methodA()
        
        // #2. B타입
        B value2 = new B();
        // 스택 <- B value2 = 힙에 B메모리 위치
        // 힙 <- B
        // 힙 <- A a = 3, methodA()
        // 힙 <- b = 4, methodB()
        System.out.println(value2.a); // 3
        System.out.println(value2.b); // 4
        value2.methodA(); // A 클래스
        value2.methodB(); // B 클래스

        // #3. B->A 업캐스팅
        A value3 = new B();
        // 스택 <- A value3 = B메모리를 새로 생성하고 거기안에 있는 A의 위치
        System.out.println(value3.a); // 3
        // System.out.println(value3.b); // 오류 b를 참조할 수 없음.
        // 업캐스팅으로 B객체내의 A영역을 참조하게되어서 b를 읽을 수 없음.
        value3.methodA(); // A 클래스

        // #4. A->B 다운캐스팅
        B value4 = (B)value3;
        // 스택 <- B value4 = (새로만든 B 위치 저장)
        // ~~~~
        System.out.println(value4.a); // 3
        System.out.println(value4.b); // 4
        value4.methodB(); // B 클래스
    }
}








