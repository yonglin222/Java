package a2_operator;

public class ConditionlOperator {
    public static void main(String[] args) {
        // 조건식 if
        // if문의 단점 라인을 길게잡음(가로) - 그래서 삼항연산자 많이사용
        // 삼함연산자 - 간단한 조건문
        // ex) 짝수와 홀수를 구분하는 코드
        int number = 2;
        // if 문을 사용한 예
        if (number % 2 == 0) { // if문 괄호 안에는 항상 boolean 이어야함
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
            }
        // 삼항연산자를 사용한 예
        System.out.println((number%2==0) ? "짝수" : "홀수"); // ? = if, else = :

        int value1 = (3>5) ? 6 : 9;
        System.out.println(value1); // 9

        int valse2 = (5>3) ? 10 : 20;
        System.out.println(valse2); // 10

    }
}
