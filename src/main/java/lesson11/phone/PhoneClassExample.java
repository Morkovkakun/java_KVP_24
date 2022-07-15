package lesson11.phone;

public class PhoneClassExample {

    public static void main(String[] args) {


        Phone phone1 = new Phone(12345, "AVTONOM MIHAYLOVICH", 2000.2);
        Phone phone2 = new Phone(54321, "Vika");
        Phone phone3 = new Phone();

        phone3.setNumber(66666);
        phone3.setUser("anonim");
        phone3.setWeight(3.3);

//3.Выведите на консоль значения их переменных.
        System.out.println(phone3.getNumber() + "\n" + phone3.getUser()+ "\n" + phone3.getWeight());


        phone1.call();
        phone1.receiveCall(234567, "LUDMILA PETROVNA");
        phone1.getNumber();
        phone1.sendMassage();

        phone2.call();
        phone2.receiveCall("Petya");

        phone3.call();
        phone3.receiveCall("Vanya");



    }
}
