// Use Case-15:Safe Cargo Assignment Using try-catch-finally
// Prevents invalid passenger bogies from being created
// If a bogie has zero or negative capacity, a custom exception is thrown.
// @author Developer
// @version 15.0
package com.seveneleven.trainconsistmanagement;
public class TrainConsistManagementApp {
	static class CargoSafetyException extends RuntimeException {
		public CargoSafetyException(String message) {
			super(message);
		}
	}
	static class GoodsBogie {
		String shape;
		String cargo;
		GoodsBogie(String shape) {
			this.shape = shape;
		}
		void assignCargo(String cargo) {
			try {
				if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
					throw new CargoSafetyException("Unsafe cargo assignment!");
				}
				this.cargo = cargo;
				System.out.println("Cargo assigned successfully-" + cargo);
				System.out.println("Cargo validation completed for "+shape+" bogie");
			} 
			catch (CargoSafetyException e) {
				System.out.println("Error:"+ e.getMessage());
				System.out.println("Cargo validation completed for " + shape + " bogie");
			} 
			finally {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
		cylindrical.assignCargo("Petroleum");

		GoodsBogie rectangular = new GoodsBogie("Rectangular");
		rectangular.assignCargo("Petroleum");
	}
}