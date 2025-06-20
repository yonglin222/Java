package a3_control;

public class Test {
    public static void main(String[] args) {
        // Q3
//        int count = 0; // 카운트 1로하면 왜 34개지???
//        for (int i= 0; i<=10; i++) {
//             //System.out.println("i = " + i); // 1 = ?
//            if (i % 2 == 0) { // 3의배수 확인조건
//                //count = count + 1;
//                // System.out.println("count = " + count);
//                System.out.print(" " +i);
//            }
//        }
        // 쌤 풀이
        for (int i=0;  ; i++){
            if (i > 10) {
                break;
            }
            if (i % 2 == 1) { // 홀수
                continue;
            }
            System.out.println(i + ", ");
        }

        // Q4
//        for (int i= 10; i >0; i-= 2) {
//            System.out.println(i);
//        }
        // Q4 답
//        int i = 10;
//        while (i > 0) {
//            System.out.println(i);
//            i -= 2;
//        }

        // Q5 모르겠다
//        for(int i = 0; i < 5; i++){
//            for(int j =0; j < 3; j++) {
//                if(i == 2) {
//                    continue;
//                }
//                if(j == 1) {
//                    break;
//                }
//                System.out.println(i=j);
//            }
//        }
        //Q6
//        for(int i = 3; i < 10; i++){
//            for(int j = 2; j < 5; j++){
//                //...
//                if (j == 2) {
//                    i = 3; // 바깥 loop의 조건을 강제로 false로 바꿈!!!???
//                    break;
//                }
//                System.out.print("i-" + i + ", j=" +j);
//                System.out.println();
//            }
//        }

        // Q7
        



    }
}
