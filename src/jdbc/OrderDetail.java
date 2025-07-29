package jdbc;

public class OrderDetail { // 주문세부
    private String OrderID; // 주문번호
    private int ProductID; // 제품번호
    private double UnitPrice; // 단가
    private int Quantity; // 주문수량
    private double Discount; // 할인율

    public OrderDetail() {
    }

    public OrderDetail(String orderID, int productID, double unitPrice, int quantity, double discount) {
        OrderID = orderID;
        ProductID = productID;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Discount = discount;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "OrderID='" + OrderID + '\'' +
                ", ProductID=" + ProductID +
                ", UnitPrice=" + UnitPrice +
                ", Quantity=" + Quantity +
                ", Discount=" + Discount +
                '}';
    }
}