package a11_exception;

public class Exception1 {
    public static void main(String[] args) {
        // try~catch 문
        try {
            System.out.println(3/0); // 0으로 나누면 산술예외가 발생함!
        }catch (ArithmeticException e) {
            System.out.println("산술예외가 발생하여 종료됨");
            
        }
    }
}
