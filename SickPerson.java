/**
 * Class representing a Sick Person who will be admitted to a Hospital.
 *
 * @author Sierra
 * @version 2019-03-11
 */
public class SickPerson extends Person{

	private String name;
	private int severity;
	
	/**
	 * Stores the name, age, and severity of the Person.
	 *
	 * @param name The Person's name.
	 * @param severity The Person's severity, out of 10.
	 */
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.name = name;
		this.severity = severity;
	}
	
	/**
	 * Subclass implementation of Person comparison.
	 *
	 * @param p The other person to compare to.
	 * @return Standard Comparable values:
	 * 	(1) self comes "before" p: negative number
	 *  (2) self comes "after" p: positive number
	 *  (3) self and p are equivalent in ordering: 0
	 */
	public int compareToImpl(Person p) {		// sort by severity
		if (!(p instanceof SickPerson)) {
			return 0;		
		}
		else {
			return ((SickPerson) p).getSeverity() - severity;
		}
	}
	
	/**
	 * Get Person's severity.
	 *
	 * @return Person's severity.
	 */
	private int getSeverity() {
		return severity;
	}
	
	/**
	 * Gives some information about the Person.
	 *
	 * @return The string "%s Severity level %d." with replacements of the Person's name and severity.
	 */
	public String toString() {
		return String.format("%s Severity level %d", name, severity);
	}
}
