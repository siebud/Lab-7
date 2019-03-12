/**
 * Class representing a HealthyPerson who will be admitted to a Hospital.
 *
 * @author Sierra
 * @version 2019-03-11
 */
public class HealthyPerson extends Person {


	private String name;
	private String reason;
	
	/**
	 * Stores the name, age, and reason for visit of the Person.
	 *
	 * @param name The Person's name.
	 * @param reason The Person's reason for visiting the hospital.
	 */
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.name = name;
		this.reason = reason;
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
	protected int compareToImpl(Person p) {
		if (!(p instanceof HealthyPerson)) {
			return 0;
		}
		if(name.compareTo(p.getName()) < 0) {	// sort by name alphabetically
			return -1;
		}
		else if (name.contentEquals(p.getName())) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	/**
	 * Gives some information about the Person.
	 *
	 * @return The string "%s In for %s" with replacements of the Person's name and reason.
	 */
	public String toString() {
		return String.format("%s In for %s", name, reason);
	}
}
