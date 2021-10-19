
///classi bank
 

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.IOException;
 


public class bank extends account implements kar{

	Scanner s=new Scanner(System.in);
	HashMap<Integer,Integer> p=new HashMap<Integer,Integer>();
	 DecimalFormat d=new DecimalFormat("'$'###,##0.00");

	 public void log() throws IOException
	 {
		 int x=1;
		 
		 do 
		 {
			 
			 try
			 {
				 p.put(80, 55);
				 p.put(88, 9111);
				 p.put(90, 96);
				 System.out.println("welcom \n");
				 System.out.println("Enter customer id \n");
				 SetCustemernumber(s.nextInt());
				 System.out.println("Enter passowrd \n ");
				 setIp(s.nextInt());
				 
			 }
			 catch(Exception e)
			 {
				 System.out.println("halai bram\n");	 
			 x=2;
			 }
			 
			 for (Entry<Integer,Integer> entry:p.entrySet())
			 {
				 if(entry.getKey()==getcustemer()&&entry.getValue()==getip())
				 {
					 getAcounttype();
				 }
			 
			 }
			 
			 System.out.println("invalid inpute\n");
			 }
		 
	  while(x==1);
	 
}
	 
	 public void getAcounttype()
	 {
		 System.out.println("hal bzhera");
		 System.out.println("1- checking");
		 System.out.println("2- saving");
		 System.out.println("3- Exit");
		 
		 System.out.println("choice :");
		 
		 select=s.nextInt();
		 
		 switch(select)
		 {
		 case 1:getChecking();
		 break;
			 
		 case 2:getSaving();
		 break;
			 
		 case 3: 
			 System.out.println("spas");
			break; 
		  default :
			  System.out.println("invalide inpute");
			  getAcounttype();  
		 }
		 
		 
	 }
	 
	 public void getSaving()
	 {
		 System.out.println("check bka");
		 System.out.println("1- balancakam pishanba");
		 System.out.println("2- withdraw fund");
		 System.out.println("3- despose");
		 System.out.println("Exite");
		 System.out.println("choise");
		 
		 select=s.nextInt();
		 switch(select)
		 {
		 case 1:System.out.println("parakat awandaya :"+d.format(getsavingbalance()));
		 getAcounttype();
		 break; 
		 case 2: getsavinggwithdrawinput();
		 getAcounttype();
			 break;
		 case 3:getsavingdeposinput();
		 getAcounttype();
			 break;
		 case 4:System.out.println("spas bo bakar henant");
		   break;
		   default :System.out.println("invalide number");
		   getSaving();
		 	 }
	 }
	 
	 public void getChecking()
	 {
		 System.out.println("check bka");
		 System.out.println("1- balancakam pishanba");
		 System.out.println("2- withdraw fund");
		 System.out.println("3- despose");
		 System.out.println("Exite");
		 System.out.println("bchoisena");
		 
		 select=s.nextInt();
		 switch(select)
		 {
		 case 1:System.out.println("bry parakat :"+d.format(getchekingbalance()));
		 getAcounttype();
		 break; 
		 case 2: getCheckingwithdrawinput();
		 getAcounttype();
			 break;
		 case 3:getchekingdeposinput();
		 getAcounttype();
			 break;
		 case 4:System.out.println("spas bo bakarhenant");
		 
			 break;
		 	 }
	 }
	  		 
			 
			 
private int select;			 
		  
	 }