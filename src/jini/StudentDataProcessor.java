package jini;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDataProcessor {
    public static List<String> getPassingStudents(Map<String, Integer> studentScores) {
        // 이 메서드를 완성하세요.
        // 1. 합격자 이름을 저장할 새로운 ArrayList를 생성합니다.
        // 2. studentScores 맵의 모든 학생을 순회합니다. (for문 필요)
        // 3. 각 학생의 점수가 60점 이상인지 확인합니다. (if문 필요)
        // 4. 60점 이상이면, 학생의 이름을 생성한 리스트에 추가합니다.
        // 5. 모든 학생을 확인한 후, 완성된 리스트를 반환합니다.

        return null; // 이 부분을 수정하세요
    }

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Steve", 90);
        scores.put("Tom", 55);
        scores.put("Laura", 85);
        scores.put("Mike", 60);
        scores.put("Annie", 40);

        List<String> passingStudents = getPassingStudents(scores);
        System.out.println("합격자 명단: " + passingStudents); // 예상 결과: [Laura, Steve, Mike] (Map이라 순서는 다를 수 있음)
    }
}