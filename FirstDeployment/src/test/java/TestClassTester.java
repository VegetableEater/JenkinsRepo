import org.junit.Test;
import static org.junit.Assert.*;

public class TestClassTester {
	@Test
	public void test() {
		assertEquals("Should return true", true, (new TestClass()).test());
	}
	public void test1() {
		assertEquals("Should return true", true, (new TestClass()).test());
	}
}
