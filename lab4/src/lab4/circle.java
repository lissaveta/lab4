package lab4;

import java.util.Scanner;

public class circle {
    private double x;
    private double y;
    private double r;
    private String colour;

    public circle(double x, double y, double r, String colour) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getR() {
        return this.r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getLength() {
        double c = 2*Math.PI* this.r;
        return c;
    }

    public String toString() {
        return "circle{x=" + this.x + ", y=" + this.y + ", r=" + this.r + ", colour='" + this.colour + "'}";
    }
}
class TestCircle{
    public static void main(String[] args) {
        circle k1 = new circle(3.1D, 4.1D, 5.1D, "yellow");
        System.out.println("Длина окружности = " + k1.getLength() + "см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        double r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см");
    }
}