import org.junit.Test;
import static org.junit.Assert.*;


public class MyArrayListTest {

    @Test
    public void testAdd() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
    }

    @Test
    public void testGet() {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        int value = list.get(1);
        assertEquals(2, value);
    }

    @Test
    public void testRemove() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("one");
        list.add("two");
        list.remove(0);
        assertEquals("two", list.get(0));
    }

    @Test
    public void testSize() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("hello");
        list.add("world");
        assertEquals(2, list.size());
    }
}