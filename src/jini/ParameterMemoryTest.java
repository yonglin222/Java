package jini;

public class ParameterMemoryTest {
    // 1. 기본 자료형(int)을 매개변수로 받는 메서드
    public void changeValue(int value) {
        value = value * 10;
    }

    // 2. 참조 자료형(int[])을 매개변수로 받는 메서드
    public void changeArray(int[] array) {
        array[0] = array[0] * 10;
    }

    public static void main(String[] args) {
        ParameterMemoryTest tester = new ParameterMemoryTest();

        int myValue = 5;
        int[] myArray = {1, 2, 3};

        // 메서드 호출
        tester.changeValue(myValue); // 50
        tester.changeArray(myArray); // {10, 20, 30}

        System.out.println("myValue = " + myValue);
        System.out.println("myArray[0] = " + myArray[0]);
    }
}