package jini;

class A {
    void print() {
        System.out.println("A 클래스");
    }
}

class B extends A {
    // A의 print() 메서드를 B 클래스에서 재정의(오버라이딩)함
    @Override
    void print() {
        System.out.println("B 클래스");
    }
}

public class Mamo {
    public static void main(String[] args) {
        A value1 = new A();
        B value2 = new B();
        A value3 = new B(); // 업캐스팅
        value1.print();

    }
}
