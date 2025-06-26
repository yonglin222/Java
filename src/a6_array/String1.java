package a6_array;

public class String1 {
    public static void main(String[] args) {
        // String 클래스는 문자의 시퀀스, 문자열을 나타내는 객체
        // 공식적으로 배열로 부르지는 않지만
        // 내부적으로 char의 배열 모습을 하고 있음
        // 배열과 유사한 특징을 가지지만 원칙적으로 불변성(immutable)을 가

        // 숫자 -> 문자열(String)
        int a = 10;
        String str1 = Integer.toString(a); // 인티저도 오브젝트 자식 ??? 인티져도 클래스인가?
        System.out.println(str1); // 숫자가 아니라 문자임
        double b = 5.5;
        String str2 = Double.toString(b);
        System.out.println(str2); // 5.5 문자
        boolean c = true;
        String str3 = Boolean.toString(c);
        System.out.println(str3); // true 문자
        // 기본 자료형의 래퍼(Wrapper)클래스 특징!!
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean
        // 모든 기본자료형과 1대1로 대응됨
        // 불변성을 가짐(수정안됨)
        // 생성자를 사용하지 않고 대신 valueOf() 메서드를 사용하여 객체 생성
        // 래퍼클래스를 왜 사용하나?
        // 1) 자료구조중에 높은 성능을 나타내는 컬렉션(리스트, 세트, 맵, 트리..)들은
        //    모두 객체를 저장하도록 설계되어있기 때문에 기본자료형을 다루기 어려움
        //    기본자료형을 래퍼클래스로 감싸서 자료구조에 사용함
        // 2) 유용한 메서드를 제공 : 타입변환, 비교연산등 유용한 메서드를 제공
        //    별도의 외부메서드 없이 내부에 포함된 유용한 메서드를 쉽게 사용 가능
        // 3) 제네릭(Generics) : class MyClass<T> { }
        //    T를 제네릭이라고 부르고 T는 모든 객체를 대표하는 키워드임
        //    T자리에 어떤 클래스도 사용될 수 있도록 다양성을 추가한 문법

        // 문자열 -> 숫자
        int aa = Integer.parseInt(str1);
        System.out.println(aa); // 10 숫자
        double bb = Double.parseDouble(str2);
        System.out.println(bb); // 5.5 숫자
        boolean cc = Boolean.parseBoolean(str3);
        System.out.println(cc);

        // valueOf 를 이용한 타입변환.
        // 래퍼클래스의 생성자를 대신함.
        // 메서드의 반환 결과는 기본자료형이 아닌 래퍼클래스!!!
        Integer aaa = Integer.valueOf(str1);
        System.out.println(aaa); // 10
        Double bbb = Double.valueOf(str2);
        System.out.println(bbb);
        // 일반적인 계산 목적으로 타입변환을 할때는 사용X
        // 컬렉션(리스트,세트,맵,트리..)에 사용할 목적으로 주로 사용O
    }
}
