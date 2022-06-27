
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

  public static void main(String[] args) {

    String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
    List<String> list = new ArrayList<String>();
    String[] removeColors = {"RED", "WHITE", "BLUE"};
    List<String> removeColorsList = new ArrayList<String>();

    for (String color : colors) {
      list.add(color);
    }

    for (String color : removeColors) {
      removeColorsList.add(color);
    }

    removeColors(list, removeColorsList);

    for (String color : list) {
      System.out.printf("%s ", color);
    }
  }

  private static void removeColors(Collection<String> collection1, Collection<String> collection2) {

    Iterator<String> iterator = collection1.iterator();

    while (iterator.hasNext()) {
      if (collection2.contains(iterator.next())) {
        iterator.remove();
      }
    }
  }
}
