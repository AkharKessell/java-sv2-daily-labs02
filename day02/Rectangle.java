package day02;

public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle (double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double calculateArea(){
        return this.sideA*this.sideB;
    }
}
