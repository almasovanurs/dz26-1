public class Car {

    private int id;
    private int numberCar;

    public Car(int id, int numberCar) {
        this.id = id;
        this.numberCar = numberCar;
    }

    public int getId() {
        return id;
    }

    public int getNumberCar() {
        return numberCar;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberCar=" + numberCar +
                '}';
    }

}
