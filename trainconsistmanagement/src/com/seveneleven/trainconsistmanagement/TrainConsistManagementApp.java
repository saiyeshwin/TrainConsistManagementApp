// Use Case-17: Sort Bogies Names Using Arrays.sort()
// Sorting of bogie type names using inbuilt Arrays.sort()
// @author Developer
// @version 17.0
package com.seveneleven.trainconsistmanagement;
import java.util.Arrays;
public class TrainConsistManagementApp {
	public static void main(String[] args){
		String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
		System.out.println("Original Bogie Names:");
		System.out.println(Arrays.toString(bogieNames));

		Arrays.sort(bogieNames);
		System.out.println("\nSorted Bogie Names:");
		System.out.println(Arrays.toString(bogieNames));
	}
}