package day04;

public class Car {
    int amountOfFuel;
    int km;

    public double calculateConsumption(){
    return ((amountOfFuel*1.0)/km)*100;
    }
    public int getAmountOfFuel() {
        return amountOfFuel;
    }
    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
}