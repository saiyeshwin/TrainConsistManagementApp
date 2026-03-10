// Use Case-03: Track Unique Bogie IDs
// This class ensures that duplicate bogie IDs are not added into the train formation using HashSet.
// @author Developer
// @version 3.0

package com.seveneleven.trainconsistmanagement;
import java.util.*;
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		Set<String> bogieIDs = new HashSet<>();
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");
        
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs);

        System.out.println();
        System.out.println("Duplicates are automatically ignored by HashSet");
	}
}
