package com.swavely.Week1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
	    String choice = "no";
		List<String> cities = new ArrayList<>();
		List<Double> temps = new ArrayList<>();
		int i = 0;
	    while (!choice .equals("END")) {
			System.out.println("Enter the name of a city");
			String city = userInput.nextLine();
			cities.add(city);
			System.out.println("Type 'END' to stop entering cities or type any key to keep adding cities");
			choice = userInput.nextLine();
			i++;
		}
		System.out.println(i);
		for (String city:(cities)){
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
            temps.add(calc(t1,t2,t3,t4,t5));
		}
		display(cities,temps);
    }
    static double calc(double t1, double t2, double t3, double t4, double t5 ){
            double avgHigh = (t1 + t2 + t3 + t4 + t5)/5;
            return avgHigh;
    }
    public static void display (List<String> cities, List<Double> temps){
        int i =0;
        for(String city:cities){
            System.out.println("The average high in " + city + " will be " + temps.get(i));
            i++;
        }
    }
}
