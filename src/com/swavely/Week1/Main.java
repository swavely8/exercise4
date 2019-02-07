package com.swavely.Week1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
        Scanner Input = new Scanner(System.in);
        Scanner Unput = new Scanner(System.in);
	    String choice = "no";
        Map<String,Double> cities = new TreeMap<>();
	    while (!choice .equals("END")) {
			System.out.println("Enter the name of a city");
			String city = Unput.nextLine();
            System.out.println("What is the temp of the first day in " + city);
            double t1 = userInput.nextInt();
            System.out.println("What is the temp of the second day in " + city);
            double t2 = userInput.nextInt();
            System.out.println("What is the temp of the third day in " + city);
            double t3 = userInput.nextInt();
            System.out.println("What is the temp of the fourth day in " + city);
            double t4 = userInput.nextInt();
            System.out.println("What is the temp of the fifth day in " + city);
            double t5 = userInput.nextInt();
            double avg = (calc(t1,t2,t3,t4,t5));
            cities.put(city, avg);
            System.out.println("Type 'END' to stop entering cities or type any key to keep adding cities");
            choice = Input.nextLine();
		}
		display(cities);
    }
    static double calc(double t1, double t2, double t3, double t4, double t5 ){
            double avgHigh = (t1 + t2 + t3 + t4 + t5)/5;
            return avgHigh;
    }
    public static void display (Map<String, Double> cities){
        for(String city:cities.keySet()){
            System.out.println("The average high in " + city + " is " + cities.get(city));
        }
    }
}
