import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Arrays;

public class SortedSetTest {

  public static void main(String[] args) {
    String[] colors = {"yellow", "green", "black", "tan", "grey",
        "white", "orange", "red", "green"};

    SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
   
    System.out.print("sorted set: ");
    printSet(tree);

		System.out.print("headSet (\"orange\") ");
		printSet(tree.headSet("orange"));
  
    // get tailSet based upon "orange"
		System.out.print("tailSet (\"orange\") ");
		printSet( tree.tailSet("orange"));

		// get first and last elements
		System.out.printf("first: %s%n", tree.first() );
		System.out.printf("last : %s%n", tree.last() );

  }

  private static void printSet(SortedSet<String> set) {
  
    for(String s : set) {
    
      System.out.printf("%s ", s);
  
    }  

     System.out.println();

  }

}