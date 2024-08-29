package guvi;

import java.util.Scanner;

public class gradingSystem {

	public static void main(String[] args) {
		// que 5 grading 
     Scanner mn = new Scanner(System.in);
     System.out.println("Enter the student mark :   ");
     
     int n = mn.nextInt();
     System.out.println(n);
     
   
	if(n==100) {
    	 System.out.println("S grade");
     }else if (n>=90 && n<=99) {
    	 System.out.println("A grade");
     }else if (n>=80 && n<=89) {
    	 System.out.println("B grade");
     }else if (n>=70 && n<=79) {
       System.out.println("C grade");
	}else if (n>=60 && n<=69)
		System.out.println("D grade");
	else if (n>=50 && n<=59)
		System.out.println("E grade");
	else if (n<=50)
		System.out.println("F");

}}
