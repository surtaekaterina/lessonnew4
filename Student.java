package lesson4classes;

public class Student {
	int age;
	String fullName;

	boolean isHungry;
	int money;
	float rating;
	
	//конструктор, особый вид метода, вызывается ровно один раз, для инициальзации. к ним можно применить перегрузку
	public Student() {
		
		this.age = 18;
		this.isHungry = true;
		this.money = 5;
		
	}
	
	public Student(int age, String fullName, int money, float rating) {
		this.age = age;
		this.fullName = fullName;
		this.money = money;
		this.isHungry = true;
		this.rating = rating;
		
		
	}

	public void spendMoney() {
		if (money > 0) {
			money = money - 2;
		}
	}

}
