import java.util.ArrayList;
import java.util.Collections;

/**
 * Class representing a Hospital. Stores a collection of patients who are waiting to receive
 * medical treatment. Patients are treated one at a time by First in First out, but also by comparisons using Person subclasses compareToImpl methods. Once a patient is treated,
 * it is removed from the Hospital.
 *
 * Hospitals may have different types of patients, Person or Animal.
 *
 * @author Sierra B
 * @version 2019-03-11
 * @param <PatientType> The generic type for the type of patient that the Hospital accepts.
 */
public class PriorityQueueHospital<PatientType extends Comparable> extends Hospital{
	
	ArrayList<PatientType> list = new ArrayList<>();

	/**
	 * Overrides Hospital addPatient method to add a patient to the hospital at the end of the list, then re-sorts the list
	 *
	 * @param patient The patient to be added.
	 */
	@Override
	public void addPatient(Object patient) {
		// TODO Auto-generated method stub
		list.add((PatientType) patient);
		Collections.sort(list);	// sorts ArrayList based on the ordering defined in the Person subclasses compareToImpl
	}

	/**
	 * Implements Hospital nextPatient method
	 * Find and return the patient who will next be treated. Does not treat the patient (i.e. it is not
	 * removed from the collection of patients that the hospital still must treat).
	 *
	 * @return The patient who would be next treated.
	 */
	@Override
	public Object nextPatient() {
		// TODO Auto-generated method stub
		return list.get(0);
	}

	/**
	 * Implements Hospital treatPatient method
	 * Treats the next patient and removes them from the Hospital. Once someone is healed they
	 * no longer need to stay in the Hospital.
	 *
	 * @return The patient receiving treatment.
	 */
	@Override
	public Object treatNextPatient() {
		// TODO Auto-generated method stub
		Object ans = new Object();		//creates new object to return, so save and return the object that is getting deleted
		ans = list.get(0);
		list.remove(0);
		return ans;
	}

	/**
	 * Implements Hospital numPatients method
	 * Calculate and return the number of patients still in the hospital (untreated).
	 *
	 * @return The number of patients in the Hospital.
	 */
	@Override
	public int numPatients() {
		// TODO Auto-generated method stub
		return list.size();
	}

	/**
	 * Implements Hospital hospitalType method
	 * Gives a String for the hospital type.
	 *
	 * @return A string exactly matching the class name.
	 */
	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return "PriorityQueueHospital";
	}

	/**
	 * Overrides Hospital allPatientInfo method
	 * Returns some information about the Hospital and its occupancy.
	 *
	 * @return The string "A %s-type hospital with %d patients.", with replacements of the hospitalType
	 * and the number of patients.
	 */
	@Override
	public String allPatientInfo() {
		// TODO Auto-generated method stub
		String ans = "";
		for(Object single : list) {
			ans += single.toString();
		}
		return ans;
	}

}
