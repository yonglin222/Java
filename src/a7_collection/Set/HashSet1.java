package a7_collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        // Set
        // 1) 중복을 허용하지 않음 (동일자료를 넣어도 오직 한개만 저장)
        // 2) 순서를 보장하지 않음
        /* 언제 사용할까?
            - 데이터의 중복을 제거하고 싶을 때
            - 데이터의 존재 여부를 빠르게 확인하고 싶을 때
            - 저장된 데이터의 순서가 중요하지 않을 때
         */
        Set<String> hset1 = new HashSet<>(); // 생성자
        // #1 add
        boolean b1 = hset1.add("A"); // ??? 보이드 불리언
        hset1.add("B");
        hset1.add("C");
        boolean b2 = hset1.add("A"); // 중복저장 안함!!! (중복이므로 false 리턴)
        System.out.println(b1 + " " + b2); // truw false
        System.out.println(hset1); // [A, B, C] 출력순서가 고정X, 랜덤O
        // #2 addAll
        Set<String> hset2 = new HashSet<>();
        hset2.add("C");
        hset2.add("D");
        hset2.addAll(hset1);
        System.out.println(hset2); // [A, B, C, D] 랜덤출력, 중복저장X
        // #3. remove
        hset2.remove("B"); // 인덱스를 이용한 리무브가 없음, 객체남 남아서 객체를 찾아서 삭제해야함
        System.out.println(hset2); // [A, C, D] 랜덤출력
        // #4. clear
        hset2.clear();
        System.out.println(hset2); // []
        // #5. isEmpty
        System.out.println(hset2.isEmpty()); // true
        // #6. contains
        Set<String> hset3 = new HashSet<>();
        hset3.add("A");
        hset3.add("B");
        hset3.add("C");
        System.out.println(hset3.contains("B")); // true
        System.out.println(hset3.contains("D")); // false
        // #7. size
        System.out.println(hset3.size()); // 3
        // #8. iterator - 생성법을 알아야함, 이더레이터 메서드 사용법
        Iterator<String> iterator = hset3.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // #9. toArray
        Object[] objects = hset3.toArray();
        System.out.println(Arrays.toString(objects)); // [A, B, C]
        // #10.
        String[] strings = hset3.toArray(new String[0]); // 0을쓰는게 키포인트 래퍼
        System.out.println(Arrays.toString(strings)); // [A, B, C]
    }
}
