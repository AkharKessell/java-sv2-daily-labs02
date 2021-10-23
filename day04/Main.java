package day04;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(666);
        System.out.println(gasStation.tankCar(car,34));
        car.setKm(666);
        System.out.println(car.calculateConsumption());
    }
}
