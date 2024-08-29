package guvi;

import java.util.Scanner;

public class hotelTariff {

	public static <of> void main(String[] args) 
		// que 6 hotel tariff
		{	
	  Scanner nm = new Scanner(System.in);
       int month;
       char rmt;
       int jandays=0; int jantotal=0;
       int febdays=0; int febtotal=0;
       int mardays=0; int martotal=0;
       int aprdays=0; int aprtotal=0;
       int maydays=0; int maytotal=0;
       int jundays=0; int juntotal=0;
       int juldays=0; int jultotal=0;
       int augdays=0; int augtotal=0;
       int sepdays=0; int septotal=0;
       int octdays=0; int octtotal=0;
       int novdays=0; int novtotal=0;
       int decdays=0; int dectotal=0;
       int pay=0;
            
       do      
       {
       System.out.println("1.   January    RS1500");
       System.out.println("2.   February   RS1500");
       System.out.println("3.   March      RS1500");
       System.out.println("4.   April      RS1800");
       System.out.println("5.   May        RS1800");
       System.out.println("6.   June       RS1800");
  	   System.out.println("7.   July       RS1500");
  	   System.out.println("8.   August     RS1500");
  	   System.out.println("9.   September  RS1500");
  	   System.out.println("10.  October    RS1500");
  	   System.out.println("11.  November   RS1800");
  	   System.out.println("12.  Decembern  RS1800");
  	   System.out.println("Choose your month of stay");
  	   month = nm.nextInt();
       
       switch(month)
       {
       case 1:
    	    System.out.println("Enter the total no.of stays:  ");
    	    jandays=nm.nextInt();
    	    jantotal=jandays*1500;
    	    pay=pay+jantotal;
    	break;
    	
       case 2:
   	    System.out.println("Enter the total no.of stays:  ");
   	    febdays=nm.nextInt();
   	    febtotal=febdays*1500;
   	    pay=pay+febtotal;
   	break;
       case 3:
   	    System.out.println("Enter the total no.of stays:  ");
   	    mardays=nm.nextInt();
   	    martotal=mardays*1500;
   	    pay=pay+martotal;
   	break;
       case 4:
   	    System.out.println("Enter the total no.of stays:  ");
   	    aprdays=nm.nextInt();
   	    aprtotal=aprdays*1800;
   	    pay=pay+aprtotal;
   	break;
       case 5:
   	    System.out.println("Enter the total no.of stays:  ");
   	    maydays=nm.nextInt();
   	    maytotal=maydays*1800;
   	    pay=pay+maytotal;
   	break;
       case 6:
   	    System.out.println("Enter the total no.of stays:  ");
   	    jundays=nm.nextInt();
   	    juntotal=jundays*1800;
   	    pay=pay+juntotal;
   	break;
       case 7:
   	    System.out.println("Enter the total no.of stays:  ");
   	    juldays=nm.nextInt();
   	    jultotal=juldays*1500;
   	    pay=pay+jultotal;
   	break;   	
       case 8:
   	    System.out.println("Enter the total no.of stays:  ");
   	    augdays=nm.nextInt();
   	    augtotal=augdays*1500;
   	    pay=pay+augtotal;
   	break;
       case 9:
   	    System.out.println("Enter the total no.of stays:  ");
   	    sepdays=nm.nextInt();
   	    septotal=sepdays*1500;
   	    pay=pay+septotal;
   	break;
       case 10:
   	    System.out.println("Enter the total no.of stays:  ");
   	    octdays=nm.nextInt();
   	    octtotal=octdays*1500;
   	    pay=pay+octtotal;
   	break;
       case 11:
   	    System.out.println("Enter the total no.of stays:  ");
   	    novdays=nm.nextInt();
   	    novtotal=novdays*1800;
   	    pay=pay+novtotal;
   	break;
       case 12:
   	    System.out.println("Enter the total no.of stays:  ");
   	    decdays=nm.nextInt();
   	    dectotal=decdays*1800;
   	    pay=pay+dectotal;
       
   	break;
   	default:
       
   		System.out.println("You entered wrong details");
       }
       System.out.println("Do u want to continue(Y/N)");
   		rmt=nm.next().charAt(0);
       }
       while (rmt=='Y'|| rmt=='N');
         			    
   		System.out.println("-------------------");
   		System.out.println("Month of stay\t days\t price\t total");
       
       if(jandays>0)
       
    	System.out.println("January\t"+jandays+"\t1500\t"+jantotal);
       if(febdays>0)
    	System.out.println("February\t"+febdays+"\t1500\t"+febtotal);
       if(mardays>0)
       	System.out.println("March\t"+mardays+"\t1500\t"+martotal);
       if(aprdays>0)
       	System.out.println("April\t"+aprdays+"\t1800\t"+aprtotal);
       if(maydays>0)
       	System.out.println("May\t"+maydays+"\t1800\t"+maytotal);
       if(jundays>0)
       	System.out.println("June\t"+jundays+"\t1800\t"+juntotal);
       if(juldays>0)
       	System.out.println("July\t"+juldays+"\t1500\t"+jultotal);
       if(sepdays>0)
       	System.out.println("September\t"+sepdays+"\t1500\t"+septotal);
       if(octdays>0)
       	System.out.println("October\t"+octdays+"\t1500\t"+octtotal);
       if(novdays>0)
       	System.out.println("November\t"+novdays+"\t1500\t"+novtotal);
       if(decdays>0)
       	System.out.println("December\t"+decdays+"\t1500\t"+dectotal);
       
       System.out.println("-----------------------------------------");
       System.out.println("Payable price is\t\t\t" + pay);
       System.out.println("\t\t\tThanks for visit\n\t\t   Have a nice day.......");
       
       }}
       


