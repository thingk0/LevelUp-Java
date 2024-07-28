package com.levelup.java._08_class_and_instance;

public class Main {

    public static void main(String[] args) {
        // 객체 간의 관계: 연관, 집합, 합성 예제
        Person person = new Person("홍길동");
        Team team = new Team("개발팀");
        team.addMember(person);

        Computer computer = new Computer("게이밍 PC");
        computer.addComponent(new Component("CPU"));
        computer.addComponent(new Component("GPU"));

        // this 키워드 예제
        person.showDetails();

        // 객체 복사 예제: 얕은 복사와 깊은 복사
        Address address = new Address("서울시 강남구 테헤란로", "서울");
        Employee emp1 = new Employee("김철수", address);
        Employee emp2 = emp1.shallowCopy();
        Employee emp3 = emp1.deepCopy();

        System.out.println("Original: " + emp1);
        System.out.println("Shallow Copy: " + emp2);
        System.out.println("Deep Copy: " + emp3);

        // 변경 후 확인
        emp1.getAddress().setStreet("서울시 강남구 삼성로");
        System.out.println("\nAfter modifying original's address:");
        System.out.println("Original: " + emp1);
        System.out.println("Shallow Copy: " + emp2);
        System.out.println("Deep Copy: " + emp3);
    }
}