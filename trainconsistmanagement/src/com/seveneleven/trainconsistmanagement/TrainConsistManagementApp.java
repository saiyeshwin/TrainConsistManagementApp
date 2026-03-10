// Use Case-04: Maintain Ordered Bogie IDs 
// HashSet does not preserve order.
// A train consists must follow a physical sequence, so a LinkedList is used to maintain order
// @author Developer
// @version 4.0

package com.seveneleven.trainconsistmanagement;
import java.util.*;
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		List<String> trainConsist=new LinkedList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Initial train consist:");
        System.out.println(trainConsist);
        System.out.println();
       
        trainConsist.add(2,"Pantry Car");
        System.out.println("After inserting Pantry Car at index 2:");
        System.out.println(trainConsist);
        System.out.println();
        
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing first and last bogie:");
        System.out.println(trainConsist);
	}
}
