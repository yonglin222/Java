package jdbc;

import java.time.LocalDate;

public class Employee { // 사원
    private String EmployeeId; // 사월번호
    private String EmployeeName; // 이름
    private String EnglishName; // 영문이름
    private String Position; // 직위
    private String Gender; // 성별
    private LocalDate DateOfBirth; // 생일
    private LocalDate HireDate; // 입사일
    private String Address; // 주소
    private String City; // 도시
    private String Region; // 지역
    private String HomePhone; // 집전화
    private String ManagerID; // 상사번호
    private String DepartmentID; // 부서번호

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, String englishName, String position, String gender, LocalDate dateOfBirth, LocalDate hireDate, String address, String city, String region, String homePhone, String managerID, String departmentID) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        EnglishName = englishName;
        Position = position;
        Gender = gender;
        DateOfBirth = dateOfBirth;
        HireDate = hireDate;
        Address = address;
        City = city;
        Region = region;
        HomePhone = homePhone;
        ManagerID = managerID;
        DepartmentID = departmentID;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEnglishName() {
        return EnglishName;
    }

    public void setEnglishName(String englishName) {
        EnglishName = englishName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public LocalDate getHireDate() {
        return HireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        HireDate = hireDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public String getManagerID() {
        return ManagerID;
    }

    public void setManagerID(String managerID) {
        ManagerID = managerID;
    }

    public String getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(String departmentID) {
        DepartmentID = departmentID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EnglishName='" + EnglishName + '\'' +
                ", Position='" + Position + '\'' +
                ", Gender='" + Gender + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", HireDate=" + HireDate +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Region='" + Region + '\'' +
                ", HomePhone='" + HomePhone + '\'' +
                ", ManagerID='" + ManagerID + '\'' +
                ", DepartmentID='" + DepartmentID + '\'' +
                '}';
    }
}

