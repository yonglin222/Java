package jini;

public class StringReverser {
    public static void main(String[] args) {
        String original = "Hello Genie";
        String reversed = reverseString(original);
        System.out.println(reversed); // "eineG olleH"가 출력되어야 함
    }

    // 이 메서드를 완성하세요.
    public static String reverseString(String str) {
        // 힌트!
        // 1. String을 char[]로 변환 (toCharArray())
        char[] originalChars = str.toCharArray();
        // 2. 새로운 char[] 배열을 같은 크기로 생성
        char[] reversedChars = new char[originalChars.length];
        // 3. for문을 이용해 원본 배열의 끝부터, 새 배열의 처음으로 문자를 복사
        for (int i = 0; i < originalChars.length; i++) { //
            reversedChars[i] = originalChars[originalChars.length - 1 - i];
        }
        // 4. 완성된 새 배열을 다시 String으로 변환하여 리턴 (new String(charArray))
        return new String(reversedChars); // 이 부분을 수정하세요.
    }
}
