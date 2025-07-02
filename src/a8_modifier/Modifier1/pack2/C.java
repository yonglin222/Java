package a8_modifier.Modifier1.pack2;

import a8_modifier.Modifier1.pack1.A;

public class C {
    public void print() { // 필드없음
        // A클래스를 얼마나 쓸수있는가
        A a = new A();
        System.out.print(a.a + " ");
        //System.out.print(a.b + " "); // protected 외부패키지 read/write불가
        //System.out.print(a.c + " "); // default 외부패키지 read/write불가
        //System.out.print(a.d + " "); // private 외부클래스 read/write불가
        System.out.println();
    }
}
