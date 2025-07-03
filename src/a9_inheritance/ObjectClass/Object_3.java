package a9_inheritance.ObjectClass;

class C {
    String name;
    C(){}
    C(String name){ this.name = name; }
}
class D {
    String name;
    D() {}
    D(String name) { this.name = name; }
    @Override
    public boolean equals(Object obj) {
        return this.name == ((D)obj).name ? true : false;
    }
    //              (모든클래스의 모든 객체 사용 가능)다운캐스팅 할 일 없으면 사용해도 안전함 {바꿀수있는지 확인하고 바꾸자 오류조심}
}

public class Object_3 {
    public static void main(String[] args) {
    // Object클래스의 equals메서드와 오버라이드한 메서드의 차이 예제
        C c1 = new C("Hello");
        C c2 = new C("Hello");
//        C c2 = c1; // ture
        System.out.println(c1 == c2); // false
        System.out.println(c1.equals(c2)); // false
        D d1 = new D("Hello");
        D d2 = new D("Hello");
        System.out.println(d1 == d2); // false
        System.out.println(d1.equals(d2)); // true
    }
}






