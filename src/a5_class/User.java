package a5_class;

public class User {
    // 필드
    String username;
    String email;
    String password;

    // 생성자 : 보통 기본생성자와 모든 필드를 매개변후로 하는 생정자를 선언해줌
    // 만약 아무 생성자도 선언하지 않으면 자동으로 기본생성자를 제공해준다!!

    public User() { // User u1 = new User(); - 가능
        // User u2 = new User("steve:, "steve@gmail.com", "1234"); // 안됨
        // user u3 = new User("tom", "", "")
        // u2 변수는 steve라는 회원의 정볼르 참조하고 있음.
        //
    }
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // 메서드
    // 패스워드를 변경하는 메서드
    public String setPassword(String newPassword) {
        this.password = newPassword; // 해당객체의 패스워드
        return  this.password;


    }
}
