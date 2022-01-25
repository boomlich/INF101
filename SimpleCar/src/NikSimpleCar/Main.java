package NikSimpleCar;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Create a new car
        Car car = new Car(readInput("Which car: "));

        // Start Car
        if (readInput("Start the " + car.brand + "? (y/n)").toLowerCase().equals("y")) {
            car.StartCar();
        }

        // Accelerate Car
        if (readInput("Start accelerating? (y/n)").toLowerCase().equals("y")) {
            car.accelerate();
        }
    }

    public static String readInput(String prompt){
        System.out.println(prompt);
        String result = sc.next();
        return result;
    }
}
