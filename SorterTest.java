import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SorterTest {

	@Test
	void test_feature1() {
		String[] names = {
				"John",
				"Abigail",
				"Roy",
				"Yon",
				"Zee"
		};
		
		String[] actual = Sorter.sort(names);
		
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
	
	@Test
	void test_feature2() {
		String[] string_numbers = {
				"3",
				"2",
				"1",
				"7",
				"9"
		};
		
		String[] actual = Sorter.sort(string_numbers);
		
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
