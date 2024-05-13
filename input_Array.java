package question_no_1;
import java.util.Scanner;

public class input_Array {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
	int n = input.nextInt();
	
	int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = input.nextInt();
    }

    System.out.print("Enter the number to be searched: ");
    int searchNum = input.nextInt();

    int count = 0;
    for (int num : arr) {
        if (num == searchNum) {
            count++;
        }
    }

    if (count > 0) {
        System.out.println(searchNum + " is present in the array " + count + " times.");
    } else {
        System.out.println(searchNum + " is not present in the array.");
    }

    input.close();
	}
}

	


