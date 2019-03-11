import org.junit.Assert;
import org.junit.Test;


public class PersonTest {

	@Test
	public void HealthyPersonTest() {
		Person a = new HealthyPerson("Anne", 28, "checkup");
		
		Assert.assertEquals("Wrong Name output", "Anne", a.getName());
		Assert.assertEquals("Wrong age output",  28, a.getAge());
		Assert.assertEquals("Wrong toString output", "Anne In for checkup", a.toString());
	}
	
	@Test
	public void SickPersonTest() {
		Person b = new SickPerson("David", 56, 5);
		
		Assert.assertEquals("Wrong name output",  "David", b.getName());
		Assert.assertEquals("Wrong age output",  56, b.getAge());
		Assert.assertEquals("Wrong toSting output", "David Severity level 5", b.toString());
	}
	
	@Test
	public void HealthyPersonCompareToImplTest() {
		Person h1 = new HealthyPerson("Anne", 28, "checkup");
		Person h2 = new HealthyPerson("Joe", 77, "donation");
		Person h3 = new HealthyPerson("Anne", 35, "testing");
		Person s1 = new SickPerson("David", 56, 5);
		
		Assert.assertEquals("Wrong comarison output",  -1, h1.compareTo(h2));
		Assert.assertEquals("Wrong comparison output", 1, h2.compareTo(h1));
		Assert.assertEquals("Incorrectly stated not equal",  0, h1.compareTo(h3));
		Assert.assertEquals("incorrectly compred sick and healthy people",  0, h1.compareTo(s1));
	}
	
	@Test
	public void SickPersonCompareToImplTest() {
		Person s1 = new SickPerson("David", 56, 5);
		Person s2 = new SickPerson("Ned", 44, 3);
		Person s3 = new SickPerson("Zeke", 10, 5);
		Person s4 = new SickPerson("Ned", 36, 3);
		Person h1 = new HealthyPerson("Sarah", 45, "checkup");
		
		Assert.assertEquals("Wrong comparison output", -2, s1.compareTo(s2));
		Assert.assertEquals("Wrong comparison output", 2, s2.compareTo(s1));
		Assert.assertEquals("Wrong comparison output", 0, s1.compareTo(s3));
		Assert.assertEquals("Incorrectly stated not equal", 0, s2.compareTo(s4));
		Assert.assertEquals("incorrectly compred sick and healthy people",  0, s1.compareTo(h1));
	}
	
	@Test
	public void SickPersonCompareToTest() {
		Person s1 = new SickPerson("Heidi", 23, 2);
		Person h1 = new HealthyPerson("Mandar", 24, "checkup");
		
		Assert.assertEquals("Wrong comparison output",  0, s1.compareToImpl(h1));
	}
}
