
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.IOException;
import java.io.Serializable;

public class Account extends deposit_withdraw implements Serializable {

	Scanner scanner = new Scanner(System.in);
	HashMap<Integer, Integer> p = new HashMap<Integer, Integer>();
	DecimalFormat d = new DecimalFormat("'$'###,##0.00");

	public void log() throws IOException {
		int x = 1;

		do {

			try {

				System.out.println("welcom \n");
                if(p.isEmpty())
				{
					 
					System.out.println("Create your Atm Account  ");
					System.out.println(" id");
					int id=scanner.nextInt();
					System.out.println("passowrd");
					int passowrd=scanner.nextInt();
					p.put(id, passowrd);
					

					getAcounttype();
				}
				 
			 
                 else{
					System.out.println("enter your id \n");
					SetCustemernumber(s.nextInt());
					System.out.println("Enter your passowrd \n ");
					setIp(s.nextInt());
				 }
				 
			 

			} catch (Exception e) {
				System.out.println("invalid inpute\n");
				x = 2;
			}
           
			if(p!=null)
			{
				for (Entry<Integer, Integer> entry : p.entrySet()) {
					if (entry.getKey() == getcustemer() && entry.getValue() == getip()) {
						getAcounttype();
					}
	
				}
			}
			 

			System.out.println("invalid inpute\n");
		}

		while (x == 1);

	}

	public void getAcounttype() throws IOException {
		System.out.println("please choose one option below \n");
		System.out.println("1- checking");
		System.out.println("2- deposite");
		System.out.println("3- withdraw");
		System.out.println("4- delete your account");
		System.out.println("5- exite");

		select = s.nextInt();

		switch (select) {
		case 1:
			getChecking();
			break;

		case 2:
			getdepose();
			break;
		case 3:
			getwithdraw();
          break;
		  case 4: delete();
		       System.out.println("your account is deleted");  log(); 
			   break;
		case 5:
			System.out.println("exited");
			break;
		default:
			System.out.println("invalide inpute");
			getAcounttype();
		}

	}

	public void getChecking() throws IOException {

		System.out.println("your balance is " + d.format(get_checking_balance()));
		getAcounttype();

	}

	public void getdepose() throws IOException {
		System.out.println("please choose one option below in checking");
		System.out.println("1-show my acount");
		System.out.println("2- deposite");
		System.out.println("3- Exite");

		select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("your amount of money is :" + d.format(get_checking_balance()));
			getAcounttype();
			break;
		case 2:
			getchekingdeposinput();
			getAcounttype();
			break;

		case 3:
			System.out.println("exited");

			break;
		}
	}

	public void getwithdraw() throws IOException {
		System.out.println("please choose one option below in checking");
		System.out.println("1-show my acount");
		System.out.println("2- withdraw fund");
		System.out.println("3- Exite");

		select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("your amount of money is :" + d.format(get_checking_balance()));
			getAcounttype();
			break;
		case 2:
			checking_withdraw();
			getAcounttype();
			break;
		case 3:
			System.out.println("exited");

			break;
		}
	}
	public void delete()
	{
		p.clear();
	}

	private int select;

}
