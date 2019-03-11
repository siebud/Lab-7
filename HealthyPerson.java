
public class HealthyPerson extends Person {


	private String name;
	private String reason;
	
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.name = name;
		this.reason = reason;
	}
	
	protected int compareToImpl(Person p) {
		if (!(p instanceof HealthyPerson)) {
			return 0;
		}
		if(name.compareTo(p.getName()) < 0) {
			return -1;
		}
		else if (name.contentEquals(p.getName())) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public String toString() {
		return String.format("%s In for %s", name, reason);
	}
}
