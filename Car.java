package Hwsommerr;

public class Car {
    private Color color;
    private boolean isSportCar;
    private Brand brand;
    private int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "color:" + color +
                " isSportCar:" + isSportCar +
                " brand:" + brand +
                " maxSpeed:" + maxSpeed +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(Color color, boolean isSportCar, Brand brand, int maxSpeed) {
        this.color = color;
        this.isSportCar = isSportCar;
        this.brand = brand;
        this.maxSpeed = maxSpeed;


    }

}
