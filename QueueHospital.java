import java.util.LinkedList;

public class QueueHospital<PatientType> extends Hospital{

	LinkedList<Object> list = new LinkedList<>();
	
	@Override
	public void addPatient(Object patient) {
		// TODO Auto-generated method stub
		list.addLast(patient);
	}

	@Override
	public Object nextPatient() {
		// TODO Auto-generated method stub
		return list.peekFirst();
	}

	@Override
	public Object treatNextPatient() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	public int numPatients() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return "Queue";
	}

	@Override
	public String allPatientInfo() {
		// TODO Auto-generated method stub
		String ans = "";
		for(Object single : list) {
			ans += single.toString() + "\n";
		}
		return ans;
	}

}
