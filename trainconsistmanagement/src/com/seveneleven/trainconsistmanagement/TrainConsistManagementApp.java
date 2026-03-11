// Use Case-10:Count Total Seats in Train
// calculate the total seating capacity of all bogies combined using Java Stream API and Collectors.groupingBy
// @author Developer
// @version 10.0

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
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("AC Chair", 56));
		bogies.add(new Bogie("First Class", 24));
		bogies.add(new Bogie("General", 90));

		System.out.println("Initial bogies\n");
		for (Bogie b : bogies) {
			System.out.println(b);
		}
		int totalSeats=bogies.stream().mapToInt(b->b.capacity).sum();

		System.out.println("\nTotal Seats in Train Formation:"+totalSeats);
	}
}
