package com.keyword;

interface Feature
{
    void price();
    void type();
    void color();
    void fuelType();

}
interface Flyable
{
    void fly();
}
interface Movable
{
    void move();
}

class cars implements Feature,Movable
{
    public void price()
    {
        System.out.println("Price : 3,00,000");
    }
    public void type()
    {
        System.out.println("Type : Car");
    }
    public void color()
    {
        System.out.println("Color : White");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Petrol");
    }
    public void move()
    {
        System.out.println("Move : Yes");
    }

}
class bikes implements Feature,Movable
{
    public void price()
    {
        System.out.println("Price : 50,000");
    }
    public void type()
    {
        System.out.println("Type : Bike");
    }
    public void color()
    {
        System.out.println("Color : Red");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Petrol");
    }
    public void move()
    {
        System.out.println("Move : Yes");
    }
}

class Scooters implements Feature,Movable
{
    public void price()
    {
        System.out.println("Price : 35,000");
    }
    public void type()
    {
        System.out.println("Type : Scooter");
    }
    public void color()
    {
        System.out.println("Color : Blue");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Petrol");
    }
    public void move()
    {
        System.out.println("Move : Yes");
    }
}

class Helicopters implements Feature,Flyable
{
    public void price()
    {
        System.out.println("Price : 2 Crores");
    }
    public void type()
    {
        System.out.println("Type : Helicopter");
    }
    public void color()
    {
        System.out.println("Color : Black");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Aviation Kerosene");
    }
    public void fly()
    {
        System.out.println("Fly : Yes");
    }
}

class Aeroplanes implements Feature,Flyable,Movable
{
    public void price()
    {
        System.out.println("Price : 8400 Crores");
    }
    public void type()
    {
        System.out.println("Type : Aeroplane");
    }
    public void color()
    {
        System.out.println("Color : White");
    }
    public void fuelType()
    {
        System.out.println("Fuel Type : Aviation Kerosene");
    }
    public void fly()
    {
        System.out.println("Fly : Yes");
    }
    public void move()
    {
        System.out.println("Move : Yes");
    }

}

public class InterfaceSegregationUsing
{
    public static void main(String[] args)
    {
        cars car = new cars();
        bikes bike = new bikes();
        Scooters scooter = new Scooters();
        Helicopters copter = new Helicopters();
        Aeroplanes aeroplane = new Aeroplanes();
        System.out.println("Cars :");
        car.price();
        car.type();
        car.color();
        car.fuelType();
        car.move();
        System.out.println("------------------------------------------");
        System.out.println("Bikes :");
        bike.price();
        bike.type();
        bike.color();
        bike.fuelType();
        bike.move();
        System.out.println("------------------------------------------");
        System.out.println("Scooter :");
        scooter.price();
        scooter.type();
        scooter.color();
        scooter.fuelType();
        scooter.move();
        System.out.println("------------------------------------------");
        System.out.println("Helicopter :");
        copter.price();
        copter.type();
        copter.color();
        copter.fuelType();
        copter.fly();
        System.out.println("------------------------------------------");
        System.out.println("Aeroplane :");
        aeroplane.price();
        aeroplane.type();
        aeroplane.color();
        aeroplane.fuelType();
        aeroplane.fly();
        aeroplane.move();
        System.out.println("------------------------------------------");
    }
}
