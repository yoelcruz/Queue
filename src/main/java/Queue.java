import java.util.Collection;
import java.util.LinkedList;
//las excepciones se ponen en la interfaz
//en el test (expected =pilallena)
public interface Queue <E> {
   public void push (E e) throws QueueFullException;
   public E pop() throws QueueEmptyException;
   public int size();
}
