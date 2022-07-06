import com.kangethe.datastructures.ArrayQueue;

public class ArrayQueueTest {

  public static void main(String[] args) {

    ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
    arrayQueue.print(); 
   
    arrayQueue.add(1);
    arrayQueue.add(232);
    arrayQueue.add(342);
    arrayQueue.print();

  }

}