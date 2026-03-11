// Use Case-12:Safety Compliance Check for Goods Bogies
// Validates goods bogies against safety rules using Streams and lambda
// It ensures that cylindrical bogies only carry petroleum, preventing unsafe cargo assignments.
// @author Developer
// @version 12.0
package com.seveneleven.trainconsistmanagement;
import java.util.*;
public class TrainConsistManagementApp {
    static class GoodsBogie{
        String type;
        String cargo; 
        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
        @Override
        public String toString() {
            return type + "->" + cargo;
        }
    }
    public static void main(String[] args) {
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical","Petroleum"));
        bogies.add(new GoodsBogie("Open","Coal"));
        bogies.add(new GoodsBogie("Box","Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        boolean isSafe=bogies.stream().allMatch(b->!(b.type.equals("Cylindrical") && !b.cargo.equals("Petroleum")));
        System.out.println("\nSafety Compliance Status:"+isSafe);
        if (isSafe){
            System.out.println("Train formation is SAFE.");
        } 
        else{
            System.out.println("Train formation is NOT SAFE.");
        }
    }
}
