package NikSimpleCar;

public class Car {

    String brand;
    boolean powerOn = false;
    public int currentSpeed;

    //Constructor
    public Car(String brand){
        this.brand = brand;
        this.currentSpeed = Constants.minSpeed;
    }

    public void StartCar() {
        powerOn = true;
    }

    // Only accelerate if vehicle is powered on and speed is lower than max speed
    public void accelerate() {
        while (powerOn && currentSpeed < Constants.maxSpeed) {
            currentSpeed ++;

            // Only output speed every 10 km/t
            if (currentSpeed % 10 == 0 && currentSpeed < Constants.maxSpeed) {
                System.out.println("This " + this.brand + " is going at " + currentSpeed + Constants.speedUnit);
            }
        }
        System.out.println("The " + this.brand + " is going at the maximum speed of: " + this.currentSpeed + Constants.speedUnit);
    }
}
