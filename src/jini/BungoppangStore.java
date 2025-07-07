package jini;

// 붕어빵 가게를 열어서, 위에서 만든 붕어빵 틀을 사용하는 클래스입니다.
public class BungoppangStore {
    public static void main(String[] args) {
        // 'new' 키워드로 붕어빵 틀(생성자)을 호출하여 실제 붕어빵(객체)을 만듭니다.
        // "팥"이라는 재료를 생성자에 전달합니다.
        Bungoppang bbung1 = new Bungoppang("");

        // "슈크림"이라는 재료를 생성자에 전달하여 또 다른 붕어빵을 만듭니다.
        Bungoppang bbung2 = new Bungoppang("슈크림");

        System.out.println("--- 붕어빵 완성! ---");

        // 완성된 붕어빵 객체의 속성을 '.'을 이용해 확인합니다.
        // "bbung1 포장지에 담긴 붕어빵의 속재료는 무엇인가요?"
        System.out.println("첫 번째 붕어빵의 속은 " + bbung1.filling + "입니다.");

        // "bbung2 포장지에 담긴 붕어빵의 속재료는 무엇인가요?"
        System.out.println("두 번째 붕어빵의 속은 " + bbung2.filling + "입니다.");
    }
}