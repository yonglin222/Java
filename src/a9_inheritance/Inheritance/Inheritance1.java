package a9_inheritance.Inheritance;

class Human {
    String name;
    int age;
    void eat(){}
    void sleep(){}
}
class Student extends Human {
    int studentID; // 객체생성
    void goToSchool() {} // 메서드 생성
}
class Worker extends Human {
    int workerID;
    void goToWork() {}
}

public class Inheritance1 {
    public static void main(String[] args) {
        // #1. Human 객체생성
        Human h = new Human(); // 이 객체는 휴먼 휴먼생성자를사용해서???
        h.name = "Steve";
        h.age = 11;
        h.eat();
        h.sleep();
        // #2. Student 객체생성
        Student s = new Student();
        s.name = "Tom";
        s.age = 16;
        s.studentID = 128; // 학생만의 필드
        s.eat();
        s.sleep();
        s.goToSchool(); // 학생만의 메서드
        // #3. Worker 객체생성
        Worker w = new Worker();
        w.name = "Sam";
        w.age = 45;
        w.workerID = 128; // Worker만의 필드
        w.eat();
        w.sleep();
        w.goToWork(); // Worker만의 메서드
    }
}









