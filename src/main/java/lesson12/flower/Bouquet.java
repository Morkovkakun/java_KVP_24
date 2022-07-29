package lesson12.flower;


import java.util.Arrays;

public class Bouquet {
    public static void main(String[] args) {

        Tulips tulips = new Tulips("Nigeria", 6, 600);
        Roses roses = new Roses("USA", 4, 400);
        Carnations carnations = new Carnations("Russia", 2, 200);

        Flower[] bouquet1 = {tulips, roses, carnations};
        Flower[] bouquet2 = {roses, roses, roses};
        Flower[] bouquet3 = {carnations, carnations, carnations};
        System.out.println("Количество созданных объектов: "
                + Flower.count);
        printBouquet(bouquet1, bouquet2, bouquet3);
    }

    private static void printBouquet(Flower[] bouquet1, Flower[] bouquet2, Flower[] bouquet3) {
        System.out.println("First bouquet:");
        int priceFistBouquet = 0, priceSecondBouquet = 0, priceThirdBouquet = 0;
        for (Flower flower : bouquet1) {
            System.out.println(flower.getInfo());
            priceFistBouquet += flower.getInfoPrice();
        }
        System.out.println("First bouquet Price:" + priceFistBouquet);

        System.out.println("Second bouquet:");
        for (Flower flower : bouquet2) {
            System.out.println(flower.getInfo());
            priceSecondBouquet += flower.getInfoPrice();
        }
        System.out.println("Second bouquet Price:" + priceSecondBouquet);

        System.out.println("Third bouquet:");
        for (Flower flower : bouquet3) {
            System.out.println(flower.getInfo());
            priceThirdBouquet += flower.getInfoPrice();
        }
        System.out.println("Third bouquet Price:" + priceThirdBouquet);
    }
}
