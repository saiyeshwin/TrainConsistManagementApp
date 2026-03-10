// Use Case-06: Map Bogie to Capacity
// Stores bogie types as keys
// Maps each bogie to its capacity
// Displays bogie-capacity details
// @author Developer
// @version 6.0

package com.seveneleven.trainconsistmanagement;
import java.util.*;
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		Map<String,Integer> capacityMap=new HashMap<>();
        capacityMap.put("First Class",24);
        capacityMap.put("Cargo",120);
        capacityMap.put("Sleeper",72);
        capacityMap.put("AC Chair",56);
        System.out.println("Bogie capacity detials:\n");
        for(Map.Entry<String,Integer> entry:capacityMap.entrySet()) {
        	System.out.println(entry);
        }
	}
}
