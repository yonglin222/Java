package jdbc;

public class MileGrade {
    private String Grade; // 등급명
    private double LowerMileage; // 하한마일리지
    private double UpperMileage;// 상한마일리지

    public MileGrade() {
    }

    public MileGrade(String grade, double lowerMileage, double upperMileage) {
        Grade = grade;
        LowerMileage = lowerMileage;
        UpperMileage = upperMileage;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public double getLowerMileage() {
        return LowerMileage;
    }

    public void setLowerMileage(double lowerMileage) {
        LowerMileage = lowerMileage;
    }

    public double getUpperMileage() {
        return UpperMileage;
    }

    public void setUpperMileage(double upperMileage) {
        UpperMileage = upperMileage;
    }

    @Override
    public String toString() {
        return "MileGrade{" +
                "Grade='" + Grade + '\'' +
                ", LowerMileage=" + LowerMileage +
                ", UpperMileage=" + UpperMileage +
                '}';
    }
}
