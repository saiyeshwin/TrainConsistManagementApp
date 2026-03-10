// Use Case-05:  Preserve Insertion Order of Bogies
// A train consist must follow a physical sequence but also must be unique
// Hence we use a LinkedHashSet
// @author Developer
// @version 5.0

package com.seveneleven.trainconsistmanagement;
import java.util.*;
public class TrainConsistManagementApp {
	public static void main(String[] args) {
		Set<String> trainConsist=new LinkedHashSet<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        trainConsist.add("Guard");
        System.out.println("Final train consist:");
        System.out.println(trainConsist);
        System.out.println("\nLinkedHashSet ensures insertion order and ensures uniqueness");
       
	}
}
