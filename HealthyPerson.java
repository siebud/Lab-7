
public class HealthyPerson extends Person {


	private String name;
	private int age;
	private String reason;
	
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.reason = reason;
	}
	
	protected int compareToImpl(Person p) {
		if(name.compareTo(p.getName()) > 1) {
			return -1;
		}
		else if (name.contentEquals(p.getName())) {
			return 0;
		}
		else
			return 1;
	}
	
	public String toString() {
		return String.format("%s, a %d-year old, came to the hospital for %s", name, age, reason);
	}
}
