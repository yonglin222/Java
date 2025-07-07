package jini;

// '붕어빵 틀'에 해당하는 클래스를 설계합니다.
public class Bungoppang {
    // 이 붕어빵 객체가 가질 '속성'을 정의합니다. (필드)
    String filling; // 모든 붕어빵은 '속재료(filling)'를 가집니다.

    // '붕어빵을 찍어내는 기계'인 생성자를 설계합니다.
    // - 생성자의 이름은 클래스 이름(Bungoppang)과 반드시 같아야 합니다.
    // - 생성자는 리턴 타입이 없습니다.
    public Bungoppang(String newFilling) { // '팥'이나 '슈크림' 같은 재료(인수)를 받을 투입구(매개변수)입니다.

        // 'this'는 "지금 이 틀로 만들어지고 있는 바로 그 붕어빵 객체"를 의미합니다.
        // "이 붕어빵(this)의 속재료(filling)는 방금 투입구로 들어온 재료(newFilling)로 채워라" 라는 뜻입니다.
        this.filling = newFilling;

        // 붕어빵이 완성되었음을 알리는 메시지를 출력합니다.
        System.out.println(this.filling + " 붕어빵이 만들어졌습니다!");
    }
}
/* 붕어빵을 팔아보자
클래스 설계 -> 필드 정의 -> 생성자 설계
 */