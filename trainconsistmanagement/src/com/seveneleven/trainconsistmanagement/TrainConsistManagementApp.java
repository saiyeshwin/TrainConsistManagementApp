// Use Case-08:  Filter Passenger Bogies Using Streams
// Filters passenger bogies based on seating capacity using Java Streams
// @author Developer
// @version 8.0

package com.seveneleven.trainconsistmanagement;
import java.util.*;
import java.util.stream.Collectors;
public class TrainConsistManagementApp {
	static class Bogie{
		String name;
		int capacity;
		public Bogie(String name,int capacity) {
			this.name=name;
			this.capacity=capacity;
		}
		@Override
		public String toString() {
			return name + "->" + capacity;
		}
	}
	public static void main(String[] args) {
		List<Bogie> bogies=new ArrayList<>();
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Cargo",120));
		bogies.add(new Bogie("AC Chair",56));
		System.out.println("Initial bogies\n");
		for (Bogie b : bogies) {
			System.out.println(b);
		}
		List<Bogie> filteredBogies=bogies.stream().filter(b -> b.capacity > 60).collect(Collectors.toList());

		System.out.println("\nFiltered Bogies(Capacity>60):");
		for (Bogie b:filteredBogies) {
			System.out.println(b);
		}
		System.out.println();
	}
}
