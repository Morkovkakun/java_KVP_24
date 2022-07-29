
package lesson12.phone;

public class Phone {
    static Integer count = 0;
    private Integer number;
    private String user;
    private double weight;


    Phone(Integer n, String u, double w) {
        this(n, u);
        weight = w;
    }

    Phone(Integer n, String u) {
        number = n;
        user = u;
    }

    Phone() {
    }


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
        count++;
    }

    public double getWeight() {
        return weight;

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(String user) {
        this.user = user;

    }

    void call() {
        System.out.println("incoming call:" + user);

    }

    void receiveCall(Integer number, String user) {
        System.out.println("receive call:" + number + " " + user);

    }

    void receiveCall(String user) {
        System.out.println("receive call:" + user);
    }

    void sendMassage(Integer... arg) {
        System.out.println(this.number);
    }
}

