package lesson11.person;

public class Person {
//1.переменные fullName, age;
    private String fullName;
    private Integer age;
//Добавьте два конструктора  - Person() и Person(fullName, age).
    Person(String fN, Integer a) {
        fullName = fN;
        age = a;
    }
    Person() {
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
    void talk() {
        System.out.println("Person " + getFullName() + " talk");
    }

    void move() {
        System.out.println("Person " + getAge() + " ears old");
    }
}
