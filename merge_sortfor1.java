package question_no_5;
import java.util.Scanner;

public class merge_sortfor1 {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the size of the array: ");
	 int size = input.nextInt();
	 int[] numbers = new int[size];
	 System.out.println("Enter " + size + " numbers:");
	 for (int i = 0; i < size; i++) {
	       numbers[i] = input.nextInt();
	  }

	 System.out.print("Enter the number to search: ");
	 int target = input.nextInt();
     int count = 0;
	 for (int num : numbers) {
		 if (num == target) {
			 count++;
	            }
	        }

	        
	        if (count > 0) {
	            System.out.println(target + " appears " + count + " times in the array.");
	        } else {
	            System.out.println(target + " is not found in the array.");
	        }

	        input.close();
	    }
	}

	