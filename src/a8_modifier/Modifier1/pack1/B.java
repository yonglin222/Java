package a8_modifier.Modifier1.pack1;

public class B {
    public void print() { // 필드 없음
        // A클래스를 객체화
        A a = new A();
        System.out.print(a.a + " ");
        System.out.print(a.b + " "); // 상속한다가 뭐지???
        System.out.print(a.c + " ");
        // System.out.print(a.d + " "); // private 다른 클래스에서 접근 불가
        System.out.println();
    }
}
