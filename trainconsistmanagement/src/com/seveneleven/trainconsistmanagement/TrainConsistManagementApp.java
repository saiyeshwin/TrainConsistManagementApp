// Use Case-01:Initialize Train and Display Consist Summary
// This class is the entry point for Train Consist Management App
// Creates a list to store bogies, displays no of bogies and current state of train
// @author Developer
// @version 1.0

package com.seveneleven.trainconsistmanagement;
import java.util.*;
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		System.out.println("---Train Consist Management App---");
		List<String> trainConsist=new ArrayList<>();
		System.out.println("Train initialized successfully!");
		System.out.println("Initial bogie count:"+trainConsist.size());
		System.out.println("Current train consist:"+trainConsist);
		System.out.println();
		System.out.println("System ready for operations");
	}
}
