package a5_class;

import java.util.Date;

public class Order {
    // 필드
    long orderId; // 주문번호 : 숫자형가능(이 경우 long이 주로 사용됨)
    User user;
    Product product; // 주문제품
    String userEmail; // 주문자
    String porductId; // 주문제품
    Date orderDate; // 주문일
    double totalAmount; // 주문수량

    // 생성자

    public Order() {
    }

    public Order(long orderId, User user, Product product, String userEmail, String porductId, Date orderDate, double totalAmount) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.userEmail = userEmail;
        this.porductId = porductId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    // 메서드
    // 주문수량 입력
    public double settotalAmount(double newAmount) {
        this.totalAmount = newAmount;
        return this.totalAmount;
    }
}
