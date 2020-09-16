import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SorterTest {

	// FEATURE ONE TEST
	@Test
	void test_feature1() {
		String[] inputs = {
				"John",
				"Abigail",
				"Roy",
				"Yon",
				"Zee"
		};
		
		String[] actual = Sorter.sort(inputs);
		
		String[] expected = {
			"Abigail",
			"John",
			"Roy",
			"Yon",
			"Zee"
		};
		
		for(int i = 0; i < actual.length; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}
	
	// FEATURE TWO TEST
	@Test
	void test_feature2() {
		String[] inputs = {
				"3",
				"2",
				"1",
				"7",
				"9"
		};
		
		String[] actual = Sorter.sort(inputs);
		
		String[] expected = {
			"1",
			"2",
			"3",
			"7",
			"9"
		};
		
		for(int i = 0; i < actual.length; i++) {
			assertEquals(actual[i], expected[i]);
		}
	}

}
