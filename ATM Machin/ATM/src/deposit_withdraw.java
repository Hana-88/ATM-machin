
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class deposit_withdraw    {

	Scanner s = new Scanner(System.in);
	HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	DecimalFormat f = new DecimalFormat("'$'###,##0.00");

	// get customer
	public int getcustemer() {
		return custemer;
	}

	// set customer
	public void SetCustemernumber(int custemer) {
		this.custemer = custemer;
	}

	// get ip

	public int getip() {
		return ip;
	}

	// set ip
	public void setIp(int ip) {
		this.ip = ip;
	}

	// withdraw in checking
	public void checking_withdraw() {
		System.out.println("your amount of money is :" + f.format(chek));
		System.out.println("how much money you want to withdraw ");

		 double amount = s.nextDouble();
		if (chek - amount >= 0) {
			chekwithdraw(amount);
			System.out.println("your amount of money after withdraw is " + f.format(chek));
		} else {
			System.out.println("your acount  cant be negative");
		}
	}

	// get checking depose
	public void getchekingdeposinput() {
		System.out.println("your amount of money is :" + f.format(chek));
		System.out.println("how much money you want to deposit ");

		  double amount = s.nextDouble();

		chekdepos(amount);
		System.out.println("your amount of money is " + f.format(chek));

	}

	// clculate depose in check
	public double chekdepos(double amount) {
		chek = chek + amount;
		return chek;
	}

	// calculate withdraw in checking

	public double chekwithdraw(double amount) {
		chek = chek - amount;
		return chek;
	}

	 

	public double get_checking_balance() {
		return chek;
	}
 

	private int custemer;
	 
	private int ip;
	private double chek = 0;
 
}
