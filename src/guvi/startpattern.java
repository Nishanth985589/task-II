package guvi;

public class startpattern {

	public static void main(String[] args) {
		// star pattern
		int f = 8;
		
		for(int i = 0;i<f;i++)
		{
		for(int j = 0;j<f;j++)
		{
			if(i==j || f==(i+j+1))
			System.out.print("*");
			else
			System.out.print(" ");
		}
   System.out.println();
	}}}