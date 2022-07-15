
package lesson11.phone;

public class Phone {
////2.Создайте три экземпляра этого класса.
    private Integer number;
    private String user;
    private double weight;

//5.Добавить конструктор в класс Phone,который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
    Phone(Integer n, String u, double w) {
//8.Вызвать из конструктора с тремя параметрами конструктор с двумя.
        this(n, u);
        weight = w;
    }
//6.Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
    Phone(Integer n, String u) {
        number = n;
        user = u;
    }
//7.Добавить конструктор без параметров.
    Phone() {
    }

//    Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//    11.Изменить класс Phone в соответствии с концепцией JavaBean

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void call() {
        System.out.println("incoming call:" + user);
    }
//4.Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    void receiveCall(Integer number, String user) {
        System.out.println("receive call:" + number + " " + user);
    }
//9.Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
    void receiveCall(String user) {
        System.out.println("receive call:" + user);
    }
//10.Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    void sendMassage(Integer... arg) {
        System.out.println(this.number);
    }
}

