package lesson4classes;

public class Classexample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int[] y = new int[5];

		Student st = new Student();
		Student st2 = new Student();
		
		st.age = 16;
		st.fullName = "Petrov Petr";
		
		st2.age = 17;
		st2.fullName = "Ivanova Kate";
		
		Student st3 = st2;
		st3.age = 18;
		st2.age = 19;
		
		st2.isHungry = true;
		
		Mother mother = new Mother ();
		mother.feedStudent(st2);
		
		Granny granny = new Granny ();
		granny.presentMoney(st3);
		
		Deanery deanery = new Deanery ();
		deanery.assignRating(st3);

		System.out.println();

	}

}
