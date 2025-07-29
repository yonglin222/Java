package jdbc;

import java.time.LocalDate;

public class Order { // 주문
    private String OrderID; // 주문번호
    private String CustomerID; // 고객번호
    private String EmployeeID; // 사원번호
    private LocalDate OrderDate; // 주문일
    private LocalDate RequiredDate; // 요청일
    private LocalDate ShippedDate; // 발송일

    public Order() {
    }

    public Order(String orderID, String customerID, String employeeID, LocalDate orderDate, LocalDate requiredDate, LocalDate shippedDate) {
        OrderID = orderID;
        CustomerID = customerID;
        EmployeeID = employeeID;
        OrderDate = orderDate;
        RequiredDate = requiredDate;
        ShippedDate = shippedDate;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }

    public LocalDate getRequiredDate() {
        return RequiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        RequiredDate = requiredDate;
    }

    public LocalDate getShippedDate() {
        return ShippedDate;
    }

    public void setShippedDate(LocalDate shippedDate) {
        ShippedDate = shippedDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderID='" + OrderID + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                ", EmployeeID='" + EmployeeID + '\'' +
                ", OrderDate=" + OrderDate +
                ", RequiredDate=" + RequiredDate +
                ", ShippedDate=" + ShippedDate +
                '}';
    }
}
