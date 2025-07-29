package jdbc;

public class Department { // 부서
    private String DepartmentId; // 부서번호
    private double DepartmentName; // 부서명

    public Department() {
    }

    public Department(String departmentId, double departmentName) {
        DepartmentId = departmentId;
        DepartmentName = departmentName;
    }

    public String getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(String departmentId) {
        DepartmentId = departmentId;
    }

    public double getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(double departmentName) {
        DepartmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentId='" + DepartmentId + '\'' +
                ", DepartmentName=" + DepartmentName +
                '}';
    }
}

