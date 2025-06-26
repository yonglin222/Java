package a4_method;

public class Myhome {
    int m = 3; // 상위 중괄호가 클래스 일 때는 필드에 저장
    int n = 4;
    public void asd1() { // 모든 클래스에서 사용가능하며 리턴하지 않는다 그리고 메서드는 메서드영역에 저장
        int k = 5; // 상위 중괄호가 메서드일 때는 지역 변수
        System.out.println(k);
        asd2(3); // asd2() 안에 정의된 지역변수를 스택 메모리에 추가
    }
    void asd2(int i) { // 인수를 변수 i에 대입해 입력매개변수로 활용
        int j = 4;
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        // 1. Myhome 클래스의 인스턴스 생성
        Myhome M = new Myhome();

        // 2. 생성된 인스턴스를 통해 메서드 호출
        System.out.println("asd1() 메서드 호출 결과:"); // 메서드의 지역변수 값을 호출
        M.asd1(); // asd1() 호출
        M.asd1();
        M.asd2(3);
    }
} // 4-9 11 12 13 14} 10}
// 18 21 22 7 9 12 13 14} 10} 23}

