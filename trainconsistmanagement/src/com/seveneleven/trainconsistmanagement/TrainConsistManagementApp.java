// Use Case-09:Group Bogies by Type
// Group passenger bogies by their type using Java Stream API and Collectors.groupingBy.
// @author Developer
// @version 9.0

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
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("AC Chair", 56));
		bogies.add(new Bogie("First Class", 24));
		bogies.add(new Bogie("Sleeper", 70));
		bogies.add(new Bogie("AC Chair", 60));

		System.out.println("Initial bogies\n");
		for (Bogie b : bogies) {
			System.out.println(b);
		}
		Map<String,List<Bogie>> groupedBogies=bogies.stream().collect(Collectors.groupingBy(b->b.name));

		System.out.println("\nGrouped Bogies:");
		for (Map.Entry<String,List<Bogie>>entry:groupedBogies.entrySet()){
			System.out.println("\nBogie Type:"+entry.getKey());
			for (Bogie b:entry.getValue()){
				System.out.println(" Capacity->"+b.capacity);
			}
		}
	}
}
