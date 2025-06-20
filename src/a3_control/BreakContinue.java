package a3_control;

public class BreakContinue {
    public static void main(String[] args) {
        // 제어키워드
        // break
        // switch, for, while, do~while {} 탈출하는 용도 (if는 제외)
        // 중요! 가장 가까운 {} 한개만 탈출

        // 기본형
        for (int i=0; i<10; i++) {
            if (i == 9) {
                break;
            }
            System.out.print(i + " ");
        }
        // 이중 for문 (double loop)
        for (int i=0; i<3; i++) { // 이너
            for (int j=0; j<5; j++) { // 아웃
                if (j == 2) {
                    break;
                }
                System.out.println("i=" + i + ", j=" +j); // i=?, j+?
                System.out.println();
            }
        }
        // 이중 for문을 한번에 탈훌하는 코드 (tip)
        for (int i=0; i<3; i++) { // 이너
            for (int j=0; j<5; j++) { // 아웃
                if (j == 2) {
                i = 999999; // 바깥 loop의 조건을 강제로 false로 바꿈!!!???
                    break;
                }
                System.out.print("i-" + i + ", j=" +j);
                System.out.println();
            }
        }

        // contunue
        // 반복문안에서 형재 반복을 건너뛰고 다음 반복으로 넘어가도록 함
        // 핵심은 continue가 선언된 위치의 아래쪽 코드를 실행하지 않는 것!!
        for (int i=0; i<10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i +" ");
        }
        System.out.println();

    }
}







