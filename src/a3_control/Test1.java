package a3_control;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // i가 5가 되면 반복문 종료
            }
            System.out.println(i); // 0~4까지만 출력됨
        }

    }
}
