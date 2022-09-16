public class CarPart {
    String name;
    String manufacturer;
    double price;

    CarPart(String name, String manufacturer, double price){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String toString() {
        return "CarPart{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
