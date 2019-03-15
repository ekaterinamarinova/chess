import org.junit.Assert;
import org.junit.Test;

public class TestJunit {
    @Test
    public void testAdd() {
        String s = "Working";
        Assert.assertEquals("Working", s);
    }
}
