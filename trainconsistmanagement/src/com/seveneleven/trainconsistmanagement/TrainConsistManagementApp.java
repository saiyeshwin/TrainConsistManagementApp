// Use Case-14:Handle Invalid Bogie Capacity
// Prevents invalid passenger bogies from being created
// If a bogie has zero or negative capacity, a custom exception is thrown.
// @author Developer
// @version 14.0
package com.seveneleven.trainconsistmanagement;
import java.util.*;
class InvalidCapacityException extends Exception {
	public InvalidCapacityException(String message) {
		super(message);
	}
}
public class TrainConsistManagementApp {
	static class Bogie {
		String name;
		int capacity;
		Bogie(String name, int capacity) throws InvalidCapacityException {
			if (capacity<= 0) {
				throw new InvalidCapacityException("Capacity must be greater than zero");
			}
			this.name = name;
			this.capacity = capacity;
		}
		@Override
		public String toString() {
			return name+"->"+capacity;
		}
	}

	public static void main(String[] args) {
		try {
			Bogie sleeper = new Bogie("Sleeper",72);
			System.out.println("Created Bogie:"+sleeper);
			Bogie faulty = new Bogie("Cargo",-4);
			System.out.println("Created Bogie:"+faulty);
		} 
		catch (InvalidCapacityException e) {
			System.out.println("Error:" + e.getMessage());
		}
	}
}