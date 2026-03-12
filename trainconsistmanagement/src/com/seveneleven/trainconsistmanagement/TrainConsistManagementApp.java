// Use Case-19:Binary Search for Bogie ID
// Searching for a specific bogie ID using Binary Search algorithm.
// @author Developer
// @version 19.0
package com.seveneleven.trainconsistmanagement;
import java.util.Arrays;
public class TrainConsistManagementApp {
	public static void main(String[] args){
		String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
		Arrays.sort(bogieIds);
		String key = "BG309";
		System.out.println("Sorted Bogie IDs:");
		for (String id : bogieIds) {
			System.out.println(id);
		}
		int low = 0;
		int high = bogieIds.length - 1;
		boolean found = false;
		while (low <= high) {
			int mid = (low + high) / 2;
			int result = key.compareTo(bogieIds[mid]);
			if (result == 0) {
				found = true;
				break;
			} 
			else if (result > 0) {
				low = mid + 1;
			} 
			else {
				high = mid - 1;
			}
		}
		if(found){
			System.out.println("\nBogie "+key+ " found in train consist");
		} 
		else{
			System.out.println("\nBogie "+key+" not found in train consist");
		}
	}
}