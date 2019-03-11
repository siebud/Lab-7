import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueueHospital<PatientType extends Comparable> extends Hospital{
	
	ArrayList<PatientType> list = new ArrayList<>();

	@Override
	public void addPatient(Object patient) {
		// TODO Auto-generated method stub
		list.add((PatientType) patient);
		Collections.sort(list);
	}

	@Override
	public Object nextPatient() {
		// TODO Auto-generated method stub
		return list.get(0);
	}

	@Override
	public Object treatNextPatient() {
		// TODO Auto-generated method stub
		Object ans = new Object();
		ans = list.get(0);
		list.remove(0);
		return ans;
	}

	@Override
	public int numPatients() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return "PriorityQueueHospital";
	}

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
