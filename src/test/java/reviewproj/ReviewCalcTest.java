package reviewproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReviewCalcTest {

	@Test
	public void testAdd() {
		CalcReview r = new CalcReview();
		r.add(10,20);
		assertEquals(30, r.getResult());	
	}
	
	@Test
	public void testMulti()
	{
		CalcReview r = new CalcReview();
		r.multi(10,3);
		assertEquals(20,r.getResult());
	}

}
