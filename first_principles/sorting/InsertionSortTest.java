import java.security.SecureRandom;
import java.util.Arrays;

public class InsertionSortTest {

  public static void insertionSort(int[] data) {

      for (int next = 1; next < data.length; next++) {
        int insert = data[next];
        int moveItem = next;

        while (moveItem > 0 && data[moveItem - 1] > insert) {
         
          data[moveItem] = data[moveItem - 1];
          moveItem--;

        }
        data[moveItem] = insert;
        printPass(data, next, moveItem);
      }
    }
  

  private static void printPass(int[] data, int pass, int index) {
  
    System.out.printf("after pass %2d: ", pass);
		// output elements till selected item
		for (int i = 0; i < index; i++) {
      System.out.printf("%d ", data[i]);
    }
		
		System.out.printf("%d* ", data[index]); // indicate swap
		// finish outputting array
		for (int i = index + 1; i < data.length; i++) {
			System.out.printf("%d ", data[i]);
    }
		
		System.out.printf("%n               "); // for alignment
		// indicate amount of array that’s sorted
		for (int j = 0; j < pass; j++) {
			System.out.print("-- ");
		}
    System.out.println();
  }

  public static void main(String[] args) {

    SecureRandom generator = new SecureRandom();
	  int[] data = new int[10]; // create array

		for (int i = 0; i < data.length; i++) {
      data[i] = 10 + generator.nextInt(90);
    }
		
		System.out.printf("Unsorted array:%n%s%n%n",
		Arrays.toString(data)); // display array
		insertionSort(data); // sort array
		System.out.printf("Sorted array:%n%s%n%n",
		Arrays.toString(data));
  }
}