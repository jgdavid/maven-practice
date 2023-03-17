import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import hello.Calculator;

public class CalcTest {
	
	
	private Calculator calc = new Calculator();
	
	
	@Test
	void testAdd() {
		assertEquals(10, this.calc.add(3,7));
		
			
		
	}
}
