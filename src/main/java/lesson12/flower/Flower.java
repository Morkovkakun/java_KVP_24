package lesson12.flower;

public abstract class Flower {
    String country = "none";
    Integer shelfLife = 0;
    Integer price = 0;

    static int count = 0;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Integer shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
        count++;
    }

    public String getInfo() {
        return " country: " + country + " price: " + price + " shelf life: " + shelfLife;
    }
    public Integer getInfoPrice() {
        return price;
    }

}

