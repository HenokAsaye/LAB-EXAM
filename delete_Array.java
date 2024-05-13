package question_no_6;
import java.util.Arrays;

public class delete_Array {
	public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2;

        int[] modifiedArray = deleteElement(array, indexToDelete);

        if (modifiedArray != null) {
            System.out.println("Modified Array: " + Arrays.toString(modifiedArray));
        }
    }

    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 && index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }

        int[] modifiedArray = new int[array.length - 1];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                modifiedArray[newIndex] = array[i];
                newIndex++;
            }
        }

        return modifiedArray;
    }
}


