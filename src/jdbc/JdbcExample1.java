package jdbc;

import a8_modifier.Modifier1.pack2.C;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class JdbcExample1 {
    // #1. 데이터베이스 연결 정보
    private static final String URL = "jdbc:mariadb://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    // #2. 정보를 조회하는 메서드 정의
    // 고객번호로 고객 정보 조회
    public Customer getCustomer(String customerId){
        Customer customer = null;
        String query = "select * from 고객 where 고객번호 = ?";
        try (
            Connection connection = DriverManager.getConnection(
                    URL, USER, PASSWORD); // 새로운 인스턴트 생성
            PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, customerId);
            try (ResultSet resultSet = ps.executeQuery()){
                System.out.println("연결성공");
                // O-R 매핑 (Object - Relation)
                if (resultSet.next()) {
                    customer = new Customer();
                    customer.setCustomerId(resultSet.getString("고객번호"));
                    customer.setCompanyName(resultSet.getString("고객회사명"));
                    customer.setContactName(resultSet.getString("담당자명"));
                    customer.setContactTitle(resultSet.getString("담당자직위"));
                    customer.setAddress(resultSet.getString("주소"));
                    customer.setCity(resultSet.getString("도시"));
                    customer.setRegion(resultSet.getString("지역"));
                    customer.setPhone(resultSet.getString("전화번호"));
                    customer.setMileage(resultSet.getInt("마일리지"));
                }
            }
        }catch (SQLException e) {
            System.out.println("에러 발생");
        }
        return customer;
    }

    // 모든 고객 정보를 조회
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String query = "select * from 고객";
        try (
                Connection connection = DriverManager.getConnection(
                        URL, USER, PASSWORD); // 새로운 인스턴트 생성
                PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery()){
            /* Statement vs PreparedStatement
            - Statement는 ?가 없는 고정된 SQL구문을 전송할 때 사용
            - PreparedStatement는 ?가 있는 동적인 SQL구문을 전송할 때 사용
            - <중요!!> 현업에서는 preparedStatement를 사용하는 것이 권장됨
            - 해커의 SQL 삽입공격을 방지할 수 있음
             */
//            ps.setString(1, customerId);
//            Statement statement = connection.createStatement();
            System.out.println("연결성공");
                while (resultSet.next()) {
                    Customer customer = new Customer();
                    customer.setCustomerId(resultSet.getString("고객번호"));
                    customer.setCompanyName(resultSet.getString("고객회사명"));
                    customer.setContactName(resultSet.getString("담당자명"));
                    customer.setContactTitle(resultSet.getString("담당자직위"));
                    customer.setAddress(resultSet.getString("주소"));
                    customer.setCity(resultSet.getString("도시"));
                    customer.setRegion(resultSet.getString("지역"));
                    customer.setPhone(resultSet.getString("전화번호"));
                    customer.setMileage(resultSet.getInt("마일리지"));

                    customers.add(customer);
                }

        }catch (SQLException e) {
            System.out.println("에러 발생");
        }
        return customers;
    }
    // 모든 부서정보를 조회
    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<>();
        String query = "select  *  from  부서";
        try(
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); // 새로운 인스턴트 생성
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery()){
            while (resultSet.next()){
                Department department = new Department();
                department.setDepartmentId(resultSet.getString("부서번호"));
                department.setDepartmentName(resultSet.getString("부서명"));
                departments.add(department);

            }

        }catch (SQLException e) {
            System.out.println("에러처리");
        }
        return departments;
    }

    // 조인쿼리 - 아래 key를 가지는 직원 정보 조회
    // 이름, 입사일, 부서명
    // 특정 클래스의 인스턴스에 담을 수 없으므로 Map<key, value> 형태로 만듬
    public List<Map<String, Object>> getEmployees() {
        List<Map<String, Object>> employees = new ArrayList<>();
        String query = "select 이름, 입사일, 부서명 from 사원" + " inner join 부서 on 사원.부서번호 = 부서.부서번호";
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); // 새로운 인스턴트 생성
                PreparedStatement ps = connection.prepareStatement(query);
                ResultSet resultSet = ps.executeQuery()){
            while (resultSet.next()){
                Map<String, Object> employee = new HashMap<>();
                employee.put("이름", resultSet.getString("이름"));
//                employee.put("입사일", resultSet.getString("입사일"));
                // 문자열로 받아서 LocalDate로 변환
                // 단, "YYYY-MM-DD" 형태의 문자열이어야만 함
                LocalDate date = LocalDate.parse(resultSet.getString("입사일"));
                employee.put("입사일", date);
                employee.put("부서명", resultSet.getString("부서명"));
                employees.add(employee);
            }
        }catch (SQLException e) {
            System.out.println("에러처리");
        }
        return employees;
    }

    public static void main(String[] args) {
        // 데이터베이스 연결
        // sql 쿼리를 전송해서 응답을 받음
        // 응답받은 정보를 클래스에 매핑
        JdbcExample1 repository = new JdbcExample1();
        Customer foundCustomer = repository.getCustomer("AIHTR");
        System.out.println(foundCustomer);
        List<Customer> allCustomers = repository.getAllCustomers();
        System.out.println(allCustomers);
        List<Department> allDepartments = repository.getAllDepartments();
        System.out.println(allDepartments);
        List<Map<String, Object>> employees = repository.getEmployees();
        System.out.println(employees);
    }
}
