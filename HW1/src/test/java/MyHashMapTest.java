import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyHashMapTest {

    @Test
    public void testPutAndGet() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("a", 1);

        int value = map.get("a");

        assertEquals(1, value);
    }

    @Test
    public void testPutAndGetWithCollision() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        int value = map.get("c");
        assertEquals(3, value);
    }
}
