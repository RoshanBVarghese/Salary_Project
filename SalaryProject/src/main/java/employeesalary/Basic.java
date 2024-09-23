package employeesalary;

public class Basic {

	int basicpay = 500;
	int deduction = 20;
	int bonus = 200;
	int hra;
	int pf;
	public void console() {
		int x = basicpay;
		int y = deduction;
		int z = bonus;
		System.out.println("Basic_Pay = "+ x +" Deduction = "+ y +" Bonus = "+ z);
	}
}
