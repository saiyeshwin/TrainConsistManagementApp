// Use Case-02:Add Passenger Bogies to Train
// This class demonstrates how passenger bogies can be dynamically managed
// We use an ArrayList
// This maps CRUD operations using ArrayList
// @author Developer
// @version 2.0

package com.seveneleven.trainconsistmanagement;
import java.util.*;
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		List<String> passengerBogies = new ArrayList<>();
		passengerBogies.add("Sleeper");
		passengerBogies.add("AC Chair");
		passengerBogies.add("First Class");
		System.out.println("After Adding Bogies:");
		System.out.println("Passenger Bogies:" + passengerBogies + "\n");

		passengerBogies.remove("AC Chair");
		System.out.println("After Removing AC Chair:");
		System.out.println("Passenger Bogies:"+passengerBogies+"\n");

		boolean containsSleeper = passengerBogies.contains("Sleeper");
		System.out.println("Checking if Sleeper exists:");
		System.out.println("Contains Sleeper?:"+containsSleeper+"\n");

		System.out.println("Final Train Passenger Consist:"+passengerBogies);
	}
}
