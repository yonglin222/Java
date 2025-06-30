package a7_collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        // ArrayList 매서드 사용법
        List<Integer> aList1 = new ArrayList<>();
        // #1. add (요소추가, 맨뒤에 추가)
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1); // [3, 4, 5]

        // #2. add(int intdx, E elsement) (요소추가, 특정위치에 추가)
        aList1.add(1,6);
        System.out.println(aList1); // [3, 6, 4, 5]

        // #3. addAll (또 다른 리스트를 뒤에 추가)
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2); // [1, 2, 3, 6, 4, 5]

        //#4. addAll (특정위치에 리스트 추가)
        List<Integer> aList3 = new ArrayList<>();
        aList3.add(100);
        aList3.add(101);
        aList2.addAll(1, aList3); // 내생각 [1,2,3,6,4,5,1,100,101]
        System.out.println(aList2); // 런 [1, 100, 101, 2, 3, 6, 4, 5]

        // #5. set (수정)
        System.out.println("#5");
        System.out.println(aList3); // [100, 101]
        aList3.set(0, 10);
        aList3.set(1, 20);
        System.out.println(aList3); // [10, 20]
        System.out.println(aList2); // [1, 100, 101, 2, 3, 6, 4, 5]

        // #6. remove(int index) (해당 인덱스 삭제) // 오버로딩 메서드
        System.out.println("#6"); // ???
        // aList3.remove(10); // 주의. 정수는 인덱스로 인식함
        aList3.remove(0);
        System.out.println(aList3); // [20]

        // #7. remove(Object obj) (해당 오브젝트 삭제)
        System.out.println("#7");
        aList3.add(0, 10); // [10, 20]
        System.out.println(aList3);
        aList3.remove(Integer.valueOf(10));
        System.out.println(aList3); // [20]

        // #8. clear(모두삭제)
        System.out.println("8");
        aList3.clear();
        System.out.println(aList3); // []

        // #9. isEmpty (배열이 비어있는지 확인. 비었으면 true)
        System.out.println("#9");
        System.out.println(aList3.isEmpty()); // true

        // #10. size (리스트의 전체 갯수를 리턴)
        System.out.println("#10");
        System.out.println(aList2.size()); // 8

        // #11. get (특정인덱스의 요소를 읽음)
        // <주의> 배열에서는 array[index] 처럼 읽지만 컬렉션에서는 안됨
        // aList2[index] // 오류발생
        System.out.println("#11");
        System.out.println(aList2.get(0)); // 1
        System.out.println(aList2.get(1)); // 100
        System.out.println(aList2.get(2)); // 101

        // #12. toArray (리스트 -> 배열)
        System.out.println("#12.");
        System.out.println(aList2); // [1, 100, 101, 2, 3, 6, 4, 5]
        // int[] array = aList2.toArray(); // 될거같지만 int
        // 오류 원인 왼쪽은 int[], 오른쪽은 Obhect[] (toArray()반환형 Obgect[])
        Object[] objArray= aList2.toArray();
        System.out.println(Arrays.toString(objArray));
        Integer[] intArray = (Integer[]) aList2.toArray(); // 오류
        // ClassCastException(Object[] -> Integer[] 다운캐스팅 하면서 발생

        // 어떻게하면 Integer[]로 변환할 수 있을까??
        Integer[] intArray = aList2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArray));
        // new Integer[0]는 0의 크기를 가진 배열을 만드는게 아니라
        // aList2.size()와 같은 배열 크리고 만들라는 약속!
    }
}
