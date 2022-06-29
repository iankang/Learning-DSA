
import com.kangethe.datastructures.StackComposition;
import com.kangethe.datastructures.EmptyListException;

public class StackInheritanceTest {

  public static void main(String[] args) {

	  StackComposition<Integer> stack = new StackComposition<>();

	  stack.push(-1);
		stack.print();
		stack.push(0);
		stack.print();
		stack.push(1);
		stack.print();
		stack.push(5);
		stack.print();

	  try {
	   
	    int removedItem;
	    
	    while( true ) {
	      removedItem = stack.pop();
	      System.out.printf("%n%d popped %n", removedItem);
	      stack.print();
	    }

	  } catch (EmptyListException emptyListException) {

	  }
  }

}