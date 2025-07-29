package jdbc;

public class Product {
    private int ProductID; // 제품번호
    private String ProductName; // 제품명
    private String PackageUnit; // 포장단위
    private double UnitPrice; // 단가
    private int UnitsInStock; // 재고

    public Product() {
    }

    public Product(int productID, String productName, String packageUnit, double unitPrice, int unitsInStock) {
        ProductID = productID;
        ProductName = productName;
        PackageUnit = packageUnit;
        UnitPrice = unitPrice;
        UnitsInStock = unitsInStock;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getPackageUnit() {
        return PackageUnit;
    }

    public void setPackageUnit(String packageUnit) {
        PackageUnit = packageUnit;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        UnitsInStock = unitsInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductID=" + ProductID +
                ", ProductName='" + ProductName + '\'' +
                ", PackageUnit='" + PackageUnit + '\'' +
                ", UnitPrice=" + UnitPrice +
                ", UnitsInStock=" + UnitsInStock +
                '}';
    }
}
