import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SorterTest {

	@Test
	void test() {
		String[] names = {
				"John",
				"Abigail",
				"Roy",
				"Yon",
				"Zee"
		};
		
		String[] actual = Sorter.sort_names(names);
		
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

}
