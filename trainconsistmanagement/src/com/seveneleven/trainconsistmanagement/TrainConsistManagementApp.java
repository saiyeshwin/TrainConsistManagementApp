// Use Case-07:  Sort Bogies by Capacity (Comparator)
// We sort passenger bogies by using comparator
// @author Developer
// @version 7.0

package com.seveneleven.trainconsistmanagement;
import java.util.*;
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
		System.out.println("Before Sorting\n");
		for (Bogie b : bogies) {
            System.out.println(b);
        }
		System.out.println();
		bogies.sort((b1,b2)->b1.capacity-b2.capacity);
		System.out.println("After Sorting \n");
		for (Bogie b : bogies) {
            System.out.println(b);
        }
		System.out.println();
	}
}
