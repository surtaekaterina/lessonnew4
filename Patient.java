package lesson4classes;

public class Patient {

	int id;
	String fio;
	String adress;
	String phoneNumber;
	int medCardNumber;
	String diagnoz;

	public Patient() {

	}

	public Patient(int id, String fio, String adress, String phoneNumber, int medCardNumber, String diagnoz) {
		this.id = 1;
		this.fio = fio;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.medCardNumber = medCardNumber;
		this.diagnoz = diagnoz;

	}
}
