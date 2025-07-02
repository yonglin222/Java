package a8_modifier.Modifier1.pack2;

import a8_modifier.Modifier1.pack1.A; // 임포트로 A읽을수 있음

public class D extends A { // A클래스 상속받음
    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " "); // protected 상속받았으므로 접근 가능
        //System.out.print(c + " "); // default 외부패키지이므로 접근 불가
        //System.out.print(d + " "); // private 외부클래스이므로 접근 불가
        System.out.println();
    }
}
