package Java1Collection;

import java.util.Scanner;

public class patternPrint {
  
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter: ");
	        int n = sc.nextInt();

	        if (n % 2 == 0) {
	            System.out.println("No working");
	        } else {
	            // First part: Inverted triangle of '@'
	            for (int row = 0; row < n / 2 + 1; row++) {
	            	
	                for (int col = 0; col < 2 * row; col++) {
	                    System.out.print(" ");
	                
	                }
	                for (int col = 0; col < n - 2 * row; col++) {
	                    System.out.print("@");
	                }
	                System.out.println();
	            }

	            // Second part: Hollow rectangle with '*'
	            for (int row = 0; row < n; row++) {
	                for (int col = 0; col < n; col++) {
	                    if (row == 0 || col == 0 || col == n - 1) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }
	        }

	        sc.close();
	    }
}
