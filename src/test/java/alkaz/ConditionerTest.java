package alkaz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static alkaz.Main.work;

public class ConditionerTest {
    @Test
    public void test1(){
        Assertions.assertEquals(10, work(10, 20, "freeze"));
        Assertions.assertEquals(20, work(10, 20, "heat"));
    }
    @Test
    public void test2(){
        Assertions.assertEquals(10, work(10, 20, "fan"));
        Assertions.assertEquals(20, work(10, 20, "auto"));
        Assertions.assertEquals(-273, work(10, 20, "abcd"));
    }
    @Test
    public void test3(){
        Assertions.assertEquals(1, work(1, 1, "fan"));
        Assertions.assertEquals(1, work(1, 1, "auto"));
        Assertions.assertEquals(1, work(1, 1, "heat"));
        Assertions.assertEquals(1, work(1, 1, "freeze"));
    }

}
