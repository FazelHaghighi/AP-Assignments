package challenge2;

import org.junit.jupiter.api.Test;
import java.util.Stack;
import static org.junit.jupiter.api.Assertions.*;

public class test {
    Stack stack = new Stack();
    @Test
    public void Test(){
        assertEquals("ali",stack.push("ali"));
        assertEquals("ali",stack.pop());
        stack.push("ali");
        stack.push("mohammad");
        assertEquals("mohammad",stack.peek());
        assertFalse(stack.empty());
        assertEquals(2,stack.search("ali"));
        stack.pop();
        assertEquals(1,stack.search("ali"));
        stack.pop();
        assertEquals(-1,stack.search("ali"));
        assertTrue(stack.empty());
    }
}
