package a5_class;

import java.util.Date;

public class MyClass {
    public static void main(String[] args) {
        // 학생클래스의 객체 생성
        Student steve = new Student("Steve" , 25);
        Student tom = new Student(); // 기본생성자
        Student sam = new Student("Sam" , 29, "대전", "남", 100, 90, 80);
        System.out.println(steve.name); // Steve
        System.out.println(tom.name);
        System.out.println(sam.name);

        // 객체생성후에 개별적으로 필드를 수정할 수 있음
        // 직접적인 필드이 수정은 위험함
        // 예) 숫자가 포함된 이름, 또는 음수인 나이 등등
        // 매서드를 이용한 수정으로 이 문제를 막을 수 있음(=클래스의 은닉)
        tom.name = "Tom";
        tom.age = 21;
        System.out.println(tom.name + " " + tom.age); // Tom 21

        // 성적조회
        double samScoreSam = sam.sumScore(); // 메서드의 호출
        System.out.println(samScoreSam); // 270.0
        double averageScoreSam = sam.averageScore(); // 객체.매서드 .= 포인트연산자
        System.out.println(averageScoreSam); // 90.0
        // 중요!
        // Sam의 성적을 알고싶으면 Sam의 정보를 담고있는 객체의 메서드를 호출해야함.

        User kim = new User("Kim", "kim12@gmail.com", "1234");
        System.out.println(kim.password);
        String newPassword = kim.setPassword("qwer"); // 객채 지정이후 함수사용
        System.out.println(newPassword); // qwer
        System.out.println(kim.password); // qwer

        Product com = new Product("nb001", "Macbook Pro", 10000, 100);
        // 가격을 내리려면
        double newPrice = com.setPrice(9000);
        // 많이 팔려서 재고수량을 줄이려면
        int newStock = com.setStock(70);
        System.out.println(com.price); // 9000.0
        System.out.println(com.Stock); // 70

        // 주문생성
        Order order1 = new Order(100, kim, com,
                new Date(20205,5,24), 1);
        System.out.println(order1.user.email); // kim12@gmail.com
        System.out.println(order1.product.productId); // nb001
        System.out.println(order1.orderDate); // Wed Jun 24 00:00:00 KST 22105

        // 만약 주문자의 이름을 알고싶으면
        // 주문자가 회원인지 아닌지 확인해려면?
        System.out.println(order1.user.username); // kim
        // 주문한 제품이 재고가 있는지 확인하려면??
        System.out.println(order1.product.Stock); // 78
        /*
        주문클래스의 필드인 주문자와 주문제품은 User와 Product 클래스에 당한 의존성을 가지고 잇음.
        주문자와 주문제품은 반드시 User 클래스와 Product 클래스의 객체여야 함.
        이런 관계를 가지고 있는 필드의 경우에는 클래스객채 자체를 필드로 가지도록 주문 클래스를 설계할 필요가 있음
        public class Order {
            User use; // 주문자
            product product // 주문제품

         */

        // 지역변수의 초기화
        int a; // main 메서드의 지역변수 a
        // System.out.println(a); // 에러. 스택변수는 초기화 해야만 읽을 수 있음
        a = 10;
        System.out.println(a); // 10
    }
}
