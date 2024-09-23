package employeesalary;

public class Hra extends Basic {

	public void hra() {
		int a = basicpay*5/100;
		int b = basicpay*20/100;
		hra = a;
		pf = b;
		System.out.println("HRA "+ a +" PF "+ b );
	}

}
