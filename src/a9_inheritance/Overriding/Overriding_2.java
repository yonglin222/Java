package a9_inheritance.Overriding;

class Animal {
    void cry() {
        System.out.println("...");
    }
}
// 자식클래스 새, 고양이, 개
class Bird extends Animal {
    @Override // 어노테이션
    void cry() {
//        super.cry(); // ...
        System.out.println("짹짹");
    }
    void superCru() {
        super.cry();
    }
    // !!
    // 어노테이션은 코드에 추가적인 정보를 제공하기 위한 메타데이터
    // 메타데이터는 주로 코드의 의미를 명확하게 하고 컴파일러에게 지시를 내리거나
    // 특정 동작을 수행할 수 있도록 명령하는 코드
    // @Override 어노테이션의 장점
    // #1. 컴파일러가 오버라이딩 여부를 검증
    // #2. 개발자의 가독성을 향상
    // #3. 메서드 수정 시 실수를 방지해줌
}
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

public class Overriding_2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.cry(); // ...
        bird.cry(); // 짹짹
        cat.cry(); // 야옹
        dog.cry(); // 멍멍
        System.out.println();
        Animal animal1 = new Bird(); // 업캐스팅
        Animal animal2 = new Cat(); // 업캐스팅
        Animal animal3 = new Dog(); // 업캐스팅
        animal1.cry(); // 짹짹
        animal2.cry(); // 야옹
        animal3.cry(); // 멍멍
        System.out.println();
        // 부모(Animal)의 cry를 호추랗고자 한다면
        Bird animal4 = (Bird) animal1; //??? 여기서 (Bird)는 왜 나온거지?
        animal4.superCru(); // ...

        // 배열생성
        /*
         새, 고양이, 개 클리스가 상속관계가 아니라면
        배열에 담을때 모두 각자 타입의 배열에 담아야 하므로 배열 3개가 필요함
        하지만 상속관계에 있다면 부모인 Animal 클래스로 업캐스팅이 가능하므로
        부모클래스로 배열의 타입을 정의하면 자식클래스들 모두를 배열화할 수 있음
        */
        Animal[] animals = {animal, bird, cat, dog, animal1, animal2};
//        printCry(animals);
    }
    static void printCry(Animal[] animals) {
        for(Animal animal : animals) {
            animal.cry();
        }
    }
}







