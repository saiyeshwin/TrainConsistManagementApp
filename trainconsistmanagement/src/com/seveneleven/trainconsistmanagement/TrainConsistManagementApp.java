// Use Case-18:Linear Search for Bogie ID
// Searching for a specific bogie ID using Linear Search algorithm.
// @author Developer
// @version 18.0
package com.seveneleven.trainconsistmanagement;
import java.util.Arrays;
public class TrainConsistManagementApp {
	public static void main(String[] args){
		String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
		String searchId = "BG309";
		System.out.println("Available Bogie IDs:");
		for (String id : bogieIds) {
			System.out.println(id);
		}

		boolean found = false;
		for (String id : bogieIds) {
			if (id.equals(searchId)) {
				found = true;
				break;
			}
		}
		if(found){
			System.out.println("\nBogie "+searchId+ " found in train consist");
		} 
		else{
			System.out.println("\nBogie "+searchId+" not found in train consist");
		}
	}
}