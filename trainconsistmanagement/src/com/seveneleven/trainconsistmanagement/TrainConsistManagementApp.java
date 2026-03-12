// Use Case-16: Sort Passenger Bogies by Capacity (Bubble Sort)
// Manual sorting of passenger bogie capacities using the Bubble Sort algorithm
// @author Developer
// @version 16.0
package com.seveneleven.trainconsistmanagement;
public class TrainConsistManagementApp {
	public static void main(String[] args){
		int[] capacities= {72,56,24,70,60};
		System.out.println("Original Capacities:");
		for (int c:capacities) {
			System.out.print(c+" ");
		}
		for (int i=0;i<capacities.length-1;i++){
			for (int j=0;j<capacities.length-i-1;j++) {
				if (capacities[j] > capacities[j+1]) {
					int temp = capacities[j];
					capacities[j]=capacities[j+1];
					capacities[j+1]=temp;
				}
			}
		}
		System.out.println("\nSorted Capacities:");
		for (int c : capacities) {
			System.out.print(c + " ");
		}
	}
}