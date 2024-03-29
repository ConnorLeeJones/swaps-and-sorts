//package HackerRank;
//
//import java.util.Scanner;
//import java.io.*;
//
//
//abstract class Car {
//    protected boolean isSedan;
//    protected String seats;
//
//    public Car(boolean isSedan, String seats) {
//        this.isSedan = isSedan;
//        this.seats = seats;
//    }
//
//    public boolean getIsSedan() {
//        return this.isSedan;
//    }
//
//    public String getSeats() {
//        return this.seats;
//    }
//
//    abstract public String getMileage();
//
//    public void printCar(String name) {
//        System.out.println(
//                "A " + name + " is " + (this.getIsSedan() ? "" : "not ")
//                        + "Sedan, is " + this.getSeats() + "-seater, and has a mileage of around "
//                        + this.getMileage() + ".");
//    }
//}
//
//// Write your code here.
//
///**
// *   WagonR class
// **/
//class WagonR extends Car {
//
//
//
//    private int mileage;
//
//    public WagonR(boolean isSedan, String seats, int mileage){
//        super(isSedan, seats);
//        this.mileage = mileage;
//    }
//
//    @Override
//    public String getMileage() {
//        return this.mileage + " kmpl";
//    }
//}
//
///**
// *   HondaCity class
// **/
//
//public class HondaCity extends Car {
//
//    private int mileage;
//
//    public HondaCity(int mileage){
//        super();
//        this.mileage = mileage;
//    }
//
//    @Override
//    public String getMileage() {
//        return this.mileage + " kmpl";
//    }
//}
//
///**
// *   InnovaCrysta class
// **/
//public class InnovaCrysta extends Car {
//    private int mileage;
//
//    public InnovaCrysta(int mileage){
//        super();
//        this.mileage = mileage;
//    }
//
//    @Override
//    public String getMileage() {
//        return this.mileage + " kmpl";
//    }
//
//}
//
//public class Solution {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int carType = Integer.parseInt(bufferedReader.readLine().trim());
//        int carMileage = Integer.parseInt(bufferedReader.readLine().trim());
//
//        if (carType == 0){
//            Car wagonR = new WagonR(carMileage);
//            wagonR.printCar("WagonR");
//        }
//
//        if(carType == 1){
//            Car hondaCity = new HondaCity(carMileage);
//            hondaCity.printCar("HondaCity");
//        }
//
//        if(carType == 2){
//            Car innovaCrysta = new InnovaCrysta(carMileage);
//            innovaCrysta.printCar("InnovaCrysta");
//        }
//    }
//}
