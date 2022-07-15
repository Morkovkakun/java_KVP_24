
package testMy;
public class Toy {
    public class ToyDemo {
        public static void main(String[] args) {
            Toy toy = new Toy("Кукла", 34, "Disney", 3);
        }
    }


    String name;
    int cost;
    String manufacturer;

    int age;

    public Toy(String name, int cost, String manufacturer, int age) {
        this(name, cost, manufacturer);
        this.age = age;
        System.out.println("В конструкторе с четырьмя параметрами");
    }

    public Toy(String name, int cost, String manufacturer) {
        this();
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
        System.out.println("В конструкторе с тремя параметрами");
    }

    public Toy() {
        System.out.println("В конструкторе по умолчанию");
    }
}

