package employeesalary;

public class Total_Salary extends Hra {

	public void total() {
		int ts = basicpay + hra - pf - deduction + bonus;
		System.out.println("Total Salary = " +ts);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Total_Salary s = new Total_Salary();
		s.console();
		s.hra();
		s.total();
	}

}
