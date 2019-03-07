
public class SickPerson extends Person{

	private String name;
	private int age;
	private int severity;
	
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.severity = severity;
	}
	
	public int compareToImpl(Person p) {		// need to figure out how to sort by severity
		if(name.compareTo(p.getName()) < 0) {
			return -1;
		}
		if (name.equals(p.getName())) {
			return 0;
		}
		else{
			return 1;
		}		
	}
	private int compareToImpl(SickPerson p) {		// need to figure out how to sort by severity
		if(severity < p.getSeverity()) {
			return -1;
		}
		if (severity == p.getSeverity()) {
			return 0;
		}
		else{
			return 1;
		}		
	}
	
	private int getSeverity() {
		return severity;
	}
	
	public String toString() {
		return String.format("%s, a %d-year old with a %d severity.", name, age, severity);
	}
}
