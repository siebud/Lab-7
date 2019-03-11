
public class SickPerson extends Person{

	private String name;
	private int severity;
	
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.name = name;
		this.severity = severity;
	}
	
	public int compareToImpl(Person p) {		// need to figure out how to sort by severity
		if (!(p instanceof SickPerson)) {
			return 0;		
		}
		else {
			return ((SickPerson) p).getSeverity() - severity;
		}
	}
	
	private int getSeverity() {
		return severity;
	}
	
	public String toString() {
		return String.format("%s Severity level %d", name, severity);
	}
}
