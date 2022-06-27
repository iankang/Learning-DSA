import java.util.HashSet;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import java.util.Set;

public class SetTest {

  public static void main(String[] args) {

    String[] colors = {"red", "white", "blue", "green", "gray",
        "orange", "tan", "white", "cyan", "peach", "gray", "orange"}; 
    
    List<String> list = Arrays.asList(colors);

    printNonDuplicates(list);

  }

  private static void printNonDuplicates(Collection<String> values) {
  
    Set<String> set = new HashSet<>(values);

    System.out.printf("%n Non duplicates are: "); 

    for(String value : set) {
      System.out.printf("%s ", value);
    }  

    System.out.println();

  }

}