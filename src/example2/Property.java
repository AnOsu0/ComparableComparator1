package example2;

public class Property implements Comparable<Property> {
    private String city;
    private double price;
    private double area;
    private double pricePerMeter;

    public Property(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public double getPricePerMeter() {
        return pricePerMeter;
    }

    public void setPricePerMeter(double pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return city + ", " + price + " zł, " + area + " mkw, " +
                String.format("%.2f",pricePerMeter) + " zł/mkw" + "\n";
    }

    @Override
    public int compareTo(Property o) {
        if (this.pricePerMeter > o.pricePerMeter)
            return 1;
        else if (this.pricePerMeter < o.pricePerMeter)
            return -1;
        return 0;
    }
}
