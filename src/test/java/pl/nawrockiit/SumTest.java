package pl.nawrockiit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumTest {
    Sum s = new Sum();

    @Test
    public void Test(){
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }
}
