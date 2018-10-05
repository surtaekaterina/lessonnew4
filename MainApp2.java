package lesson4classes;

public class MainApp2 {

	
	@SuppressWarnings("unused")
	//Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
	//карты, Диагноз.
	public static void main(String[] args) {
	 
		/*int[] arr = new int[5];
		
		Patient[] arr2 = new Patient[5];
		
		arr2[0] = new Patient(2,"KUKUSHKIN", "adress2", "45676", 34, "ill2");
		arr2[1] = new Patient(2,"dudukin", "adress3", "4567", 66, "ill3");
		arr2[2] = new Patient();
		arr2[3] = new Patient();
		arr2[4] = new Patient();*/
		
		Patient ill = new Patient();
		Patient ill2 = new Patient();
		Patient ill3 = new Patient(2,"KUKUSHKIN", "adress2", "45676", 34, "ill2");
		Patient ill4 = new Patient(2,"lolo", "adress3", "45676", 34, "ill12");
		Patient ill5 = new Patient(2,"pipi", "adress4", "45676", 34, "ill2");
		Patient ill6 = new Patient(2,"gege", "adress6", "45676", 77, "ill6");
		Patient ill7 = new Patient(2,"haha", "adress5", "45676", 88, "ill6");
		Patient ill8 = new Patient(2,"yeye", "adress7", "45676", 99, "ill7");
		Patient ill9 = new Patient(2,"dudu", "adress8", "45676", 90, "ill8");
		
		System.out.println(ill3.fio);
		
		
		
		Reception recept = new Reception();
		recept.patients[0] = ill;
		recept.patients[1] = ill2;
		recept.patients[2] = ill3;
		recept.patients[3] = ill4;
		recept.patients[4] = ill5;
		recept.patients[5] = ill6;
		recept.patients[6] = ill7;
		recept.patients[7] = ill8;
		recept.patients[8] = ill9;
		
		
		
		System.out.println(recept.patients[2].fio);
		//printPatientInfo(patients);
		
		//public void findDiagnoz("ill2") {
			
		//}
		
		//public void printPatientInfo(Patient[] patients) {
			//for(int i = 0; i < patients.length; i++) {
				//if(patients[i] != null) {
					//System.out.println("id" + patients[i].id);
				//}
			//}
		}
		
	}
//	
		/*Student st3 = new Student (19, "Petrov Petr", 25, 8.9f);
		System.out.println();
		System.out.println();
	}

}*/
