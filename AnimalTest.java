import org.junit.Test;

import junit.framework.Assert;

public class AnimalTest {

	@Test
	public void AnimalTest() {
		Animal a = new Animal("cat", 13);
		
		Assert.assertEquals("Wrong breed output",  "cat", a.getBreed());
		Assert.assertEquals("Wrong age output", 13, a.getAge());
		Assert.assertEquals("Wrong toSting output", "A 13-year old cat.", a.toString());
	}
	
	@Test
	public void AnimalCompareToTest() {
		Animal b = new Animal("fish", 2);
		Animal c = new Animal("horse", 12);
		Animal d = new Animal("duck", 2);
		
		Assert.assertEquals("Wrong comparison output",  10, b.compareTo(c));
		Assert.assertEquals("Wrong comparison output",  -10, c.compareTo(b));
		Assert.assertEquals("Incorrectly states unequal",  0, d.compareTo(b));
	}
}
