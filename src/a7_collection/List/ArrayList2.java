package a7_collection.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        // 배열을 List로 번환하는 법
        // int[] array = {1,2,3,4}; // 기본자료형의 배열은 리스트로 자동변환x
        Integer[] array = {1,2,3,4}; // 래퍼
        List<Integer> aList1 = Arrays.asList(array); // 리스트는 객체만 저장 가능
        // aList1.add(5); // 에러
        // Arrays.asList()로 배열을 리스트로 변환할 때, 기존 배열의 메모리 위치를
        // 그대로 재사용함. 원본 배열을 참조하여 그 위에 List인터페이스의 껍데기를
        // 씌운 것과 같음.
        // 그러므로 배열의 고정크리를 유지하면 View(뷰)의 역할을 수행함.
        // 결과적으로 배열의 불변성을 그대로 가지게 됨.

        // 값복사 새로운 메모리에 생성 (참조복사x)
        List<Integer> aList2 = new ArrayList<>(Arrays.asList(array));
        aList2.add(5);
        System.out.println(aList2); // [1, 2, 3, 4, 5]
        // 기존의 배열의 메모리 위치 를 재사용하지 않고 new ArrayList<>()로 새로 생성
        // 하는 방식이므로 새로운 힙의 메모리 영역을 가짐
        // 이 경우 리스트의 특징을 그대로 사용 가능.
    }
}
