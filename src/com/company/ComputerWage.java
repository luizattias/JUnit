package com.company;

import java.util.Scanner;

public class ComputerWage {
    private String name;
    private double gtotal;
    private int hours;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGtotal() {
        return gtotal;
    }

    public void setGtotal(double gtotal) {
        this.gtotal = gtotal;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }



public void acceptData(){
    boolean inputvalid = false;
    Scanner key = new Scanner(System.in);

    System.out.println("enter name: ");
    name = key.nextLine();

    while(!inputvalid){
        System.out.println("enter hours: ");
        String input = key.next();

        try{
            hours = Integer.parseInt(input);
            inputvalid = true;
        }catch (NumberFormatException e){
            System.out.println("You didn't enter a valid number");
        }
    }

}

public double computerWage(){
        if(this.hours>40){
            gtotal = (40*15) + (16.5 * (hours - 40));

        }else{
            gtotal = hours *15;
        }
        return gtotal;

}
public void Display(){
    System.out.println("The total wage of " + this.name +  " is " + this.gtotal);
}
}
