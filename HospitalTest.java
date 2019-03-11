import org.junit.Test;
import junit.framework.Assert;

public class HospitalTest {

	
	@Test
	public void StackHospitalAnimalTest() {
	StackHospital<Animal> AStack = new StackHospital<Animal>();
	
	Animal a = new Animal("cat", 13);
	Animal b = new Animal("dog", 10);
	
	AStack.addPatient(a);
	Assert.assertEquals("Did not correctly add patient",  "A 13-year old cat.", AStack.allPatientInfo());
	Assert.assertEquals("Wrong next patient",  a, AStack.nextPatient());
	
	AStack.addPatient(b);
	Assert.assertEquals("Did not correctly add patient", "A 10-year old dog." + "A 13-year old cat.", AStack.allPatientInfo());
	Assert.assertEquals("Wrong next patient",  b, AStack.nextPatient());
	Assert.assertEquals("Wrong number of patients", 2, AStack.numPatients());

	AStack.treatNextPatient();
	Assert.assertEquals("Didn't remove patient", 1, AStack.numPatients());
	
	Assert.assertEquals("Wrong hospital type", "StackHospital", AStack.hospitalType());
	}
	
	@Test
	public void StackHospitalPersonTest() {
		StackHospital<Person> PStack = new StackHospital<Person>();
		
		Person a = new HealthyPerson("Anne", 40, "therapy");
		Person b = new HealthyPerson("Betty", 88, "visit");
		Person c = new SickPerson("Candi", 12, 2);
		Person d = new SickPerson("Dillon", 17, 5);
		
		PStack.addPatient(a);
		PStack.addPatient(b);
		PStack.addPatient(c);
		PStack.addPatient(d);
		Assert.assertEquals("Did not correctly add patients",  d.toString() 
				+ c.toString() + b.toString() + a.toString(), PStack.allPatientInfo());
		
		Assert.assertEquals("Wrong next patient",  d, PStack.nextPatient());
		Assert.assertEquals("Wrong number of patients", 4, PStack.numPatients());
		
		PStack.treatNextPatient();
		Assert.assertEquals("Didn't remove patient", 3, PStack.numPatients());
		
		Assert.assertEquals("Wrong hospital type", "StackHospital", PStack.hospitalType());
		}
	
	@Test
	public void QueueHospitalAnimalTest() {
		QueueHospital<Animal> AQueue = new QueueHospital<Animal>();
		
		Animal a = new Animal("cat", 13);
		Animal b = new Animal("dog", 10);
		
		AQueue.addPatient(a);
		Assert.assertEquals("Did not correctly add patient",  "A 13-year old cat.", AQueue.allPatientInfo());
		Assert.assertEquals("Wrong next patient",  a, AQueue.nextPatient());
		
		AQueue.addPatient(b);
		Assert.assertEquals("Did not correctly add patient", "A 13-year old cat." + "A 10-year old dog.", AQueue.allPatientInfo());
		Assert.assertEquals("Wrong next patient",  a, AQueue.nextPatient());
		Assert.assertEquals("Wrong number of patients", 2, AQueue.numPatients());
		AQueue.treatNextPatient();
		Assert.assertEquals("Didn't remove patient", 1, AQueue.numPatients());
		
		Assert.assertEquals("Wrong hospital type", "QueueHospital", AQueue.hospitalType());
		
	}
	
	@Test
	public void QueueHospitalPersonTest() {
		QueueHospital<Person> PQueue = new QueueHospital<Person>();
		
		Person a = new HealthyPerson("Anne", 40, "therapy");
		Person b = new HealthyPerson("Betty", 88, "visit");
		Person c = new SickPerson("Candi", 12, 2);
		Person d = new SickPerson("Dillon", 17, 5);
		
		PQueue.addPatient(a);
		PQueue.addPatient(b);
		PQueue.addPatient(c);
		PQueue.addPatient(d);
		Assert.assertEquals("Did not correctly add patients",  a.toString() 
				+ b.toString() + c.toString() + d.toString(), PQueue.allPatientInfo());
		
		Assert.assertEquals("Wrong next patient",  a, PQueue.nextPatient());
		Assert.assertEquals("Wrong number of patients", 4, PQueue.numPatients());
		
		PQueue.treatNextPatient();
		Assert.assertEquals("Didn't remove patient", 3, PQueue.numPatients());
		
		Assert.assertEquals("Wrong hospital type", "QueueHospital", PQueue.hospitalType());
		}
	
	@Test
	public void PriorityQueueHospitalAnimalTest() {
		PriorityQueueHospital<Animal> APQueue = new PriorityQueueHospital<Animal>();
		
		Animal a = new Animal("cat", 13);
		Animal b = new Animal("dog", 10);
		
		APQueue.addPatient(a);
		Assert.assertEquals("Did not correctly add patient",  "A 13-year old cat.", APQueue.allPatientInfo());
		Assert.assertEquals("Wrong next patient",  a, APQueue.nextPatient());
		
		APQueue.addPatient(b);
		Assert.assertEquals("Did not correctly add patient", "A 13-year old cat." + "A 10-year old dog.", APQueue.allPatientInfo());
		Assert.assertEquals("Wrong next patient",  a, APQueue.nextPatient());
		Assert.assertEquals("Wrong number of patients", 2, APQueue.numPatients());

		APQueue.treatNextPatient();
		Assert.assertEquals("Didn't remove patient", 1, APQueue.numPatients());
		
		Assert.assertEquals("Wrong hospital type", "PriorityQueueHospital", APQueue.hospitalType());	
	}
	
	@Test
	public void PriorityQueueHospitalPersonTest() {
		PriorityQueueHospital<Person> PPQueue = new PriorityQueueHospital<Person>();
		
		Person a = new HealthyPerson("Anne", 40, "therapy");
		Person b = new HealthyPerson("Betty", 88, "visit");
		Person c = new SickPerson("Candi", 12, 2);
		Person d = new SickPerson("Dillon", 17, 5);
		
		PPQueue.addPatient(a);
		PPQueue.addPatient(b);
		PPQueue.addPatient(c);
		PPQueue.addPatient(d);
		Assert.assertEquals("Did not correctly add patients",  a.toString() 
				+ b.toString() + d.toString() + c.toString(), PPQueue.allPatientInfo());
		
		Assert.assertEquals("Wrong next patient",  a, PPQueue.nextPatient());
		Assert.assertEquals("Wrong number of patients", 4, PPQueue.numPatients());
		
		PPQueue.treatNextPatient();
		Assert.assertEquals("Didn't remove patient", 3, PPQueue.numPatients());
		
		Assert.assertEquals("Wrong hospital type", "PriorityQueueHospital", PPQueue.hospitalType());
		}

}
