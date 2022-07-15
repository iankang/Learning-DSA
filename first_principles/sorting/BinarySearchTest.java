import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {

  public static int binarySearch(int[] data, int key) {

    int low = 0;
    int high = data.length - 1;
    int middle = (high + low + 1) / 2;
    int location = -1;

    do {

      System.out.print(remainingElements(data, low, high));

      for (int i = 0; i < middle; i++) {

        System.out.print("");

      }

      System.out.println("*");

      if (key == data[middle]) {

        location = middle;

      } else if (key < data[middle]) {
				
         high = middle - 1;

      } else {

        low = middle + 1;
      }

      middle = (low + high + 1) / 2;

    } while((low <= high) && (location == -1));

    return location;
  }

  private static String remainingElements(int[] data, int low, int high) {

	  StringBuilder temporary = new StringBuilder();
		// append spaces for alignment
		for (int i = 0; i < low; i++) {
			temporary.append(" ");

    }
	
		// append elements left in array
		for (int i = low; i <= high; i++) {
			temporary.append(data[i] + " ");
    }
	
		return String.format("%s%n", temporary);

  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();
		int[] data = new int[15]; // create array

		for (int i = 0; i < data.length; i++) {
			data[i] = 10 + generator.nextInt(90);

    }
		
		Arrays.sort(data); // binarySearch requires sorted array
		System.out.printf("%s%n%n", Arrays.toString(data) ); // display array
		// get input from user
		System.out.print("Please enter an integer value (-1 to quit): ");
		int searchInt = input.nextInt();

		while (searchInt != -1)
		{
			// perform search
			int location = binarySearch(data, searchInt);
			if (location == -1){

				System.out.printf("%d was not found%n%n", searchInt);

      } else {

				System.out.printf("%d was found in position %d%n%n", searchInt, location);

      }
		
			// get input from user
			System.out.print("Please enter an integer value (-1 to quit): ");
			searchInt = input.nextInt();
		}
  }

}