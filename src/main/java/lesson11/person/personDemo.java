package lesson11.person;

public class personDemo {
    public static void main(String[] args) {

        //Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

        Person person1 = new Person("Igor Zytkovich", 32);
        Person person2 = new Person();

        person2.setAge(23);
        person2.setFullName("Petya");

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();

    }
}
