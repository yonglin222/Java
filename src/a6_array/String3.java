package a6_array;

import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
        // 5. 문자열 수정
        // 대소문자 변경
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY
        // 문자열 교체 replace
        System.out.println(str1.replace("Study", "공부")); //
        // substring 중요!!
        System.out.println(str1.substring(0,5)); // 0<=, <5 Java
        String text = "2024-10-28";
        String year = text.substring(0, 4);
        String month = text.substring(5,7);
        String day = text.substring(8); // 두번째 매개변수 없으면 끝까지
        System.out.println(year); // 2024
        System.out.println(month); // 10
        System.out.println(day); // 28
        String filename = "document.pdf";
        String extention = filename.substring(filename.indexOf('.')+1);
        System.out.println(extention); // pdf
        // split
        // 예제설명: sample안의 /- 을 기준으로 나눠서 배열에 담는 방법
        // ["abc, def, ghi, jkl]
        String sample = "abc/def-ghi jkl";
        String[] strArray = sample.split(" |-|/"); // 스페이스 파이프 하이픈 파이프 슬래시
        System.out.println(Arrays.toString(strArray)); // [abc, def, ghi, jkl]
        // 정규표현식 (regex = regular expression)
        // 특정패턴을 가진 문자열을 찾거나 조작하기 위한 만자열
        // 주로 문자열 검색, 추출 치환과 같은 작업에 사용됨
        // 정규표현식을 통해 패턴을 효율적으로 찾고 원하는 부분을 추출 변경 가능함.
        String sample1 = "abc-def ghi/jkl"; // 스페이스 하이픈 슬래시가 어디 들어가든 구분을 해준다
        String[] strArray1 = sample1.split(" |-|/");
        System.out.println(Arrays.toString(strArray1));
        System.out.println();

        // 이메일주소를 검증하는 정규표현식
        // ^[
    }
}
