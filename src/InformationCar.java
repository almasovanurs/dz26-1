public class InformationCar {

    private int yearOfIssue;
    private String model;
    private int price;
    private String colour;

    public InformationCar(int yearOfIssue, String model, int price, String colour) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "InformationCar{" +
                "yearOfIssue=" + yearOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
