package Lab2.Ex2;

public class IceCream {
    private String brand;
    private String name;
    private Type type;
    private Flavor flavor;
    private int gram;
    private boolean isAvailable;
    private int price;
    private  int quantity;

    public IceCream() {
    }

    public IceCream(String brand, String name, int gram, boolean isAvailable, int price) {
        this.brand = brand;
        this.name = name;
        this.gram = gram;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public IceCream(String brand, String name, Type type, Flavor flavor, int gram, boolean isAvailable, int price, int quantity) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.flavor = flavor;
        this.gram = gram;
        this.isAvailable = isAvailable;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ice-cream info" + "\n" +
                "Brand:'" + brand + '\'' + "\n" +
                "Name:'" + name + '\'' + "\n" +
                "Type:" + type + "\n" +
                "Flavor:" + flavor + "\n" +
                "Grams:" + gram + "\n" +
                "Available:" + isAvailable + "\n" +
                "Price:" + price + "\n" +
                "Quantity:" + quantity
                ;
    }
    public void calculateDiscountPrice(int discount){
        this.setPrice(this.getPrice() - discount);
    }
    private void changeAvailability() {
        if (this.getQuantity() == 0){
            this.setAvailable(false);
        }
    }
    public void buy(int soldQuantity){
        this.setQuantity(this.getQuantity() - soldQuantity);
        changeAvailability();
    }
}
