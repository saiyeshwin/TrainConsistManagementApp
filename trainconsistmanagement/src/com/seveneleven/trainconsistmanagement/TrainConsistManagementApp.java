// Use Case-11:Validate Train ID & Cargo Codes
// validates Train IDs and Cargo Codes using Regex
// @author Developer
// @version 11.0
package com.seveneleven.trainconsistmanagement;
import java.util.*;
import java.util.regex.*;
public class TrainConsistManagementApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String trainIdPattern = "^TRN-\\d{4}$";
        String cargoCodePattern = "^PET-[A-Z]{2}$";

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Matcher trainMatcher = trainPattern.matcher(trainId);
        boolean trainValid = trainMatcher.matches();

        Pattern cargoPattern = Pattern.compile(cargoCodePattern);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        boolean cargoValid = cargoMatcher.matches();
        
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid:"+trainValid);
        System.out.println("Cargo Code Valid:"+cargoValid);
    }
}
