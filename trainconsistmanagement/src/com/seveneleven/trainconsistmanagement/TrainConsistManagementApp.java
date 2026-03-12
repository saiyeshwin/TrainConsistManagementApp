// Use Case-13:Performance Comparison (Loops vs Streams)
// compares the performance of loop-based filtering versus stream-based filtering using System.nanoTime()
// @author Developer
// @version 13.0
package com.seveneleven.trainconsistmanagement;
import java.util.*;
import java.util.stream.Collectors;
public class TrainConsistManagementApp {
	static class Bogie {
		String name;
		int capacity;
		Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}
		@Override
		public String toString() {
			return name +"->"+ capacity;
		}
	}

	public static void main(String[] args) {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("AC Chair", 56));
		bogies.add(new Bogie("First Class", 24));
		bogies.add(new Bogie("General", 90));

		long loopStart = System.nanoTime();
		List<Bogie> loopFiltered = new ArrayList<>();
		for (Bogie b:bogies) {
			if (b.capacity>50) {
				loopFiltered.add(b);
			}
		}
		long loopEnd = System.nanoTime();
		long loopDuration=loopEnd-loopStart;

		long streamStart = System.nanoTime();
		List<Bogie> streamFiltered = bogies.stream().filter(b -> b.capacity > 50).collect(Collectors.toList());
		long streamEnd = System.nanoTime();
		long streamDuration = streamEnd - streamStart;

		System.out.println("Loop Execution Time(ns):" +loopDuration);
		System.out.println("Stream Execution Time(ns):"+streamDuration);
	}
}
