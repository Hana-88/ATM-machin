 

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class account {

	Scanner s=new Scanner(System.in);
	HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
	 DecimalFormat f=new DecimalFormat("'$'###,##0.00");
	public int getcustemer()
	{
		return custemer;
	}
	 public void SetCustemernumber(int custemer)
	 {
		this.custemer=custemer; 
	 }

		public int getip()
		{
			return ip;
		}
	 public void setIp(int ip)
	 {
		 this.ip=ip;
	 }
	 
	 
	 public double calckchekdepos(double amount)
	 {
		 chek=chek+amount;
        return chek;
	 }
	 public double calcsavdepos(double amount)
	 {
		 sav=sav+amount;
        return sav;
	 }
	 public void getchekingdeposinput()
	 {
		System.out.println("chekar :"+f.format(chek)) ;
		System.out.println("brakai chan we");
		
		double amount=s.nextDouble();
		
		calckchekdepos(amount);
		System.out.println("cheka tazakat brytya la"+f.format(chek));
	 
	 }
	 public void getsavingdeposinput()
	 {
		System.out.println("chekar :"+f.format(sav)) ;
		System.out.println("brakai chan we");
		
		double amount=s.nextDouble();
		
		calckchekdepos(amount);
		System.out.println("cheka tazakat brytya la"+f.format(sav));
	 
	 }
	 
	 public double calckchekwithdraw(double amount)
	 {
		 chek=chek-amount;
		 return chek;
	 }
	 public double calcksavwithdraw(double amount)
	 {
		 sav=sav-amount;
		 return sav;
	 }
	 public void getCheckingwithdrawinput()
	 {
		System.out.println("chekar :"+f.format(chek)) ;
		System.out.println("brakai chan we");
		
		double amount=s.nextDouble();
		if(chek-amount>=0)
		{
		calckchekwithdraw(amount);
		System.out.println("cheka tazakat brytya la"+f.format(chek));
		}
		else
		{
			System.out.println("negativa nabet");
		}
	 }
	 public void getsavinggwithdrawinput()
	 {
		System.out.println("chekar :"+f.format(sav)) ;
		System.out.println("brakai chan be");
		
		double amount=s.nextDouble();
		if(sav-amount>=0)
		{
		calcksavwithdraw(amount);
		System.out.println("cheka tazakat brytya la"+f.format(sav));
		}
		else
		{
			System.out.println("negativa nabet");
		}
	 }
	 public double getchekingbalance()
	 {
		 return chek;
	 }
	 public double getsavingbalance()
	 {
		 return sav;
	 }
	 
	 private int custemer;
private int ip;
private double chek=0;
private double sav=0;
}
