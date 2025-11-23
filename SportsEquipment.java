import java.util.Objects;

public class SportsEquipment {
    private String name;
    private String brand;
    private String category;
    private double price;
    private int weightInGrams;


    public SportsEquipment(String name, String brand, String category, double price, int weightInGrams) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.weightInGrams = weightInGrams;
    }


    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    @Override
    public String toString() {
        return String.format("SportsEquipment{name='%s', brand='%s', category='%s', price=%.2f, weight=%dg}",
                name, brand, category, price, weightInGrams);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportsEquipment that = (SportsEquipment) o;
        return Double.compare(that.price, price) == 0 &&
                weightInGrams == that.weightInGrams &&
                Objects.equals(name, that.name) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, category, price, weightInGrams);
    }
}