package Test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import System.Library;

public class TestLibrary {
	
	private final Library test = new Library();
	
	@Test
	public void testStart() {
		assertTrue(test.start());
	}
}